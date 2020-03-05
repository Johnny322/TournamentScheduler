import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Match implements Comparable {
    private Team team1;
    private Team team2;
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

    @Override
    public String toString() {
        return team1.getId() + " vs " + team2.getId() + " in " + sport.toString() + "\n";
    }

    @Override
    public int compareTo(Object o) {
        double random1 = Math.random();
        double random2 = Math.random();

        if(random1 < random2) {
            return 1;
        } else {
            return -1;
        }

    }
}
