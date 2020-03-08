import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<TimeSlot> timeSlots;

    public Schedule() {
        this.timeSlots = new ArrayList<>();
    }

    public void addTimesSlot(TimeSlot timeSlot) {
        this.timeSlots.add(timeSlot);
    }



    public List<TimeSlot> getTimeSlots() {
        return timeSlots;
    }

    public Match getMatch(int iterator) {
        return this.getTimeSlots().get(iterator / 3).getAllMatches().get(iterator % 3);
    }

    private List<TimeSlot> getTimeSlotsForDay(TimeSlot timeSlot, int iterator) {
        List<TimeSlot> timeSlots1 = new ArrayList<>();
        if(timeSlot.getTime().equals(Time.FIRST)) {
            timeSlots1.add(this.timeSlots.get(iterator));
            timeSlots1.add(this.timeSlots.get(iterator + 1));
            timeSlots1.add(this.timeSlots.get(iterator + 2));
        }
        if(timeSlot.getTime().equals(Time.SECOND)) {
            timeSlots1.add(this.timeSlots.get(iterator));
            timeSlots1.add(this.timeSlots.get(iterator + 1));
            timeSlots1.add(this.timeSlots.get(iterator - 1));
        }
        if(timeSlot.getTime().equals(Time.THIRD)) {
            timeSlots1.add(this.timeSlots.get(iterator));
            timeSlots1.add(this.timeSlots.get(iterator - 1));
            timeSlots1.add(this.timeSlots.get(iterator - 2));
        }
        return timeSlots1;
    }

    public boolean evaluateTeams(Match match, TimeSlot timeslot, int iterator) {
        if(timeslot.checkIfSportOccupied(match)) {
            System.out.println("Match is occupied");
            return false;
        }
        for(TimeSlot _timeSlot : getTimeSlotsForDay(timeslot, iterator / 3)) {
            for (Match match1 : timeslot.getAllMatches()) {
                if(match1 != null) {
                    for (Team team : match1.getAllTeams()) {
                        if (team.getId() == match.getTeam1().getId()) {
                            System.out.println("A team is named the same as team1");
                            return false;
                        }
                        if (team.getId() == match.getTeam2().getId()) {
                            System.out.println("A team is named the same as team2");
                            return false;
                        }
                    }
                }
            }
        }
        System.out.println("Team evaluated to be good");
        return true;
    }

}
