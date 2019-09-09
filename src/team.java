import java.util.*;

public class team {

    private static final int NUMBER_OF_PLAYERS = 11;
    private String name;
    private List<players> playersList ;

    public team(String name, List<players> playersList){

        this.name = name;
        this.playersList = playersList;
    }
}
