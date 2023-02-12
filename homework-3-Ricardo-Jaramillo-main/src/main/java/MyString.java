public class MyString {

    private String original;

    public MyString(String original){

        this.original = original;
    }

    public String getOriginal(){

        return this.original;
    }

    public String removeVowels(){

        String newString = new String(this.original);

        return newString.replaceAll("[aeiouAEIOU]", "");

        // could also be:
        // return newString.replace("a","").replace("A", "").replace("e", "").replace("E", "").replace("i", "").replace("I", "").replace("o", "").replace("O", "").replace("u", "").replace("U", "");
    }

    public String removeNonVowels(){

        String newString = new String(this.original);

        return newString.replaceAll("[^aeiouAEIOU]","");
    }
}
