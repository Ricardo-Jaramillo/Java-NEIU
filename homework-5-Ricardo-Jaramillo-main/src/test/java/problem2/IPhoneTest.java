package problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPhoneTest {

    @Test
    void shouldTestGetGenerationInIPhone() {
        IPhone phone = new IPhone("IPhone 6 Plus", 550.99, 392, "6 Plus");
        assertEquals("6 Plus", phone.getGeneration());
    }

    @Test
    void shouldTestInheritanceForIPhone() {
        IPhone phone = new IPhone("IPhone X", 800.99, 38393223, "X");
        assertEquals(800.99, phone.getPrice());
        phone.setPrice(801.22);
        assertEquals(801.22, phone.getPrice());
    }

    @Test
    void shouldTestToStringInIPhone() {
        IPhone phone = new IPhone("IPhone 8", 1000.35, 34599999, "8");
        String result = "IPhone 8 34599999 8";
        assertEquals(result, phone.toString());
    }
}