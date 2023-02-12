import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StringInfoTest {

    @Test
    void shouldInitializeInstanceVariable() {
        StringInfo str1 = new StringInfo("sjdhfdislsnabsdf");
        StringInfo str2 = new StringInfo("This is a sentence");
        assertEquals("sjdhfdislsnabsdf", str1.getLetters());
        assertEquals("This is a sentence", str2.getLetters());
    }

    @Test
    void moreThanThree_ShouldReturnTrueIfMoreThanThreeOccurrences() {
        StringInfo str1 = new StringInfo("yellowwood door");
        assertTrue(str1.moreThanThree('o'));
    }

    @Test
    void moreThanThree_ShouldReturnFalseIfThreeOccurrences() {
        StringInfo str1 = new StringInfo("cross-section");
        assertFalse(str1.moreThanThree('s'));
    }

    @Test
    void moreThanThree_ShouldReturnFalseIfNoOccurrences() {
        StringInfo str1 = new StringInfo("anaphylactic");
        assertFalse(str1.moreThanThree('q'));
    }
}
