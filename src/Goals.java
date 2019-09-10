import java.util.*;

public class Goals {

    private String team;
    private int timestamp;
    private String scorer;
    private String assist;
    private List<Passes> passes;

    public String getTeamName() {
        return team;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public String getScorer() {
        return scorer;
    }

    public String getAssist() {
        return assist;
    }

    public List<Passes> getPassesList() {
        return passes;
    }

}
