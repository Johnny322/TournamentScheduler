import java.util.List;

public class Group {
    private List<Team> teams;
    private Sport sport;

    public Group(List<Team> teams, Sport sport) {
        this.teams = teams;
        this.sport = sport;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public Sport getSport() {
        return sport;
    }
}
