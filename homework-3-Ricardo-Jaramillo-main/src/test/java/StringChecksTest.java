import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class StringChecksTest {

    @Test
    void sameSides_shouldReturnTrueForSameNumberOfVowels() {
        assertTrue(StringChecks.sameSides("stYx"));
        assertTrue(StringChecks.sameSides("aE"));
        assertTrue(StringChecks.sameSides("eUlogiAe"));
    }

    @Test
    void sameSides_shouldReturnFalseForDifferentNumberOfVowels() {
        assertFalse(StringChecks.sameSides("Hippopotamus"));
        assertFalse(StringChecks.sameSides("af"));
        assertFalse(StringChecks.sameSides("EpopoeIa"));
    }

    @Test
    void anagram_shouldHaveSameLettersButDifferentLengths() {
        assertFalse(StringChecks.anagram("banana", "bananab"));
    }

    @Test
    void anagram_shouldHaveSameLengthAndSimilarLettersButDifferentCounts() {
        assertFalse(StringChecks.anagram("happy", "phahy"));
    }

    @Test
    void anagram_shouldHaveDifferentLengthsSwapParams() {
        assertFalse(StringChecks.anagram("happ", "happy"));
    }

    @Test
    void anagram_shouldBeAnagrams() {
        assertTrue(StringChecks.anagram("orchestra", "carthorse"));
    }

    @Test
    void anagram_shouldBeAnagramsWithSameStartingLetter() {
        assertTrue(StringChecks.anagram("parliament", "partialmen"));
    }
}
