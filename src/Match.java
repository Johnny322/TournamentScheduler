import java.util.ArrayList;
import java.util.List;

public class Match {
    private Team team1;
    private Team team2;
    private Time time;
    private Sport sport;



    public Match(Team team1, Team team2, Sport _sport) {
        this.team1 = team1;
        this.team2 = team2;
        this.sport = _sport;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Sport getSport() {
        return sport;
    }

    public List<Team> getAllTeams() {
        List<Team> teams = new ArrayList<>();
        teams.add(getTeam1());
        teams.add(getTeam2());
        return teams;
    }

    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return team1.getId() + " vs " + team2.getId() + " at " + time.toString();
    }
}
