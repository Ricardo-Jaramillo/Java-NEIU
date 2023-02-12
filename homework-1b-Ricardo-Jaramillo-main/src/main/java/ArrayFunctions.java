public class ArrayFunctions {

    public static double averageOfEvens(int[][] arr2D){
        double sum = 0;
        int counter = 0;

        for (int i = 0; i < arr2D.length; i++){
            for (int j = 0; j < arr2D[i].length; j++){
                if(arr2D[i][j] % 2 == 0) {
                    sum += arr2D[i][j];
                    counter++;
                }
            }
        }
        return sum/counter;
    }

    public static double averageOfEvens(int[][] arr2D, int[] arr1D){
        double sum = 0;
        int counter = 0;

        int len2 = arr2D.length;
        int len1 = arr1D.length;

        for (int i = 0; i < len2; i++){
            for (int j = 0; j < len1; j++){
                if(arr2D[i][j] % 2 == 0) {
                    sum += arr2D[i][j];
                    counter++;
                }
            }
        }
        for (int j = 0; j < len1; j++){
            if(arr1D[j] % 2 == 0) {
                sum += arr1D[j];
                counter++;
            }
        }
        return sum/counter;
    }

    public static int countWordsStartingWithChar(String[] words, char a){
        int n = 0;

        for (int i = 0; i < words.length; i++){
            if(words[i].charAt(0) == a) {
                n++;
            }
        }
        return n;
    }

    public static int[] flattenArray(int[][] arr2D){
        int len = arr2D.length;
        int i;
        int lenArr = 0;

        for (i = 0; i < len; i++){
            lenArr += arr2D[i].length;
        }

        int[] arr = new int[lenArr];
        int counter = 0;

        for (i = 0; i < len; i++){
            for (int j = 0; j < arr2D[i].length; j++) {
                arr[counter]= arr2D[i][j];
                counter++;
            }
        }
        return arr;
    }
}
