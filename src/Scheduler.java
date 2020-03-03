import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private List<Group> football;
    private List<Group> basketball;
    private List<Group> volleyball;
    private Schedule schedule;
    private int total;

    public Scheduler() {
        schedule = new Schedule();
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

    public boolean evaluateTeams(Match match, TimeSlot timeslot) {
        for(Match match1 : timeslot.getAllMatches()) {
            for(Team team : match1.getAllTeams()) {
                if(team.getId() == match.getTeam1().getId()) {
                    return false;
                }
                if(team.getId() == match.getTeam2().getId()) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<Match> generateAllMatchesForSport(Sport _sport) {
        List<Match> matches = new ArrayList<>();
        switch (_sport) {
            case FOOTBALL:
                for(Group group : football) {
                    int i = group.getTeams().size();
                    int count = 0;
                    while(count < i - 1) {
                        for (int j = count; j < i-1; j++) {
                            matches.add(new Match(group.getTeams().get(count), group.getTeams().get(j+1), _sport));
                            total++;
                        }
                    }
                }
                break;
            case BASKETBALL:
                for(Group group : basketball) {
                    int i = group.getTeams().size();
                    int count = 0;
                    while(count < i - 1) {
                        for (int j = count; j < i-1; j++) {
                            matches.add(new Match(group.getTeams().get(count), group.getTeams().get(j+1), _sport));
                            total++;
                        }
                    }
                }
                break;
            case VOLLEYBALL:
                for(Group group : volleyball) {
                    int i = group.getTeams().size();
                    int count = 0;
                    while(count < i - 1) {
                        for (int j = count; j < i-1; j++) {
                            matches.add(new Match(group.getTeams().get(count), group.getTeams().get(j+1), _sport));
                            total++;
                        }
                    }
                }
                break;
        }

        return matches;
    }

    public Match getMatch(int iterator) {
        return schedule.getTimeSlots().get(iterator / 3).getAllMatches().get(iterator % 3);
    }

    public void makeAllTimeSlots() {
        if(total % 3 != 0) {
            for (int i = 0; i < total / 3 + 1; i++) {
                schedule.addTimesSlot(new TimeSlot());
            }
        } else {
            for (int i = 0; i < total / 3; i++) {
                schedule.addTimesSlot(new TimeSlot());
            }
        }
    }

    //TODO Not yet fixed: https://www.geeksforgeeks.org/sudoku-backtracking-7/
    /*public static boolean solveSchedule(Schedule schedule, int n)
    {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (board[i][j] == 0)
                {
                    row = i;
                    col = j;

                    // we still have some remaining
                    // missing values in Sudoku
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty)
            {
                break;
            }
        }

        // no empty space left
        if (isEmpty)
        {
            return true;
        }

        // else for each-row backtrack
        for (int num = 1; num <= n; num++)
        {
            if (isSafe(board, row, col, num))
            {
                board[row][col] = num;
                if (solveSudoku(board, n))
                {
                    // print(board, n);
                    return true;
                }
                else
                {
                    board[row][col] = 0; // replace it
                }
            }
        }
        return false;
    }
*/
}
