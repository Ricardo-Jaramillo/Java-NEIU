public class Words {

    public static String separateWords(String string) {

        StringBuilder sb = new StringBuilder(string);

        int a = string.length();

        for (int i = 1; i < a; i++) {

            char ch1 = sb.charAt(i);

            if (Character.isUpperCase(ch1)) {
                sb.insert(i, " ");
                i += 1;
                a += 1;
            }
        }

        return sb.toString();
    }
}