
public class StarString {

    public static String exploding(String string){

        StringBuilder sb = new StringBuilder(string);

        int i = sb.indexOf("*");

        while (i != -1){
            sb.replace(i, i + 1,"-*-");
            i = sb.indexOf("*", i + 2);
        }

        return sb.toString();
    }
}
