import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestingArrayFunctions {
    @Test
    void averageOfEvensShouldReturnCorrectAverageFor2DArray() {
        int[] intArr1 = {2, 5, 8, 1, 4, 9};
        int[] intArr2 = {1, 4, 9, 11, 2, 2};
        int[] intArr3 = {4, 8, 2, 5, 1, 3};
        int[][] arr = {intArr1, intArr2, intArr3};
        assertEquals(36.0/9, ArrayFunctions.averageOfEvens(arr));
    }

    @Test
    void averageOfEvensShouldReturnCorrectAverageFor2DAnd1DArrays() {
        int[] intArr1 = {2, 5, 8, 1, 4, 9};
        int[] intArr2 = {1, 4, 9, 11, 2, 2};
        int[] intArr3 = {4, 8, 2, 5, 1, 3};
        int[][] arr = {intArr1, intArr2};
        assertEquals(36.0/9, ArrayFunctions.averageOfEvens(arr, intArr3));
    }

    @Test
    void countWordsStartingWithCharShouldReturnCorrectCount() {
        String[] arr = {"habitat", "gorilla", "home", "zoo", "horticulture"};
        assertEquals(3, ArrayFunctions.countWordsStartingWithChar(arr, 'h'));
    }

    @Test
    void startsWithShouldReturnFalseForString() {
        int[] intArr1 = {2, 4, 9};
        int[] intArr2 = {1, 4, 9, 11};
        int[] intArr3 = {4, 8, 2, 5, 1, 3};
        int[][] arr = {intArr1, intArr2, intArr3};
        int[] shouldEqual = {2, 4, 9, 1, 4, 9, 11, 4, 8, 2, 5, 1, 3};
        int[] result = ArrayFunctions.flattenArray(arr);
        assertEquals(true, Arrays.equals(shouldEqual, result));
    }
}
