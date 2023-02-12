import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MyStringBuilderTest {

    @Test
    void shouldInitializeInstanceVariable() {
        MyStringBuilder myStr1 = new MyStringBuilder("banana");
        MyStringBuilder myStr2 = new MyStringBuilder("epoxy");
        assertEquals("banana", myStr1.getOriginal());
        assertEquals("epoxy", myStr2.getOriginal());
    }

    @Test
    void removeDigits_shouldRemoveAllDigitsBasic() {
        MyStringBuilder mySB1 = new MyStringBuilder("h3ll0");
        assertEquals("hll", mySB1.removeDigits());
    }

    @Test
    void removeDigits_shouldRemoveAllDigitsHasPunctuation() {
        MyStringBuilder mySB1 = new MyStringBuilder("h3.ll0.!9bg");
        assertEquals("h.ll.!bg", mySB1.removeDigits());
    }

    @Test
    void removeDigits_shouldRemoveAllDigitsWhenNone() {
        MyStringBuilder mySB1 = new MyStringBuilder("Fantastical!!");
        assertEquals("Fantastical!!", mySB1.removeDigits());
    }

    @Test
    void removeDigits_shouldRemoveAllDigitsWhenNoLetters() {
        MyStringBuilder mySB1 = new MyStringBuilder("01234567890123456789");
        assertEquals("", mySB1.removeDigits());
    }

    @Test
    void removeDigits_shouldRemoveAllDigitsWithRepeatedDigits() {
        MyStringBuilder mySB1 = new MyStringBuilder("We11, I gu3ss s0. 3v3n n0s.");
        assertEquals("We, I guss s. vn ns.", mySB1.removeDigits());
    }

    @Test
    void removeLetters_shouldRemoveAllLettersBasic() {
        MyStringBuilder mySB1 = new MyStringBuilder("I am Number 1 or 2.!");
        assertEquals("   1  2.!", mySB1.removeLetters());
    }

    @Test
    void removeLetters_shouldRemoveAllLettersWhenNone() {
        MyStringBuilder mySB1 = new MyStringBuilder("372938..**77 ))");
        assertEquals("372938..**77 ))", mySB1.removeLetters());
    }

    @Test
    void removeLetters_shouldRemoveAllLettersWhenOnlyLetters() {
        MyStringBuilder mySB1 = new MyStringBuilder("OnlyLettersInThis");
        assertEquals("", mySB1.removeLetters());
    }
}
