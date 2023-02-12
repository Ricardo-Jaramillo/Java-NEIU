public class TVShow extends Video{

    int numEpisodes;
    int startYear;

    public TVShow(String title, int awardsWon, int numEpisodes, int startYear){
        super(title, awardsWon);
        this.numEpisodes = numEpisodes;
        this.startYear = startYear;
    }

    public int getNumEpisodes(){
        return this.numEpisodes;
    }

    public int getStartYear(){
        return this.startYear;
    }

    public void printInfo(){
        System.out.println(super.toString() + "\nNum Episodes: " + getNumEpisodes() + "\nStart Year: " + getStartYear());
    }
}
