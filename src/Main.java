import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Scheduler scheduler = new Scheduler();
        List<Integer> basket = new ArrayList<>();
        basket.add(3063);
        basket.add(3461);
        basket.add(3065);
        basket.add(3667);
        basket.add(3169);
        basket.add(3166);
        basket.add(3565);
        basket.add(3164);
        basket.add(3263);
        basket.add(3264);
        basket.add(3261);
        basket.add(3262);
        List<Integer> volley = new ArrayList<>();
        volley.add(3768);
        volley.add(3867);
        volley.add(3664);
        volley.add(3060);
        volley.add(3165);
        volley.add(3160);
        volley.add(3182);
        volley.add(3164);
        volley.add(3963);
        volley.add(3264);
        volley.add(3260);
        volley.add(3262);
        List<Integer> foot = new ArrayList<>();
        foot.add(3069);
        foot.add(1061);
        foot.add(3061);
        foot.add(1060);
        foot.add(3163);
        foot.add(3161);
        foot.add(3162);
        foot.add(3164);
        foot.add(3263);
        foot.add(3264);
        foot.add(3269);
        foot.add(3262);
        scheduler.makeGroups(Sport.BASKETBALL, basket);
        scheduler.makeGroups(Sport.FOOTBALL, foot);
        scheduler.makeGroups(Sport.VOLLEYBALL, volley);
        System.out.println(scheduler.printGroups());
        scheduler.generateAllMatchesForSport(Sport.BASKETBALL);
        scheduler.generateAllMatchesForSport(Sport.VOLLEYBALL);
        scheduler.generateAllMatchesForSport(Sport.FOOTBALL);
        System.out.println(scheduler.printAllMatches());
        scheduler.initializeList();
        scheduler.makeAllTimeSlots();
        if (scheduler.solveSchedule(scheduler.getSchedule()) == true) {
            System.out.println("Shit");
            System.out.println(scheduler.printSchedule());
        }
        else {
            System.out.println("toast");
        }
    }
}
