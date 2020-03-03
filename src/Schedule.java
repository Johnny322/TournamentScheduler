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
}
