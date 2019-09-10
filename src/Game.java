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

    /**
     *  functions
     */

    public void goalsInCertainTime(int currentTime) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < goals.size(); i ++) {

            int timestamp = goals.get(i).getTimestamp();

            if(timestamp <= currentTime) {
                result.add(timestamp);
            }
        }

        System.out.println("Goals before " + currentTime + ":");
        System.out.println(result);
    }

    public void goalsWithoutAssist() {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < goals.size(); i ++) {

            String assist = goals.get(i).getAssist();
            int timestamp = goals.get(i).getTimestamp();

            if(assist == null) {
                result.add(timestamp);
            }
        }

        System.out.println("Goals by single player: ");
        System.out.println(result);
    }

    public void goalsDetail() {

        Map<Integer, List<String>> result = new TreeMap<>();

        for(int i = 0; i < goals.size(); i ++) {

            List<String> temp = new ArrayList<>();
            int timestamp = goals.get(i).getTimestamp();
            String scorer = goals.get(i).getScorer();
            String assist = goals.get(i).getAssist();
            temp.add(scorer);
            temp.add(assist);

            result.put(timestamp, temp);
        }

        for (Map.Entry<Integer, List<String>> entry : result.entrySet()) {
            System.out.println(String.format("Timestamp:%3s Scorer: %-15s  Assist: %3s" , entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
        }
    }

    public void playerStats(String player) {

        int receive = receiveCount(player);
        int pass = passCount(player);
        int score = scoreCount(player);
        int assist = assistCount(player);

        System.out.println(player + ":\n" +
                           "receive: " + receive +
                           "\npass: " + pass +
                           "\nscore: " + score +
                           "\nassist: " + assist);
    }

    public void passesPerGoal(int timestamp) {

        int result = 0;

        for(Goals g : goals) {
            if (g.getTimestamp() == timestamp) {

                result = g.getPassesList().size();
            }
        }
        System.out.println(result + " passes at timestamp " + timestamp);
    }

    public void teamStats(String team) {

        int pass = 0;
        int goal = 0;

        for(Goals g : goals) {

            if(g.getTeamName().equals(team)) {

                pass += g.getPassesList().size();
                goal ++;
            }
        }

        System.out.println("Team: " + team +
                           "\nTotal goals: " + goal +
                           "\nTotal passes: " + pass);
    }

    public void ageStats(String team) {

        int total = 0;
        int min, max;


    }

    private int receiveCount(String player) {

        int result = 0;
        for(Goals goal : goals) {

            for(Passes pass : goal.getPassesList()) {

                if(pass.getReceiver().equals(player)) {

                    result++;
                }
            }
        }

        return result;
    }

    private int passCount(String player) {

        int result = 0;
        for(Goals goal : goals) {

            for(Passes pass : goal.getPassesList()) {

                if(pass.getPasser().equals(player)) {

                    result++;
                }
            }
        }

        return result;
    }

    private int scoreCount(String player) {

        int result = 0;
        for(Goals goal : goals) {

            if(goal.getScorer().equals(player)) {

                result++;
            }
        }

        return result;
    }

    private int assistCount(String player) {

        int result = 0;
        for(Goals goal : goals) {

            if(goal.getAssist() != null && goal.getAssist().equals(player)) {

                result++;
            }
        }

        return result;
    }

}
