import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class DataTest {

    private static Gson gson;
    Random rand = new Random();

    @Before
    public void setUp() throws Exception {

        gson = new Gson();
    }

    @Test
    public void canReadFileFromFolder() throws Exception {

        String testFileContents = Data.getFileContents("test_resources", "test_file_contents.txt");
        assertEquals("Gone, reduced to atoms", testFileContents);
    }

    @Test
    public void deserializeNull() {

        Game g = gson.fromJson("", Game.class);
        assertEquals(null, g);
    }

    @Test
    public void simple_deserialize() throws Exception {

        Game deserialized = deserialize();
        assertTrue(deserialized instanceof Game);
    }

    @Test
    public void checkHomeTeamName() throws Exception {

        Game deserialized = deserialize();
        String homeTeamName = deserialized.getHomeTeam().getTeamName();
        assertEquals("Champaign United", homeTeamName);
    }

    @Test
    public void checkHomeTeamPlayers() {

        Game deserialized = deserialize();
        List<Player> playerList = deserialized.getHomeTeam().getPlayerList();
        assertEquals("Mercedes Jackson", playerList.get(0).getPlayerName());
        assertEquals(26, playerList.get(3).getPlayerAge());
        assertEquals(27, playerList.get(7).getPlayerJerseyNumber());
        assertEquals("Defender", playerList.get(8).getPlayerPosition());
        assertEquals("Champaign", playerList.get(10).getPlayerHometown());
    }

    @Test
    public void checkAwayTeamName() {

        Game deserialized = deserialize();
        String awayTeamName = deserialized.getAwayTeam().getTeamName();
        assertEquals("Urbana International", awayTeamName);
    }

    @Test
    public void checkAwayTeamPlayers() {

        Game deserialized = deserialize();
        List<Player> playerList = deserialized.getAwayTeam().getPlayerList();
        assertEquals("Stevie Patrick", playerList.get(1).getPlayerName());
        assertEquals(25, playerList.get(2).getPlayerAge());
        assertEquals(13, playerList.get(5).getPlayerJerseyNumber());
        assertEquals("Attacker", playerList.get(9).getPlayerPosition());
        assertEquals("Bloomington", playerList.get(10).getPlayerHometown());
    }

    @Test
    public void checkWinner() {

        Game deserialized = deserialize();
        assertEquals("Urbana International", deserialized.getWinner());
    }

    @Test
    public void checkGoals() {

        Game deserialized = deserialize();
        final int POSITION = 17;
        List<Goals> goalList = deserialized.getGoals();

        assertEquals(19, goalList.size());
        assertEquals(80, goalList.get(POSITION).getTimestamp());
    }

    @Test
    public void checkPasses() {

        Game deserialized = deserialize();
        List<Goals> goalList = deserialized.getGoals();
        int GOAL = rand.nextInt(goalList.size());
        List<Passes> passesList = goalList.get(GOAL).getPassesList();
        int LAST_PASS = passesList.size() - 1;

        String SCORER = goalList.get(GOAL).getScorer();
        String ASSIST = goalList.get(GOAL).getAssist();
        String LAST_RECEIVER = passesList.get(LAST_PASS).getReceiver();
        String LAST_PASSER = passesList.get(LAST_PASS).getPasser();;

        assertEquals(SCORER, LAST_RECEIVER);
        if(ASSIST != null) {
            assertEquals(ASSIST, LAST_PASSER);
        }
    }

    @Test
    public void testGoalsInCertainTime() throws Exception {

        Game deserialized = deserialize();
        int TIMESTAMP = 50;
        assertEquals(11, deserialized.goalsInCertainTime(TIMESTAMP));
    }

    private static Game deserialize() {

        String testFileContents = Data.getFileContents("test_resources", "sportsballtest");

        return gson.fromJson(testFileContents, Game.class);
    }
}
