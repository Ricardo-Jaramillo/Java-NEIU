public class Movie extends Video{

    private int length;
    String director;

    public Movie(String title, int awardsWon, int length, String director){
        super(title, awardsWon);
        this.length = length;
        this.director = director;
    }

    public int getLength(){
        return this.length;
    }

    public String getDirector(){
        return this.director;
    }

    @Override
    public String toString(){
        return super.toString() + "\nLength " + getLength() + "\nDirector: " + getDirector();
    }
}
