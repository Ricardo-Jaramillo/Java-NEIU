public class Video {

    String title;
    int awardsWon;

    public Video(String title, int awardsWon){
        this.title = title;
        this.awardsWon = awardsWon;
    }

    public int getAwardsWon(){
        return this.awardsWon;
    }

    public void setAwardsWon(int awardsWon){
        this.awardsWon= awardsWon;
    }

    @Override
    public String toString(){
        return "Title: " + this.title + "\nAwards Won: " + getAwardsWon();
    }
}
