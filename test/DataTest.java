import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataTest {

    private static Gson gson;
    private static Game game;

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
    public void simple_deserialize() throws Exception{

        String testFileContents = Data.getFileContents("test_resources", "sportsballtest");
        Game deserialized = deserialize(testFileContents);
        assertTrue(deserialized instanceof Game);
    }

    @Test
    public void name() {
    }

    private static Game deserialize(String path) {

        return gson.fromJson(path, Game.class);
    }
}
