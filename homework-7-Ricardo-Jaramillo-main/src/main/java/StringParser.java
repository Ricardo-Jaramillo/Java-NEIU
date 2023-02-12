public class StringParser {

    private StringParser(){
    }

    public static void findInteger(String s, char ch1, char ch2){

        int a = s.indexOf(ch1);
        int b = s.indexOf(ch2, a + 1);
        String num = s.substring(a + 1, b);

        try{
            int result;
            result = (Integer.parseInt(num) / num.length()) + 1;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e){
            System.out.println("Invalid integer");
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        findInteger("gf5885xz*!k", 'f', 'x');
        findInteger("vhu45*!k", 'u', '!');
        findInteger("hsga", 's', 'a' );
        findInteger("!hus*58900%*", '*', '%');
        findInteger("po3432&", 'p', '&');
    }
}
