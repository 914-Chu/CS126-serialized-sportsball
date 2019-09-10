import java.util.*;

public class Game {

    private Teams homeTeam;
    private Teams awayTeam;
    private String winner;
    private List<Goals> goals;

    public Teams getHomeTeam() {
        return homeTeam;
    }

    public Teams getAwayTeam() {
        return awayTeam;
    }

    public String getWinner() {
        return winner;
    }

    public List<Goals> getGoals() {
        return goals;
    }

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

        private String teamName;
        private int timestamp;
        private String scorer;
        private String assist;
        private List<Passes> passes;

        public String getTeamName() {
            return teamName;
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

    public List<Integer> goalsInCertainTime(List<Goals> goalsList, int currentTime) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < goalsList.size(); i ++) {

            int timestamp = goalsList.get(i).getTimestamp();

            if(timestamp <= currentTime) {
                result.add(timestamp);
            }
        }

        return result;
    }

    public List<Integer> goalsWithoutAssist(List<Goals> goalsList) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < goalsList.size(); i ++) {

            String assist = goalsList.get(i).getAssist();
            int timestamp = goalsList.get(i).getTimestamp();

            if(assist == null) {
                result.add(timestamp);
            }
        }

        return result;
    }

    public Map<Integer, List<String>> goalsDetail(List<Goals> goalsList) {

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

        return result;
    }
}

