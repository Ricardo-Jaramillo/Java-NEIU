import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FileReaderTest {

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

    @Test
    void constructorShouldBePrivate() throws NoSuchMethodException {
        Constructor<FileReader> constructor = FileReader.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    }

    @Test
    void findSumFromFile1() {
        String filename = Paths.get("src", "main", "resources", "file1.txt").toString();
        assertEquals(1649, FileReader.findSumFromFile(filename));
    }

    @Test
    void findSumFromFile2() {
        String filename = Paths.get("src", "main", "resources", "file2.txt").toString();
        assertEquals(3860, FileReader.findSumFromFile(filename));
    }

    @Test
    void findSumFromFile3() {
        String filename = Paths.get("src", "main", "resources", "file3.txt").toString();
        assertEquals(1019914, FileReader.findSumFromFile(filename));
    }

    @Test
    void findSumFromFile4() {
        String filename = Paths.get("src", "main", "resources", "file4.txt").toString();
        assertEquals(0, FileReader.findSumFromFile(filename));
    }

    @Test
    void findSumFileNotFound() {
        String filename = Paths.get("src", "main", "resources", "file-foo.txt").toString();
        String output = "java.io.FileNotFoundException: " + filename + " (No such file or directory)\n";
        String output2 = "java.io.FileNotFoundException: " + filename + " (The system cannot find the file specified)\n";
        int sum = FileReader.findSumFromFile(filename);
        String actual = outContent.toString().replace("\r\n", "\n").replace("\r", "\n");
        boolean matchesEither = actual.equals(output) || actual.equals(output2);
        assertTrue(matchesEither);
        assertEquals(0, sum);
    }
}