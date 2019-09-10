import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static final int TIMESTAMP = 85;

    public static void main(String[] args) {

        String testFileContents = Data.getFileContents("test_resources", "sportsballtest");
        Gson gson = new Gson();
        Game game = gson.fromJson(testFileContents, Game.class);
        List<Game.Goals> goalsList = game.getGoals();

        List<Integer> currentGoal = game.goalsInCertainTime(goalsList, TIMESTAMP);
        System.out.println(currentGoal);

        List<Integer> goalsWithoutAssist = game.goalsWithoutAssist(goalsList);
        System.out.println(goalsWithoutAssist);

        Map<Integer, List<String>> goalsDetail = game.goalsDetail(goalsList);

    }

}
