public class StringInfo {

    private final String letters;

    public StringInfo(String letters){
        this.letters = letters;
    }

    public String getLetters(){
        return this.letters;
    }

    public boolean moreThanThree(char ch){

        int a = this.letters.indexOf(ch);

        if (a != -1){
            int b = this.letters.indexOf(ch, a + 1);
            if (b != -1){
                int c = this.letters.indexOf(ch, b + 1);
                if (c != -1){
                    int d = this.letters.indexOf(ch, c + 1);
                    return d != -1;
                }
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }
}
