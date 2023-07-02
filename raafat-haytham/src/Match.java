import java.util.LinkedList;
import java.util.List;

public class Match {
    private int id ;
    private Team homeTeam ;
    private Team awayTeam ;
    private List<Goal> goals ;

    private int homeGoals;
    private int awayGoals;

    public void setId(int id) {
        this.id = id;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void setGoals(List<Goal> goals) {
        this.goals = goals;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }


    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public int getId() {
        return id;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public List<Goal> getGoals() {
        return goals;
    }

    @Override
    public String toString() {
        return "Match{" +
                ", homeGoals=" + homeGoals +
                ", awayGoals=" + awayGoals +
                '}';
    }
}