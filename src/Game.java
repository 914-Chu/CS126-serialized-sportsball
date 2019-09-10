import java.util.*;

public class Game {

    private Teams homeTeam;
    private Teams awayTeam;
    private String winner;
    private List<Goals> goals;

    public Teams getHomeTeam() { return homeTeam; }

    public Teams getAwayTeam() { return awayTeam; }

    public String getWinner() { return winner; }

    public List<Goals> getGoals() { return goals; }

    public class Teams {

        private String name;
        private List<Player> players;

        public String getTeamName() {
            return name;
        }

        public List<Player> getPlayerList() {
            return players;
        }

        public class Player {

            private String name;
            private int age;
            private int jerseyNumber;
            private String position;
            private String hometown;

            public String getPlayerName() {
                return name;
            }

            public int getPlayerAge() {
                return age;
            }

            public int getPlayerJerseyNumber() {
                return jerseyNumber;
            }

            public String getPlayerPosition() {
                return position;
            }

            public String getPlayerHometown() {
                return hometown;
            }
        }
    }

    public class Goals {

        private String team;
        private int timestamp;
        private String scorer;
        private String assist;
        private List<Passes> passes;

        public String getTeamName() {
            return team;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public String getScorer() {
            return scorer;
        }

        public String getAssist() {
            return assist;
        }

        public List<Passes> getPassesList() {
            return passes;
        }

        public class Passes {

            private String passer;
            private String receiver;

            public String getPasser() {
                return passer;
            }

            public String getReceiver() {
                return receiver;
            }
        }
    }
    /**
     *  filtering functions
     */

    public void goalsInCertainTime(List<Goals> goalsList, int currentTime) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < goalsList.size(); i ++) {

            int timestamp = goalsList.get(i).getTimestamp();

            if(timestamp <= currentTime) {
                result.add(timestamp);
            }
        }

        System.out.println("Goals before " + currentTime + ":");
        System.out.println(result);
    }

    public void goalsWithoutAssist(List<Goals> goalsList) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < goalsList.size(); i ++) {

            String assist = goalsList.get(i).getAssist();
            int timestamp = goalsList.get(i).getTimestamp();

            if(assist == null) {
                result.add(timestamp);
            }
        }

        System.out.println("Goals by single player: ");
        System.out.println(result);
    }

    public void goalsDetail(List<Goals> goalsList) {

        Map<Integer, List<String>> result = new TreeMap<>();

        for(int i = 0; i < goalsList.size(); i ++) {

            List<String> temp = new ArrayList<>();
            int timestamp = goalsList.get(i).getTimestamp();
            String scorer = goalsList.get(i).getScorer();
            String assist = goalsList.get(i).getAssist();
            temp.add(scorer);
            temp.add(assist);

            result.put(timestamp, temp);
        }

        for (Map.Entry<Integer, List<String>> entry : result.entrySet()) {
            System.out.println(String.format("Timestamp:%3s Scorer: %-15s  Assist: %3s" , entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
        }
    }

    public void playerStats(List<Goals> goalsList, String player) {

        int receive = receiveCount(goalsList, player);
        int pass = passCount(goalsList, player);
        int score = scoreCount(goalsList, player);
        int assist = assistCount(goalsList, player);

        System.out.println(player + ":\n" +
                           "receive: " + receive +
                           "\npass: " + pass +
                           "\nscore: " + score +
                           "\nassist: " + assist);
    }

    public void passesPerGoal(List<Goals> goalsList, int timestamp) {

        int result = 0;

        for(Goals g : goalsList) {
            if (g.getTimestamp() == timestamp) {

                result = g.getPassesList().size();
            }
        }
        System.out.println(result + " passes at timestamp " + timestamp);
    }

    public void teamStats(List<Goals> goalsList, String team) {

        int pass = 0;
        int goal = 0;

        for(Game.Goals g : goalsList) {

            if(g.getTeamName().equals(team)) {

                pass += g.getPassesList().size();
                goal ++;
            }
        }

        System.out.println("Team: " + team +
                           "\nTotal goals: " + goal +
                           "\nTotal passes: " + pass);
    }

    public void ageStats(List<Goals> goalsList, String team) {

        int total = 0;
        int min, max;


    }

    private int receiveCount(List<Goals> goalsList, String player) {

        int result = 0;
        for(Game.Goals goal : goalsList) {

            for(Game.Goals.Passes pass : goal.getPassesList()) {

                if(pass.getReceiver().equals(player)) {

                    result++;
                }
            }
        }

        return result;
    }

    private int passCount(List<Goals> goalsList, String player) {

        int result = 0;
        for(Game.Goals goal : goalsList) {

            for(Game.Goals.Passes pass : goal.getPassesList()) {

                if(pass.getPasser().equals(player)) {

                    result++;
                }
            }
        }

        return result;
    }

    private int scoreCount(List<Goals> goalsList, String player) {

        int result = 0;
        for(Game.Goals goal : goalsList) {

            if(goal.getScorer().equals(player)) {

                result++;
            }
        }

        return result;
    }

    private int assistCount(List<Goals> goalsList, String player) {

        int result = 0;
        for(Game.Goals goal : goalsList) {

            if(goal.getAssist() != null && goal.getAssist().equals(player)) {

                result++;
            }
        }

        return result;
    }

}
