import com.google.gson.Gson;
import java.util.*;

public class MAIN {

    public static void main(String[] args) {

        serialize();
        //deserialize();
    }

    private static void serialize() {

        Players p1 = new Players("Joyce", 21, 1, "none", "Taiwan");
        Players p2 = new Players( "Mercedes Jackson", 24, 13, "Midfielder", "Urbana");
        Players p3 = new Players("William Glass", 21, 16, "Midfielder", "Champaign");

        List<Players> hT = Arrays.asList(p1, p2, p3);
        Team homeTeam = new Team("Champaign United", hT);
        Game g1 = new Game(homeTeam);

        Gson gson = new Gson();
        String json = gson.toJson(g1);

    }

    private static void deserialize() {

        String playerJson = "{'name': 'Tim','age':17,'jerseyNumber':99,'position':'none','hometown':'Taiwan'}";

        Gson gson = new Gson();
        Players p2 = gson.fromJson(playerJson, Players.class);
    }


}
