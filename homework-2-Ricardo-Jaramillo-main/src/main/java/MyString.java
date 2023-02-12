
public class MyString {

    private final String original;

    public MyString(String string){
        this.original = string;
    }

    public String getOriginal(){
        return this.original;
    }

    public String removeVowels(){

        String new_string = "";
        String s = this.getOriginal();
        int len = s.length();
        char a;

        for (int i = 0; i < len; i++){
            a = s.charAt(i);
            if (a != 'a' && a != 'A' && a != 'e' && a != 'E' && a != 'i' && a != 'I' && a != 'o' && a != 'O' && a != 'u' && a != 'U'){
                new_string += a;
            }
        }
        return new_string;
    }

    public String removeNonVowels(){

        String new_string = "";
        String s = this.getOriginal();
        int len = s.length();
        char a;

        for (int i = 0; i < len; i++){
            a = s.charAt(i);
            if (a == 'a' || a == 'A' || a == 'e' || a == 'E' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u' || a == 'U'){
                new_string += a;
            }
        }
        return new_string;
    }
}
