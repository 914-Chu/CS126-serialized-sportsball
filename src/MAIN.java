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
        List<Game.Goals> goalsList = game.getGoals();

       // game.goalsInCertainTime(goalsList, TIMESTAMP);

       // game.goalsWithoutAssist(goalsList);

        //game.goalsDetail(goalsList);

        //game.playerStats(goalsList, PLAYER);

        //game.passesPerGoal(goalsList, TIMESTAMP);

        //game.teamStats(goalsList, HOMETEAM);

        game.ageStats(goalsList, AWAYTEAM);

    }

}
