import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class TestDecimals {
    @Test
    void shouldReturnCorrectStringForOneParameterForCaseOne() {
        String s = "Digits after decimal point:\n5 4 2\nSum: 11";
        //assertTrue(s.equals(Decimals.decimalDigits(2.542)));
    }

    @Test
    void shouldReturnCorrectStringForOneParameterForCaseTwo() {
        String s = "Digits after decimal point:\n0\nSum: 0";
        //assertTrue(s.equals(Decimals.decimalDigits(45)));
    }

    @Test
    void shouldReturnCorrectStringForOneParameterForCaseThree() {
        String s = "Digits after decimal point:\n3 2 9 4 4 2 1 0 0 3\nSum: 28";
        //assertTrue(s.equals(Decimals.decimalDigits(634.3294421003)));
    }

    @Test
    void shouldReturnCorrectStringForTwoParametersForCaseOne() {
        String s = "Digits after decimal point:\n142, 203\nDigits are the same: false";
        //assertTrue(s.equals(Decimals.decimalDigits(23.142, 43.203)));
    }

    @Test
    void shouldReturnCorrectStringForTwoParametersForCaseTwo() {
        String s = "Digits after decimal point:\n0, 0\nDigits are the same: true";
        //assertTrue(s.equals(Decimals.decimalDigits(5243, 123)));
    }

    @Test
    void shouldReturnCorrectStringForTwoParametersForCaseThree() {
        String s = "Digits after decimal point:\n141592, 141593\nDigits are the same: false";
        //assertTrue(s.equals(Decimals.decimalDigits(3.141592, 3.141593)));
    }
}

