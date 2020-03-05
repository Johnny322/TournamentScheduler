import java.util.ArrayList;
import java.util.List;

public class TimeSlot {
    private Match basketball;
    private Match football;
    private Match volleyball;
    private Time time;

    public TimeSlot(Time _time) {
        this.time = _time;
    }

    public void initializeMatch(Match match) {
        switch (match.getSport()){
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

    public boolean checkIfSportOccupied(Match match) {
        switch (match.getSport()) {
            case FOOTBALL:
                if(football == null) {
                    return true;
                }
            case BASKETBALL:
                if(basketball == null) {
                    return true;
                }
            case VOLLEYBALL:
                if(volleyball == null) {
                    return true;
                }

        }
        return false;
    }

    public Match deleteMatch(Match match) {
        Match matchReturn = null;
        switch (match.getSport()){
            case FOOTBALL:
                matchReturn = this.football;
                this.football = null;
                break;
            case BASKETBALL:
                matchReturn = this.basketball;
                this.basketball = null;
                break;
            case VOLLEYBALL:
                matchReturn = this.volleyball;
                this.volleyball = null;
                break;
        }
        return match;
    }

    public Time getTime() {
        return time;
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
