
public class StringMathDemo {

    public static void main(String[] args) {

        StringMath test = new StringMath("45r8@5 4!*%5 6ft58");
        // expected: 50
        System.out.println(test.sumDigits());
    }
}
