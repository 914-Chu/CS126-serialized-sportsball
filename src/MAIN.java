import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static void main(String[] args) {

        serialize();
        //deserialize();
    }

    private static void serialize() {

        players p1 = new players("Joyce", 21, 1, "none", "Taiwan");
        players p2 = new players( "Mercedes Jackson", 24, 13, "Midfielder", "Urbana");
        players p3 = new players("William Glass", 21, 16, "Midfielder", "Champaign");

        List<players> hT = Arrays.asList(p1, p2, p3);
        team homeTeam = new team("Champaign United", hT);

        Gson gson = new Gson();
        String json = gson.toJson(homeTeam);

    }

    private static void deserialize() {

        String playerJson = "{'name': 'Tim','age':17,'jerseyNumber':99,'position':'none','hometown':'Taiwan'}";

        Gson gson = new Gson();
        players p2 = gson.fromJson(playerJson, players.class);
    }


}
