package problem1;

public class Swimming extends Sport{

    private int[] results;

    public Swimming(){
        super("Swimming", 1);
        this.results = new int[0];
    }

    @Override
    public void printCurrentStanding(){
        if (this.results.length == 0){
            System.out.println("No standing yet");
        }
        else {
            int sum = 0;
            for (int i = 0; i < this.results.length; i++){
                sum += this.results[i];
            }
            System.out.println("Current standing: " + (float) sum / this.results.length);
        }
    }

    @Override
    public int[] getResults(){
        return this.results.clone();
    }

    @Override
    public void addResult(int newInt){
        if (newInt < 1){
            throw new IllegalArgumentException("Value must be 1 or higher");
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

        Swimming s1 = new Swimming();

        s1.addResult(5);
        s1.addResult(2);
        s1.addResult(1);
        s1.addResult(4);
        s1.addResult(6);

        System.out.println(s1.getName());
        System.out.println(s1.isTeamSport());
        System.out.println(s1.getNumberOfPlayers());
        s1.printCurrentStanding();
    }
}
