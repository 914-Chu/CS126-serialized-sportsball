import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static void main(String[] args) {

        int TIMESTAMP = 40;
        String PLAYER = "Steven White";
        String HOMETEAM = "Champaign United";
        String AWAYTEAM = "Urbana International";
        String testFileContents = Data.getFileContents("test_resources", "sportsballtest");
        Gson gson = new Gson();
        Game game = gson.fromJson(testFileContents, Game.class);

        //game.goalsInCertainTime(TIMESTAMP);

        //game.goalsWithoutAssist();

        //game.goalsDetail();

        //game.playerStats(PLAYER);

        //game.passesPerGoal(TIMESTAMP);

        //game.teamStats(HOMETEAM);

        //game.rankByGoals();

    }

}
