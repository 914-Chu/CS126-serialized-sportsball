import java.util.*;;

public class Goals {

    private String teamName;
    private int timestamp;
    private String scorer;
    private String assist;
    private List<Passes> passes;

    public Goals(String teamName, int timestamp, String scorer, String assist, List<Passes> passes) {

        this.teamName = teamName;
        this.timestamp = timestamp;
        this.scorer = scorer;
        this.assist = assist;
        this.passes = new ArrayList<>(passes);
    }
}
