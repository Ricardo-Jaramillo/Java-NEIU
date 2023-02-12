public class VideoDemo {

    public static void main(String[] args) {

        Video v1 = new Video("Video 1", 10);
        TVShow TVs1 = new TVShow("TVShow 1", 8, 100, 2002);
        Movie m1 = new Movie("Movie 1", 551, 128, "Director m1");

        System.out.println(v1.title);
        System.out.println(v1.awardsWon);
        System.out.println(v1.getAwardsWon());
        System.out.println(v1.toString());
        System.out.println("\n");

        System.out.println(TVs1.awardsWon);
        System.out.println(TVs1.numEpisodes);
        System.out.println(TVs1.startYear);
        System.out.println(TVs1.title);
        System.out.println(TVs1.getNumEpisodes());
        System.out.println(TVs1.getStartYear());
        TVs1.printInfo();
        System.out.println("\n");

        System.out.println(m1.director);
        System.out.println(m1.title);
        System.out.println(m1.awardsWon);
        System.out.println(m1.getDirector());
        System.out.println(m1.getLength());
        System.out.println(m1.getAwardsWon());
        System.out.println(m1.toString());
        System.out.println("\n");

    }
}
