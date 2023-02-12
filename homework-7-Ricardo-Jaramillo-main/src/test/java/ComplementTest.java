import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplementTest {

    @Test
    void constructorShouldThrowExceptionIfNull() {
        Throwable exception = assertThrows(NullPointerException.class, () -> new Complement(null));
        assertEquals("Null binary string", exception.getMessage());
    }

    @Test
    void constructorShouldThrowExceptionIfInvalidString() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Complement("01gh291"));
        assertEquals("Not a valid binary number", exception.getMessage());
    }

    @Test
    void constructorShouldThrowExceptionIfEmptyString() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> new Complement(""));
        assertEquals("Not a valid binary number", exception.getMessage());
    }

    @Test
    void getBinaryShouldRetrieveValue() {
        Complement c = new Complement("0111001101");
        assertEquals("0111001101", c.getBinary());
    }

    @Test
    void onesComplementShouldSwitchValuesCase1() {
        Complement c = new Complement("0111001101");
        assertEquals("1000110010", c.onesComplement());
    }

    @Test
    void onesComplementShouldSwitchValuesCase2() {
        Complement c = new Complement("1111");
        assertEquals("0000", c.onesComplement());
    }

    @Test
    void onesComplementShouldSwitchValuesCase3() {
        Complement c = new Complement("00000");
        assertEquals("11111", c.onesComplement());
    }
}