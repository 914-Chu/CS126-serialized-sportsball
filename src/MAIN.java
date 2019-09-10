import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static void main(String[] args) {

         deserialize();
    }

    public static Game deserialize() {

        String game = Data.getFileContents("test_resources", "sportsballtest");

        Gson gson = new Gson();
        Game g = gson.fromJson(game, Game.class);

        return g;
    }
}
