import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class MyFileTest {
    @Test
    void shouldInitializeNameWithConstructors() {
        MyFile mf1 = new MyFile();
        MyFile mf2 = new MyFile("document.txt");
        assertEquals("file.txt", mf1.getName());
        assertEquals("document.txt", mf2.getName());
    }

    @Test
    void totalBytes_shouldSumNumbersInStringArray() {
        MyFile mf1 = new MyFile();
        String[] arr = {"22", "10", "9", "9"};
        assertEquals(50, mf1.totalBytes(arr));
    }


    @Test
    void onlyLetters_shouldReturnTrueForStringsContainingOnlyLetters() {
        assertTrue(MyFile.onlyLetters("Supercalifragilisticexpialidocious"));
        assertTrue(MyFile.onlyLetters("dictionary"));
        assertFalse(MyFile.onlyLetters("Hallelujah!"));
        assertFalse(MyFile.onlyLetters("What in tarnation?"));
    }


}