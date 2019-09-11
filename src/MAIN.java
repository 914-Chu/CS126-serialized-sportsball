import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static void main(String[] args) {

        int TIMESTAMP = 16;
        String PLAYER = "Steven White";
        String POSITION = "Defender";
        String testFileContents = Data.getFileContents("test_resources", "sportsballtest");
        Gson gson = new Gson();
        Game game = gson.fromJson(testFileContents, Game.class);
        Teams TEAM = game.getHomeTeam();

        /**
         *  filtering functions
         */

        //List<Integer> result1 = game.goalsInCertainTime(TIMESTAMP);
        //System.out.println("Goals before " + TIMESTAMP + ":");
        //System.out.println(result1);

        //List<Integer> result2 = game.goalsWithoutAssist();
        //System.out.println("Goals by single player: ");
        //System.out.println(result2);

        //Map<Integer, List<String>> result3 = game.goalsDetail();
        //for (Map.Entry<Integer, List<String>> entry : result3.entrySet()) {
        //    System.out.println(String.format("Timestamp:%-3s Scorer: %-15s  Assist: %3s" , entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
        //}

        //List<String> result4 = game.positionList(TEAM, POSITION);
        //System.out.println(POSITION + ": " + result4);

        /**
         *  analysis functions
         */

        //Map<String, Integer> result5 = game.playerStats(PLAYER);
        //System.out.println("Stats for " + PLAYER + ":");
        //for (Map.Entry<String, Integer> entry : result5.entrySet()) {
        //    System.out.println(entry.getKey() + ": " + entry.getValue());
        //}

        //int result6 = game.passesPerGoal(TIMESTAMP);
        //System.out.println(result6 + " passes at timestamp " + TIMESTAMP);

        //int result7 = game.teamTotalGoals(TEAM);
        //System.out.println("Team: " + TEAM.getTeamName());
        //System.out.println("Total goals: " + result7);

        //Map<Integer, List<String>> result8 = game.rankByGoals();
        //System.out.println("Goals:     " + "Players:" );
        //for (Map.Entry<Integer, List<String>> entry : result8.entrySet()) {
        //    System.out.println(String.format(entry.getKey() + "          " + entry.getValue()));
        //}

    }

}
