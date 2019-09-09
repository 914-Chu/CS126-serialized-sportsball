import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static void main(String[] args) {

        //serialize();
         deserialize();
    }
/**
    private static void serialize() {

        Players p1 = new Players("Joyce", 21, 1, "none", "Taiwan");
        Players p2 = new Players( "Mercedes Jackson", 24, 13, "Midfielder", "Urbana");
        Players p3 = new Players("William Glass", 21, 16, "Midfielder", "Champaign");

        List<Players> hT = Arrays.asList(p1, p2, p3);
        Teams homeTeam = new Teams("Champaign United", hT);
        Game g1 = new Game(homeTeam);

        Gson gson = new Gson();
        String json = gson.toJson(g1);

    }
*/
    private static void deserialize() {

        String game1 = "{\n" +
                "  \"homeTeam\": {\n" +
                "    \"name\": \"Champaign United\",\n" +
                "    \"players\": [\n" +
                "      {\n" +
                "        \"name\": \"Mercedes Jackson\",\n" +
                "        \"age\": 24,\n" +
                "        \"jerseyNumber\": 13,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"Urbana\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"William Glass\",\n" +
                "        \"age\": 21,\n" +
                "        \"jerseyNumber\": 16,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"Champaign\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"awayTeam\": {\n" +
                "    \"name\": \"Urbana International\",\n" +
                "    \"players\": [\n" +
                "      {\n" +
                "        \"name\": \"Mary Kohnz\",\n" +
                "        \"age\": 21,\n" +
                "        \"jerseyNumber\": 9,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"Urbana\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"Stevie Patrick\",\n" +
                "        \"age\": 27,\n" +
                "        \"jerseyNumber\": 22,\n" +
                "        \"position\": \"Midfielder\",\n" +
                "        \"hometown\": \"St. Louis\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"name\": \"David Cole\",\n" +
                "        \"age\": 20,\n" +
                "        \"jerseyNumber\": 1,\n" +
                "        \"position\": \"Goalkeeper\",\n" +
                "        \"hometown\": \"Bloomington\"\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  \"winner\": \"Urbana International\"}";

        Gson gson = new Gson();
        Game g1 = gson.fromJson(game1, Game.class);
    }


}
