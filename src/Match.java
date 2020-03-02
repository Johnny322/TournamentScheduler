public class Match {
    private Team team1;
    private Team team2;
    private Time time;
    private Sport sport;



    public Match(Team team1, Team team2, Time time, Sport _sport) {
        this.team1 = team1;
        this.team2 = team2;
        this.time = time;
        this.sport = _sport;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public Time getTime() {
        return time;
    }

    @Override
    public String toString() {
        return team1.getId() + " vs " + team2.getId() + " at " + time.toString();
    }
}
