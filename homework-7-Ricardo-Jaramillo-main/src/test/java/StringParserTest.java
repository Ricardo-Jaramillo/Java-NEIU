import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StringParserTest {

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
        Constructor<StringParser> constructor = StringParser.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()));
    }

    @Test
    void findIntegerShouldFindValueNotMatchingChars() {
        StringParser.findInteger("rugtsbckgus!32*", '!', '*');
        String actual = outContent.toString().replace("\r\n", "\n").replace("\r", "\n");
        assertEquals("Result: 17\n", actual);
    }

    @Test
    void findIntegerShouldFindValueNotMatchingCharsCase2() {
        StringParser.findInteger("w38292s", 'w', 's');
        String actual = outContent.toString().replace("\r\n", "\n").replace("\r", "\n");
        assertEquals("Result: 7659\n", actual);
    }

    @Test
    void findIntegerShouldFindValueMatchingChars() {
        StringParser.findInteger("gafh8902hddd", 'h', 'h');
        String actual = outContent.toString().replace("\r\n", "\n").replace("\r", "\n");
        assertEquals("Result: 2226\n", actual);
    }

    @Test
    void findIntegerShouldFindEmptyString() {
        StringParser.findInteger("fjdsf^&dlP", '^', '&');
        String expected = "Invalid integer\n";
        expected += "java.lang.NumberFormatException: For input string: \"\"\n";
        String actual = outContent.toString().replace("\r\n", "\n").replace("\r", "\n");
        assertEquals(expected, actual);
    }

    @Test
    void findIntegerShouldFindInvalidValue() {
        StringParser.findInteger("bana*dkstlooo", '*', 't');
        String expected = "Invalid integer\n";
        expected += "java.lang.NumberFormatException: For input string: \"dks\"\n";
        String actual = outContent.toString().replace("\r\n", "\n").replace("\r", "\n");
        assertEquals(expected, actual);
    }

    @Test
    void findIntegerShouldFindInvalidValueCase2() {
        StringParser.findInteger("g5783sd", 'g', 'd');
        String expected = "Invalid integer\n";
        expected += "java.lang.NumberFormatException: For input string: \"5783s\"\n";
        String actual = outContent.toString().replace("\r\n", "\n").replace("\r", "\n");
        assertEquals(expected, actual);
    }
}