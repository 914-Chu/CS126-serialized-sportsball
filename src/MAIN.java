import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static void main(String[] args) {

        int TIMESTAMP = 40;
        String PLAYER = "Steven White";
        String POSITION = "Defender";
        String testFileContents = Data.getFileContents("test_resources", "sportsballtest");
        Gson gson = new Gson();
        Game game = gson.fromJson(testFileContents, Game.class);
        Teams TEAM = game.getHomeTeam();

        /**
         *  filtering functions
         */

        //game.goalsInCertainTime(TIMESTAMP);

        //game.goalsWithoutAssist();

        //game.goalsDetail();

        //game.positionList(TEAM, POSITION);

        /**
         *  analysis functions
         */

        //game.playerStats(PLAYER);

        //game.passesPerGoal(TIMESTAMP);

        //game.teamStats(TEAM);

        //game.rankByGoals();

    }

}
