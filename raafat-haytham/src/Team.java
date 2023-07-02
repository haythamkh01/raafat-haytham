import java.util.List;

public class Team {

    private int id ;
    private String name ;
    private List<String> players  ;
    private List<Match> theMatchs;
    private List<Goal> theGoals;
    private int points;
    private int goalDifference;



    public List<Match> getTheMatchs() {
        return theMatchs;
    }

    public List<Goal> getTheGoals() {
        return theGoals;
    }


    public Team (String name, int id, List<String> players){
        this.name = name ;
        this.id = id ;
        this.players = players;
    }



    public void setId (int id){
        this.id = id ;
    }
    public void setName (String name){
        this.name = name ;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getPlayers() {
        return players;
    }
        public void setPlayers (List<String> players){
       this.players = players ;
    }

    public void setTheMatchs(List<Match> theMatchs) {
        this.theMatchs = theMatchs;
    }

    public void setTheGoals(List<Goal> theGoals) {
        this.theGoals = theGoals;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\''
                + " players" + players;

    }


}
