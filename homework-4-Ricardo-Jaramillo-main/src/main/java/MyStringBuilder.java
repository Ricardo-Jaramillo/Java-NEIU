
public class MyStringBuilder {

    private String original;

    public MyStringBuilder(String string){
        this.original = string;
    }

    public String getOriginal(){
        return this.original;
    }

    public String removeDigits(){

        StringBuilder originalSb = new StringBuilder(this.original);
        StringBuilder newSb = new StringBuilder("");

        int len = originalSb.length();
        int i = 0;
        char ch;

        while (i < len){

            ch = originalSb.charAt(i);

            if (!Character.isDigit(ch))
                newSb.append(ch);
            i++;
        }
        return newSb.toString();
    }

    public String removeLetters(){

        StringBuilder originalSb = new StringBuilder(this.original);
        StringBuilder newSb = new StringBuilder("");

        int len = originalSb.length();
        int i = 0;
        char ch;

        while (i < len){

            ch = originalSb.charAt(i);

            if (!Character.isLetter(ch))
                newSb.append(ch);
            i++;
        }
        return newSb.toString();
    }
}
