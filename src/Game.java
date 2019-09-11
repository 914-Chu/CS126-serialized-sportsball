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


    // Filtering Functions

    public List<Integer> goalsInCertainTime(int currentTime) {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < goals.size(); i ++) {

            int timestamp = goals.get(i).getTimestamp();

            if(timestamp <= currentTime) {
                result.add(timestamp);
            }
        }
        return result;
    }

    public List<Integer> goalsWithoutAssist() {

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < goals.size(); i ++) {

            String assist = goals.get(i).getAssist();
            int timestamp = goals.get(i).getTimestamp();

            if(assist == null) {
                result.add(timestamp);
            }
        }
        return result;
    }

    public Map<Integer, List<String>> goalsDetail() {

        Map<Integer, List<String>> result = new TreeMap<>();

        for(int i = 0; i < goals.size(); i ++) {

            int timestamp = goals.get(i).getTimestamp();
            String scorer = goals.get(i).getScorer();
            String assist = goals.get(i).getAssist();
            List<String> temp = Arrays.asList(scorer, assist);

            result.put(timestamp, temp);
        }
        return result;
    }

    public List<String> positionList(Teams team, String position) {

        List<String> positionList = new ArrayList<>();
        for(Player player : team.getPlayerList()) {
            if(position.equals(player.getPlayerPosition())) {
                positionList.add(player.getPlayerName());
            }
        }
        return positionList;
    }

    // Analysis Functions

    public Map<String, Integer> playerStats(String player) {

        int receive = receiveCount(player);
        int pass = passCount(player);
        int score = scoreCount(player);
        int assist = assistCount(player);
        Map<String, Integer> result = new TreeMap<>();
        result.put("Receive", receive);
        result.put("Pass", pass);
        result.put("Score", score);
        result.put("Assist", assist);

        return result;
    }

    public int passesPerGoal(int timestamp) {

        int result = 0;

        for(Goals g : goals) {
            if (g.getTimestamp() == timestamp) {

                result = g.getPassesList().size();
            }
        }
        return result;
    }

    public int teamTotalGoals(Teams team) {

        int goal = 0;

        for(Goals g : goals) {
            if(g.getTeamName().equals(team.getTeamName())) {
                goal ++;
            }
        }
        return goal;
    }

    public Map<Integer, List<String>> rankByGoals() {

        Map<Integer, List<String>> rank = new TreeMap<>(Collections.reverseOrder());
        List<Player> allPlayer = new ArrayList<>();
        allPlayer.addAll(homeTeam.getPlayerList());
        allPlayer.addAll(awayTeam.getPlayerList());

        for(Player player : allPlayer) {

            String name = player.getPlayerName();
            int goals = scoreCount(name);
            if(rank.containsKey(goals)) {
                rank.get(goals).add(name);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(name);
                rank.put(goals, temp);
            }
        }
        return rank;
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
