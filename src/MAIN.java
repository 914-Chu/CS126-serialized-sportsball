import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static void main(String[] args) {

        int TIMESTAMP = 44;
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

        //List<Integer> result2 = game.goalsWithoutAssist();

        //Map<Integer, List<String>> result3 = game.goalsDetail();

        //List<String> result4 = game.positionList(TEAM, POSITION);

        /**
         *  analysis functions
         */

        //Map<String, Integer> result5 = game.playerStats(PLAYER);

        //int result6 = game.passesPerGoal(TIMESTAMP);

        //int result7 = game.teamTotalGoals(TEAM);

        Map<Integer, List<String>> result8 = game.rankByGoals();

    }

}
