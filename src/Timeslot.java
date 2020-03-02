public class Timeslot {
    private Match basketball;
    private Match football;
    private Match volleyball;

    private Timeslot() {
    }

    private void initializeMatch(Team team1, Team team2, Time time, Sport _sport) {
        switch (_sport){
            case FOOTBALL:
                this.football = new Match(team1, team2, time, _sport);
                break;
            case BASKETBALL:
                this.basketball = new Match(team1, team2, time, _sport);
                break;
            case VOLLEYBALL:
                this.volleyball = new Match(team1, team2, time, _sport);
                break;
        }

    }

    public void deleteMatch(Sport _sport) {
        switch (_sport){
            case FOOTBALL:
                this.football = null;
                break;
            case BASKETBALL:
                this.basketball = null;
                break;
            case VOLLEYBALL:
                this.volleyball = null;
                break;
        }
    }

    public Match getBasketball() {
        return basketball;
    }

    public Match getFootball() {
        return football;
    }

    public Match getVolleyball() {
        return volleyball;
    }
}
