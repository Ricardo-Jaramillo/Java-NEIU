import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StringMathTest {
    @Test
    void sumNumbers_shouldReturnZeroIfNoNumbers() {
        assertEquals(0, StringMath.sumNumbers("NoNumbersHere"));
    }

    @Test
    void sumNumbers_shouldReturnSumOfNumbers() {
        assertEquals(57, StringMath.sumNumbers("asd52rty4 sd1"));
    }

}