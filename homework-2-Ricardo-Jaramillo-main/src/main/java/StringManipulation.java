
public class StringManipulation {

    private StringManipulation(){

    }

    public static boolean areRelated(String s1, String s2, String s3){

        boolean flag = false;

        for (int i = 0; i < s1.length(); i++){
            if ((s2 + s1.charAt(i)).equals(s3)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
