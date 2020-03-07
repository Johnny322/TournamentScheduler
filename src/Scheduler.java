import java.util.*;

public class Scheduler {
    private List<Group> football;
    private List<Group> basketball;
    private List<Group> volleyball;
    private Schedule schedule;
    private Queue<Match> queue;
    private List<Match> matches;
    private int total;

    public Scheduler() {
        schedule = new Schedule();
        this.matches = new ArrayList<>();
        this.volleyball = new ArrayList<>();
        this.basketball = new ArrayList<>();
        this.football = new ArrayList<>();
    }

    public void makeGroups(Sport _sport, List<Integer> groupIds) {
        int i = 0;
        List<Team> teams1 = new ArrayList<>();
        List<Team> teams2 = new ArrayList<>();
        List<Team> teams3 = new ArrayList<>();
        switch (_sport) {
            case FOOTBALL:

                if (groupIds.size() < 13) {
                    while (i < groupIds.size()) {
                        if (i % 3 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if (i % 3 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if (i % 3 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    football.add(new Group(teams1, Sport.FOOTBALL));
                    football.add(new Group(teams2, Sport.FOOTBALL));
                    football.add(new Group(teams3, Sport.FOOTBALL));
                } else {
                    List<Team> teams4 = new ArrayList<>();
                    while (i < groupIds.size()) {
                        if (i % 4 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if (i % 4 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if (i % 4 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        if (i % 4 == 3) {
                            teams4.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    football.add(new Group(teams1, Sport.FOOTBALL));
                    football.add(new Group(teams2, Sport.FOOTBALL));
                    football.add(new Group(teams3, Sport.FOOTBALL));
                    football.add(new Group(teams4, Sport.FOOTBALL));
                }
                break;
            case BASKETBALL:

                if (groupIds.size() < 13) {
                    while (i < groupIds.size()) {
                        if (i % 3 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if (i % 3 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if (i % 3 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    basketball.add(new Group(teams1, Sport.BASKETBALL));
                    basketball.add(new Group(teams2, Sport.BASKETBALL));
                    basketball.add(new Group(teams3, Sport.BASKETBALL));
                } else {
                    List<Team> teams4 = new ArrayList<>();
                    while (i < groupIds.size()) {
                        if (i % 4 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if (i % 4 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if (i % 4 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        if (i % 4 == 3) {
                            teams4.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    basketball.add(new Group(teams1, Sport.BASKETBALL));
                    basketball.add(new Group(teams2, Sport.BASKETBALL));
                    basketball.add(new Group(teams3, Sport.BASKETBALL));
                    basketball.add(new Group(teams4, Sport.BASKETBALL));
                }
                break;
            case VOLLEYBALL:
                if (groupIds.size() < 13) {
                    while (i < groupIds.size()) {
                        if (i % 3 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if (i % 3 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if (i % 3 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    volleyball.add(new Group(teams1, Sport.VOLLEYBALL));
                    volleyball.add(new Group(teams2, Sport.VOLLEYBALL));
                    volleyball.add(new Group(teams3, Sport.VOLLEYBALL));
                } else {
                    List<Team> teams4 = new ArrayList<>();
                    while (i < groupIds.size() - 1) {
                        if (i % 4 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if (i % 4 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if (i % 4 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        if (i % 4 == 3) {
                            teams4.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    volleyball.add(new Group(teams1, Sport.VOLLEYBALL));
                    volleyball.add(new Group(teams2, Sport.VOLLEYBALL));
                    volleyball.add(new Group(teams3, Sport.VOLLEYBALL));
                    volleyball.add(new Group(teams4, Sport.VOLLEYBALL));
                }
                break;
        }
    }

    public void generateAllMatchesForSport(Sport _sport) {
        List<Match> matches = new ArrayList<>();
        switch (_sport) {
            case FOOTBALL:
                for (Group group : football) {
                    int i = group.getTeams().size();
                    int count = 0;
                    while (count < i - 1) {
                        for (int j = count; j < i - 1; j++) {
                            matches.add(new Match(group.getTeams().get(count), group.getTeams().get(j + 1), _sport));
                            total++;
                        }
                        count++;
                    }
                }
                break;
            case BASKETBALL:
                for (Group group : basketball) {
                    int i = group.getTeams().size();
                    int count = 0;
                    while (count < i - 1) {
                        for (int j = count; j < i - 1; j++) {
                            matches.add(new Match(group.getTeams().get(count), group.getTeams().get(j + 1), _sport));
                            total++;
                        }
                        count++;
                    }
                }
                break;
            case VOLLEYBALL:
                for (Group group : volleyball) {
                    int i = group.getTeams().size();
                    int count = 0;
                    while (count < i - 1) {
                        for (int j = count; j < i - 1; j++) {
                            matches.add(new Match(group.getTeams().get(count), group.getTeams().get(j + 1), _sport));
                            total++;
                        }
                        count++;
                    }
                }
                break;
        }

        this.matches.addAll(matches);
    }

    public void makeAllTimeSlots() {
        if (total % 3 != 0) {
            for (int i = 0; i < total / 3 + 1; i++) {
                if (i % 3 == 0) {
                    schedule.addTimesSlot(new TimeSlot(Time.FIRST));
                } else if (i % 3 == 1) {
                    schedule.addTimesSlot(new TimeSlot(Time.SECOND));
                } else {
                    schedule.addTimesSlot(new TimeSlot(Time.THIRD));
                }
            }
        } else {
            for (int i = 0; i < total / 3; i++) {
                if (i % 3 == 0) {
                    schedule.addTimesSlot(new TimeSlot(Time.FIRST));
                } else if (i % 3 == 1) {
                    schedule.addTimesSlot(new TimeSlot(Time.SECOND));
                } else {
                    schedule.addTimesSlot(new TimeSlot(Time.THIRD));
                }
            }
        }
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void initializeList() {
        this.queue = new LinkedList<>();
        for (Match match : matches) {
            this.queue.add(match);
        }
        Collections.shuffle((List<?>) this.queue);
    }

    public String printSchedule() {
        String print = "";
        int i = 0;
        for(TimeSlot timeSlot : this.schedule.getTimeSlots()) {
            print = print.concat("Day " + i/3 + ", timeslot: " + timeSlot.getTime().toString() + "\n");
            for(Match match : timeSlot.getAllMatches()) {
                if(match != null) {
                    print = print.concat(match.toString());
                } else {
                    print = print.concat("Currently null \n");
                }
            }

            i++;
        }
        return print;
    }

    //TODO Not yet fixed: https://www.geeksforgeeks.org/sudoku-backtracking-7/
    public boolean solveSchedule(Schedule schedule) {
        System.out.println(printSchedule());
        int matchSize = this.queue.size();
        System.out.println("Goes into new recursion");
        boolean isEmpty = true;
        for (int i = 0; i < matches.size(); i++) {
            System.out.println("Trying with " + i + " as iterator");
            if (schedule.getMatch(i) == null) {
                isEmpty = false;
                break;
            } else {
                System.out.println("This iterator is not good: " + i);
            }
        }


        // no empty space left
        if (isEmpty) {
            System.out.println("Is true");
            return true;
        }

        for (int m = 0; m < this.queue.size(); m++) {
            Match match = this.queue.poll();
            // else for each-row backtrack
            for (int num = 0; num < this.matches.size(); num++) {
                if (schedule.getMatch(num) == null) {
                    System.out.println("Queue size = " + this.queue.size());
                    //System.out.println("Printing queue: ");
                /*for(Match match : this.queue) {
                    System.out.println(match.toString());
                }*/
                    System.out.println(match.toString());
                    TimeSlot test = schedule.getTimeSlots().get(num / 3);
                    System.out.println("Trying to set match " + match.toString() + " to timeSlot " + num / 3);
                    if (schedule.evaluateTeams(match, test, num)) {
                        test.initializeMatch(match);
                        System.out.println("Match removed: " + match.toString());
                        if (solveSchedule(schedule)) {
                            // print(board, n);
                            return true;
                        } else {
                            System.out.println("Removing match: " + match.toString() + " from schedule at:" + test.getTime().toString() + " at " + num / 3);
                            test.deleteMatch(match);
                        }
                    }
                }

            }
            this.queue.add(match);
        }
        Collections.shuffle((List<?>) this.queue);
        return false;

    }

    public String printGroups() {
        String groups = "";
        groups = groups.concat("Football groups: \n");
        System.out.println(groups);
        int j = 1;
        for (Group group : football) {
            groups = groups.concat("Group " + j + "\n");
            for (Team i : group.getTeams()) {
                groups = groups.concat(i.getId() + ", ");
            }
            j++;
        }
        groups = groups.concat("\n");
        groups = groups.concat("Basketball groups: \n");
        j = 1;
        for (Group group : basketball) {
            groups = groups.concat("Group " + j + "\n");
            for (Team i : group.getTeams()) {
                groups = groups.concat(i.getId() + ", ");
            }
            j++;
        }
        groups = groups.concat("\n");
        groups = groups.concat("Volleyball groups: \n");
        j = 1;
        for (Group group : volleyball) {
            groups = groups.concat("Group " + j + "\n");
            for (Team i : group.getTeams()) {
                groups = groups.concat(i.getId() + ", ");
            }
            j++;
        }
        return groups;
    }

    public String printAllMatches() {
        String s = "";
        for (Match match : this.matches) {
            s = s.concat(match.toString());
        }
        return s;
    }
}
