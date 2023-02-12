
public class StarStringDemo {

    public static void main(String[] args) {

        String s = StarString.exploding("51d*w -*dff5 d**8d5-*");
        // expected: 51d-*-w --*-dff5 d-*--*-8d5--*-
        System.out.println(s);
    }
}
