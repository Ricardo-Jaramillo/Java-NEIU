package problem1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BaseballTest {

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
    void getNameShouldReturnBaseball() {
        Baseball b = new Baseball();
        assertEquals("Baseball", b.getName());
    }

    @Test
    void getNumberOfPlayersShouldReturnNine() {
        Baseball b = new Baseball();
        assertEquals(9, b.getNumberOfPlayers());
    }

    @Test
    void isTeamSportShouldReturnTrue() {
        Baseball b = new Baseball();
        assertTrue(b.isTeamSport());
    }

    @Test
    void addResultShouldUpdateArrayToHoldMoreValues() {
        Baseball b = new Baseball();
        b.addResult(0);
        b.addResult(1);
        b.addResult(1);
        b.addResult(0);
        assertArrayEquals(new int[]{0, 1, 1, 0}, b.getResults());
    }

    @Test
    void addResultShouldThrowExceptionIfValueNot0Or1() {
        Baseball b = new Baseball();
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> b.addResult(5));
        assertEquals("Value must be 0 or 1", exception.getMessage());
    }

    @Test
    void getResultsShouldBeLengthZeroIfNoResults() {
        Baseball b = new Baseball();
        int[] results = b.getResults();
        assertEquals(0, results.length);
    }

    @Test
    void getResultsShouldReturnCloneOfResults() {
        Baseball b = new Baseball();
        b.addResult(0);
        int[] results = b.getResults();
        results[0] = 1;
        assertFalse(Arrays.equals(results, b.getResults()));
    }

    @Test
    void printCurrentStandingShouldDisplayNoStandingYetIfNoResults() {
        Baseball b = new Baseball();
        b.printCurrentStanding();
        String actual = outContent.toString().replace("\r\n", "\n")
                                    .replace("\r", "\n");
        assertEquals("No standing yet\n", actual);
    }

    @Test
    void printCurrentStandingShouldDisplayStandingResults() {
        Baseball b = new Baseball();
        b.addResult(1);
        b.addResult(0);
        b.printCurrentStanding();
        String actual = outContent.toString().replace("\r\n", "\n")
                .replace("\r", "\n");
        String expected = "Current standing: " + (1.0/2) + "\n";
        assertEquals(expected , actual);
    }
}