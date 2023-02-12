public class StringMath {

    public static int sumNumbers(String value){

        int sum = 0;
        int len = value.length();
        char ch;
        StringBuilder sb = new StringBuilder(value);
        StringBuilder numbers = new StringBuilder();

        for(int i = 0; i < len; i++){

            ch = sb.charAt(i);

            if (Character.isDigit(ch)){

                numbers.append(ch);

            }else if (numbers.length() > 0){

                sum += Integer.parseInt(numbers.toString());
                numbers.delete(0, numbers.length());
            }
        }
        if (numbers.length() > 0){

            sum += Integer.parseInt(numbers.toString());
            System.out.println(sum);
        }

        return sum;
    }
}
