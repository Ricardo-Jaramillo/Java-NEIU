package problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexNumberTest {

    @Test
    void toStringShouldReturnZerosForRealAndImaginary() {
        ComplexNumber c = new ComplexNumber();
        assertEquals("0 + 0i", c.toString());
    }

    @Test
    void toStringShouldReturnZeroForImaginary() {
        ComplexNumber c = new ComplexNumber(5);
        assertEquals("5 + 0i", c.toString());
    }

    @Test
    void toStringShouldReturnValuesForRealAndImaginary() {
        ComplexNumber c = new ComplexNumber(9, 2);
        assertEquals("9 + 2i", c.toString());
    }

    @Test
    void toStringShouldReturnNegValuesForImaginary() {
        ComplexNumber c = new ComplexNumber(4, -4);
        assertEquals("4 - 4i", c.toString());
    }

    @Test
    void toStringShouldReturnNegValuesForRealAndImaginary() {
        ComplexNumber c = new ComplexNumber(-10, -20);
        assertEquals("-10 - 20i", c.toString());
    }

    @Test
    void equalsShouldReturnFalseForNullParameter() {
        ComplexNumber c = new ComplexNumber(2, 4);
        assertFalse(c.equals(null));
    }

    @Test
    void equalsShouldReturnFalseForDifferentObjectType() {
        ComplexNumber c = new ComplexNumber(2, 4);
        String s = "foo";
        assertFalse(c.equals(s));
    }

    @Test
    void equalsShouldReturnFalseForDifferentRealAndImaginary() {
        ComplexNumber c = new ComplexNumber(2, 4);
        ComplexNumber c2 = new ComplexNumber(-3, 5);
        ComplexNumber c3 = new ComplexNumber(2, 5);
        assertFalse(c.equals(c2));
        assertFalse(c.equals(c3));
        assertFalse(c2.equals(c3));
    }

    @Test
    void equalsShouldReturnTrueIfSameRealAndImaginary() {
        ComplexNumber c2 = new ComplexNumber(-3, 5);
        ComplexNumber c3 = new ComplexNumber(-3, 5);
        assertTrue(c2.equals(c3));
    }

    @Test
    void compareToShouldReturnPositiveNumberForBiggerThis() {
        ComplexNumber c2 = new ComplexNumber(19, 2);
        ComplexNumber c3 = new ComplexNumber(12, 3);
        assertEquals(7, c2.compareTo(c3));
    }

    @Test
    void compareToShouldReturnNegativeNumberForSmallerThis() {
        ComplexNumber c2 = new ComplexNumber(4, 8);
        ComplexNumber c3 = new ComplexNumber(9, 7);
        assertEquals(-5, c2.compareTo(c3));
    }

    @Test
    void compareToShouldReturnZeroForEqualRealParts() {
        ComplexNumber c2 = new ComplexNumber(5, 3);
        ComplexNumber c3 = new ComplexNumber(5, 4);
        assertEquals(0, c2.compareTo(c3));
    }
}