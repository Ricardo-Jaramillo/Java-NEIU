package problem2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberFileTest {

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
        Constructor<RandomNumberFile> constructor = RandomNumberFile.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    }

    @Test
    void writeRandomNumbersPrintWriterCase1() {
        String filename = Paths.get("src", "main", "resources", "rand1.txt").toString();
        RandomNumberFile.writeRandomNumbersPrintWriter(filename, 10, 5);
        assertTrue(checkFile(filename, 10, 5));
    }

    @Test
    void writeRandomNumbersPrintWriterCase2() {
        String filename = Paths.get("src", "main", "resources", "rand2.txt").toString();
        RandomNumberFile.writeRandomNumbersPrintWriter(filename, 20, 3);
        assertTrue(checkFile(filename, 20, 3));
    }

    @Test
    void writeRandomNumbersPrintWriterCase3() {
        String filename = Paths.get("src", "main", "resources", "rand3.txt").toString();
        RandomNumberFile.writeRandomNumbersPrintWriter(filename, 199, 11);
        assertTrue(checkFile(filename, 199, 11));
    }

    @Test
    void writeRandomNumbersPrintWriterIOException() {
        String filename = Paths.get("src", "main", "resources").toString();
        RandomNumberFile.writeRandomNumbersPrintWriter(filename, 2, 2);
        String output = "java.io.FileNotFoundException: ";
        String actual = outContent.toString();
        assertTrue(actual.contains(output));
        assertFalse(checkFile(filename, 2, 2));
    }

    @Test
    void writeRandomNumbersBufferedWriterCase1() {
        String filename = Paths.get("src", "main", "resources", "rand1.txt").toString();
        RandomNumberFile.writeRandomNumbersBufferedWriter(filename, 10, 5);
        assertTrue(checkFile(filename, 10, 5));
    }

    @Test
    void writeRandomNumbersBufferedWriterCase2() {
        String filename = Paths.get("src", "main", "resources", "rand2.txt").toString();
        RandomNumberFile.writeRandomNumbersBufferedWriter(filename, 20, 3);
        assertTrue(checkFile(filename, 20, 3));
    }

    @Test
    void writeRandomNumbersBufferedWriterCase3() {
        String filename = Paths.get("src", "main", "resources", "rand3.txt").toString();
        RandomNumberFile.writeRandomNumbersBufferedWriter(filename, 199, 11);
        assertTrue(checkFile(filename, 199, 11));
    }

    @Test
    void writeRandomNumbersBufferedWriterIOException() {
        String filename = Paths.get("src", "main", "resources").toString();
        RandomNumberFile.writeRandomNumbersBufferedWriter(filename, 2, 2);
        String output = "java.io.FileNotFoundException: ";
        String actual = outContent.toString();
        assertTrue(actual.contains(output));
        assertFalse(checkFile(filename, 2, 2));
    }


    // -------------------HELPER METHOD - DON'T TOUCH----------------------------
    private boolean checkFile(String filename, int n, int lineCount) {
        boolean correct;
        try (FileReader fr = new FileReader(filename);
             BufferedReader br = new BufferedReader(fr)) {

            int count = 0, lines = 0;
            while (br.ready()) {
                String line = br.readLine();
                String[] numbers = line.split(", ");
                count += numbers.length;
                lines++;
            }
            correct = lines == Math.ceil((double) n / lineCount) && count == n;
        } catch (IOException e) {
            correct = false;
        }
        return correct;
    }
}