package problem1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Baseball extends Sport{

    private int[] results;

    public Baseball(){
        super("Baseball", 9);
        this.results = new int[0];
    }

    @Override
    public void printCurrentStanding(){
        if (this.results.length == 0){
            System.out.println("No standing yet");
        }
        else {
            int wins = 0;
            for (int i = 0; i < this.results.length; i++){
                if (this.results[i] == 1){
                    wins += 1;
                }
            }
            System.out.println( "Current standing: " + (float) wins / this.results.length);
        }
    }

    @Override
    public int[] getResults(){
        return this.results.clone();
    }

    @Override
    public void addResult(int newInt){
        if (newInt < 0 || newInt > 1){
            throw new IllegalArgumentException("Value must be 0 or 1");
        }

        int[] oldArr = getResults();
        int oldLen = oldArr.length;

        int newLen = oldLen + 1;
        int[] newArr = new int[newLen];

        if (oldArr.length == 0){
            newArr[0] = newInt;
        }
        else {
            for (int i = 0; i < oldLen; i++){
                newArr[i] = oldArr[i];
            }
            newArr[newLen - 1] = newInt;

        }
        this.results = newArr;
    }

    public static void main(String[] args) {

        Baseball b1 = new Baseball();

        b1.addResult(1);
        b1.addResult(0);
        b1.addResult(1);
        b1.addResult(1);
        b1.addResult(0);

        System.out.println(b1.getName());
        System.out.println(b1.isTeamSport());
        System.out.println(b1.getNumberOfPlayers());
        b1.printCurrentStanding();

    }
}
