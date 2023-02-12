import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMathTest {

    @Test
    void shouldInitializeInstanceVariable() {
        StringMath sm1 = new StringMath("ba3jd0");
        StringMath sm2 = new StringMath("fjd92");
        assertEquals("ba3jd0", sm1.getValue());
        assertEquals("fjd92", sm2.getValue());
    }

    @Test
    void sumDigits_shouldReturnZeroIfNoDigits() {
        StringMath sm = new StringMath("happy");
        assertEquals(0, sm.sumDigits());
    }

    @Test
    void sumDigits_shouldReturnSumOfDigits() {
        StringMath sm = new StringMath("w99dk3?2kdj.f293ll1l1l");
        assertEquals(39, sm.sumDigits());
    }
}