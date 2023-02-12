package problem1;

public abstract class Sport implements Scoreable{

    private final String name;
    private final int numberOfPlayers;

    protected Sport(String name, int numberOfPlayers){
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getName(){
        return this.name;
    }

    public int getNumberOfPlayers() {
        return this.numberOfPlayers;
    }

    public boolean isTeamSport(){
        return this.numberOfPlayers > 1;
    }

    public abstract void printCurrentStanding();
}
