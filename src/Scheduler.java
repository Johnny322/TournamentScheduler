import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class Scheduler {
    private List<Group> football;
    private List<Group> basketball;
    private List<Group> volleyball;
    private Schedule schedule;

    public Scheduler() {
    }

    public void makeGroups(Sport _sport, List<Integer> groupIds) {
        int i = 0;
        List<Team> teams1 = new ArrayList<>();
        List<Team> teams2 = new ArrayList<>();
        List<Team> teams3 = new ArrayList<>();
        switch (_sport) {
            case FOOTBALL:
                if(groupIds.size()<13) {
                    while(i < groupIds.size()-1) {
                        if(i % 3 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if(i % 3 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if(i % 3 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    List<Group> _groups = new ArrayList<>();
                    _groups.add(new Group(teams1, Sport.FOOTBALL));
                    _groups.add(new Group(teams2, Sport.FOOTBALL));
                    _groups.add(new Group(teams3, Sport.FOOTBALL));
                } else {
                    List<Team> teams4 = new ArrayList<>();
                    while(i < groupIds.size()-1) {
                        if(i % 4 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if(i % 4 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if(i % 4 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        if(i % 4 == 3) {
                            teams4.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    List<Group> _groups = new ArrayList<>();
                    _groups.add(new Group(teams1, Sport.FOOTBALL));
                    _groups.add(new Group(teams2, Sport.FOOTBALL));
                    _groups.add(new Group(teams3, Sport.FOOTBALL));
                    _groups.add(new Group(teams4, Sport.FOOTBALL));
                }
                break;
            case BASKETBALL:
                if(groupIds.size()<13) {
                    while(i < groupIds.size()-1) {
                        if(i % 3 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if(i % 3 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if(i % 3 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    List<Group> _groups = new ArrayList<>();
                    _groups.add(new Group(teams1, Sport.BASKETBALL));
                    _groups.add(new Group(teams2, Sport.BASKETBALL));
                    _groups.add(new Group(teams3, Sport.BASKETBALL));
                } else {
                    List<Team> teams4 = new ArrayList<>();
                    while(i < groupIds.size()-1) {
                        if(i % 4 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if(i % 4 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if(i % 4 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        if(i % 4 == 3) {
                            teams4.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    List<Group> _groups = new ArrayList<>();
                    _groups.add(new Group(teams1, Sport.BASKETBALL));
                    _groups.add(new Group(teams2, Sport.BASKETBALL));
                    _groups.add(new Group(teams3, Sport.BASKETBALL));
                    _groups.add(new Group(teams4, Sport.BASKETBALL));
                }
                break;
            case VOLLEYBALL:
                if(groupIds.size()<13) {
                    while(i < groupIds.size()-1) {
                        if(i % 3 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if(i % 3 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if(i % 3 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    List<Group> _groups = new ArrayList<>();
                    _groups.add(new Group(teams1, Sport.VOLLEYBALL));
                    _groups.add(new Group(teams2, Sport.VOLLEYBALL));
                    _groups.add(new Group(teams3, Sport.VOLLEYBALL));
                } else {
                    List<Team> teams4 = new ArrayList<>();
                    while(i < groupIds.size()-1) {
                        if(i % 4 == 0) {
                            teams1.add(new Team(groupIds.get(i)));
                        }
                        if(i % 4 == 1) {
                            teams2.add(new Team(groupIds.get(i)));
                        }
                        if(i % 4 == 2) {
                            teams3.add(new Team(groupIds.get(i)));
                        }
                        if(i % 4 == 3) {
                            teams4.add(new Team(groupIds.get(i)));
                        }
                        i++;
                    }
                    List<Group> _groups = new ArrayList<>();
                    _groups.add(new Group(teams1, Sport.VOLLEYBALL));
                    _groups.add(new Group(teams2, Sport.VOLLEYBALL));
                    _groups.add(new Group(teams3, Sport.VOLLEYBALL));
                    _groups.add(new Group(teams4, Sport.VOLLEYBALL));
                }
                break;
        }
    }

    public boolean evaluateMatch()
}
