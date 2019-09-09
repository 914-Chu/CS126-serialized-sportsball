import java.util.*;

public class Game {

    private Teams homeTeam;
    private Teams awayTeam;
    private String winner;
    //private Goals goals;


    private class Teams {

        private String name;
        private List<Player> players ;

        private class Player {

            private String name;
            private int age;
            private int jerseyNumber;
            private String position;
            private String hometown;
        }
    }
/**
    private class Goals {

        private String teamName;
        private int timestamp;
        private String scorer;
        private String assist;
        private List<Passes> passes;

        private class Passes {

            private String passer;
            private String receiver;
        }
    }
 */
}

