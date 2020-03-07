import java.util.ArrayList;
import java.util.List;

public class TimeSlot {
    private Match basketball;
    private Match football;
    private Match volleyball;
    private Time time;

    public TimeSlot(Time _time) {
        this.time = _time;
        this.volleyball = null;
        this.football = null;
        this.basketball = null;
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
        System.out.println("Checking if " + match.getSport().toString() + " is empty");
        if(match.getSport() == Sport.FOOTBALL) {
            if(this.football != null) {
                System.out.println(match.getSport().toString() + " is NOT empty");
                return true;
            }
        }
        if(match.getSport() == Sport.VOLLEYBALL) {
            if(this.volleyball != null) {
                System.out.println(match.getSport().toString() + " is NOT empty");
                return true;
            }
        }
        if(match.getSport() == Sport.BASKETBALL) {
            if(this.basketball != null) {
                System.out.println(match.getSport().toString() + " is NOT empty");
                return true;
            }
        }
        System.out.println(match.getSport().toString() + " is empty");
        return false;
    }

    public Match deleteMatch(Match match) {
        if (match.getSport() == Sport.FOOTBALL) {
            this.football = null;
        } else if (match.getSport() == Sport.BASKETBALL) {
            this.basketball = null;
        } else if (match.getSport() == Sport.VOLLEYBALL) {
            this.volleyball = null;
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
