public class team {

    private final int NUMBER_OF_PLAYERS = 11;
    private String name;
    private players playerData[] = new players[NUMBER_OF_PLAYERS];

    public team(String name, players[] playerData){

        this.name = name;
        this.playerData = playerData;
    }

}
