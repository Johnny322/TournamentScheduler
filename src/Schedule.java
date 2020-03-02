import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Timeslot> timeslots;

    public Schedule(int _tournamentSize) {
        this.timeslots = new ArrayList<>();
    }

    public List<Timeslot> getTimeslots() {
        return timeslots;
    }
}
