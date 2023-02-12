
public class StringMath {

    public String value;

    public StringMath(String value){
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }

    public int sumDigits(){

        StringBuilder sb = new StringBuilder(this.value);
        int len = sb.length();
        int sum = 0;
        int i = 0;
        char ch;

        while (i < len){
            ch = sb.charAt(i);
            if (Character.isDigit(ch)){
                sum += Integer.parseInt(String.valueOf(ch));
            }
            i++;
        }

        return sum;
    }
}
