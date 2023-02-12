package problem1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SwimmingTest {

    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;

    @BeforeEach
    void setUpStreams() {
        this.outContent = new ByteArrayOutputStream();
        this.errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    // ---------------------TESTS ARE BELOW THIS LINE------------------------------------

    @Test
    void getNameShouldReturnSwimming() {
        Swimming s = new Swimming();
        assertEquals("Swimming", s.getName());
    }

    @Test
    void getNumberOfPlayersShouldReturnOne() {
        Swimming s = new Swimming();
        assertEquals(1, s.getNumberOfPlayers());
    }

    @Test
    void isTeamSportShouldReturnTrue() {
        Swimming s = new Swimming();
        assertFalse(s.isTeamSport());
    }

    @Test
    void addResultShouldUpdateArrayToHoldMoreValues() {
        Swimming s = new Swimming();
        s.addResult(1);
        s.addResult(3);
        s.addResult(4);
        s.addResult(1);
        assertArrayEquals(new int[]{1, 3, 4, 1}, s.getResults());
    }

    @Test
    void addResultShouldThrowExceptionIfValueNot0Or1() {
        Swimming s = new Swimming();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> s.addResult(0));
        assertEquals("Value must be 1 or higher", exception.getMessage());
        exception = assertThrows(IllegalArgumentException.class, () -> s.addResult(-5));
        assertEquals("Value must be 1 or higher", exception.getMessage());
    }

    @Test
    void getResultsShouldBeLengthZeroIfNoResults() {
        Swimming s = new Swimming();
        int[] results = s.getResults();
        assertEquals(0, results.length);
    }

    @Test
    void getResultsShouldReturnCloneOfResults() {
        Swimming s = new Swimming();
        s.addResult(2);
        int[] results = s.getResults();
        results[0] = 1;
        assertFalse(Arrays.equals(results, s.getResults()));
    }

    @Test
    void printCurrentStandingShouldDisplayNoStandingYetIfNoResults() {
        Swimming s = new Swimming();
        s.printCurrentStanding();
        String actual = outContent.toString().replace("\r\n", "\n")
                .replace("\r", "\n");
        assertEquals("No standing yet\n", actual);
    }

    @Test
    void printCurrentStandingShouldDisplayStandingResults() {
        Swimming s = new Swimming();
        s.addResult(2);
        s.addResult(3);
        s.printCurrentStanding();
        String actual = outContent.toString().replace("\r\n", "\n")
                .replace("\r", "\n");
        String expected = "Current standing: " + (5.0/2) + "\n";
        assertEquals(expected , actual);
    }
}