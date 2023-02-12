import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TestWords {
    @Test
    void shouldReturnCorrectStringForCaseOne() {
        String s = "One Ring To Rule Them All";
        //assertEquals(s, Words.separateWords("OneRingToRuleThemAll"));
    }

    @Test
    void shouldReturnCorrectStringForCaseTwo() {
        String s = "In A Hole In The Ground There Lived A Hobbit";
        //assertEquals(s, Words.separateWords("InAHoleInTheGroundThereLivedAHobbit"));
    }

}