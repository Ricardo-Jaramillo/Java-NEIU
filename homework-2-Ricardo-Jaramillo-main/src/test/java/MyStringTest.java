import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MyStringTest {

    @Test
    void shouldInitializeInstanceVariable() {
        MyString myStr1 = new MyString("banana");
        MyString myStr2 = new MyString("epoxy");
        assertEquals("banana", myStr1.getOriginal());
        assertEquals("epoxy", myStr2.getOriginal());
    }

    @Test
    void removeVowels_shouldRemoveAllVowelsFromOriginal() {
        MyString myStr1 = new MyString("ThE quick Brown fOx jumps oVer the lAzy dog");
        assertEquals("Th qck Brwn fx jmps Vr th lzy dg", myStr1.removeVowels());
        assertEquals("ThE quick Brown fOx jumps oVer the lAzy dog", myStr1.getOriginal());
    }

    @Test
    void removeVowels_shouldNotRemoveVowelsIfNoneExist() {
        MyString myStr2 = new MyString("nymphly");
        assertEquals("nymphly", myStr2.removeVowels());
        assertEquals("nymphly", myStr2.getOriginal());
    }

    @Test
    void removeNonVowels_shouldRemoveAllConsonantsFromOriginal() {
        MyString myStr1 = new MyString("ThE quick Brown fOx jumps oVer the lAzy dog");
        assertEquals("EuioOuoeeAo", myStr1.removeNonVowels());
        assertEquals("ThE quick Brown fOx jumps oVer the lAzy dog", myStr1.getOriginal());
    }

    @Test
    void removeNonVowels_shouldNotRemoveNonVowelsIfNoneExist() {
        MyString myStr2 = new MyString("Euouae");
        assertEquals("Euouae", myStr2.removeNonVowels());
        assertEquals("Euouae", myStr2.getOriginal());
    }
}
