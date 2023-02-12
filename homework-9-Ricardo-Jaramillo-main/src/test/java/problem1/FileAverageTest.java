package problem1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileAverageTest {

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

    // ----------------- TESTS START HERE ----------------------------------

    @Test
    void constructorShouldBePrivate() throws NoSuchMethodException {
        Constructor<FileAverage> constructor = FileAverage.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    }

    @Test
    void findSumFromFile1() {
        String filename = Paths.get("src", "main", "resources", "file1.txt").toString();
        assertEquals(7.0, FileAverage.averageOfLineAverages(filename));
    }

    @Test
    void findSumFromFile2() {
        String filename = Paths.get("src", "main", "resources", "file2.txt").toString();
        double result = FileAverage.averageOfLineAverages(filename);
        double expected = 51.12437272727273;
        assertTrue(Math.abs(expected - result) < 0.01);
    }

    @Test
    void findSumFromFile3() {
        String filename = Paths.get("src", "main", "resources", "file3.txt").toString();
        assertEquals(0.0, FileAverage.averageOfLineAverages(filename));
    }

    @Test
    void findSumFileNotFound() {
        String filename = Paths.get("src", "main", "resources", "file-foo.txt").toString();
        String output = "java.io.FileNotFoundException: ";
        double result = FileAverage.averageOfLineAverages(filename);
        String actual = outContent.toString();
        assertTrue(actual.contains(output));
        assertEquals(0, result);
    }
}