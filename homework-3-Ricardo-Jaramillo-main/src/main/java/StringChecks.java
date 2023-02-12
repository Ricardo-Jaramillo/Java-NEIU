public class StringChecks {

    public StringChecks(){

    }

    public static boolean sameSides(String string){

        int len = string.length();
        String s1 = string.substring(0, len/2).replaceAll("[^aeiouAEIOU]","");
        String s2 = string.substring(len / 2).replaceAll("[^aeiouAEIOU]","");

        return s1.length() == s2.length();
    }

    public static boolean anagram(String s1, String s2){
        
        boolean flag = true;

        int len1, len2;

        if (s1.length() == s2.length()){

            for (int i = 0; i < s1.length(); i++){

                String ch = new String("");
                ch += s1.charAt(i);
                String newS1 = new String(s1.replace(ch, ""));
                String newS2 = new String(s2.replace(ch, ""));

                len1 = newS1.length();
                len2 = newS2.length();

                if (len1 != len2) {
                    flag = false;
                    break;
                }
            }
        }
        else
            flag = false;

        return flag;
    }
}