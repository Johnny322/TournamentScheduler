import java.util.ArrayList;
import java.util.List;

public class TimeSlot {
    private Match basketball;
    private Match football;
    private Match volleyball;

    public TimeSlot() {
    }

    private void initializeMatch(Match match, Time time, Sport _sport) {
        switch (_sport){
            case FOOTBALL:
                this.football = match;
                break;
            case BASKETBALL:
                this.basketball = match;
                break;
            case VOLLEYBALL:
                this.volleyball = match;
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

    public List<Match> getAllMatches() {
        List<Match> matches = new ArrayList<>();
        matches.add(getBasketball());
        matches.add(getFootball());
        matches.add(getVolleyball());
        return matches;
    }
}
