import java.util.*;;

public class goals {

    private String teamName;
    private int timestamp;
    private String scorer;
    private String assist;
    private List<passesData> passesList;

    public goals(String teamName, int timestamp, String scorer, String assist, List<passesData> passesList) {

        this.teamName = teamName;
        this.timestamp = timestamp;
        this.scorer = scorer;
        this.assist = assist;
        this.passesList = new ArrayList<>(passesList);
    }
}
