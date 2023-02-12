public class MyFile {

    private String name;

    public MyFile(){
        this.name = "file.txt";
    }

    public MyFile(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int totalBytes(String[] lengths){
        int sum = 0;
        for (int i = 0; i < lengths.length; i++){
            sum += Integer.parseInt(lengths[i]);
        }

        return sum;
    }

    public static boolean onlyLetters(String s){

        /*
        for (int i = 0; i < s.length(); i++){
            if (!Character.isLetter(s.charAt(i))){
                return false;
            }
        }
        return true;
        */

        /*
        if (s.matches(".*[^a-zA-Z].*")){
            return false;
        }else {
            return true;
        }
         */

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++){
            if (!Character.isLetter(sb.charAt(i))){
                return false;
            }
        }
        return true;
    }

}
