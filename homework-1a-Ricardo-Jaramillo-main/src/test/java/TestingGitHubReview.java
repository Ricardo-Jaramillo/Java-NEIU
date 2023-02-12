import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestingGitHubReview {
    @Test
    void isOddShouldReturnTrueForOddNumber() {
        assertEquals(true, GitHubReview.isOdd(33));
    }

    @Test
    void isOddShouldReturnFalseForEvenNumber() {
        assertEquals(false, GitHubReview.isOdd(12));
    }

    @Test
    void isEvenShouldReturnTrueForOddNumber() {
        assertEquals(false, GitHubReview.isEven(33));
    }

    @Test
    void isEvenShouldReturnFalseForEvenNumber() {
        assertEquals(true, GitHubReview.isEven(12));
    }

}
