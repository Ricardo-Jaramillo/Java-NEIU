package problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleDeviceTest {

    @Test
    void shouldTestGetPriceInAppleDevice() {
        AppleDevice ad = new AppleDevice("AD", 200.39, 193873);
        assertEquals(200.39, ad.getPrice());
    }

    @Test
    void shouldTestSetPriceInAppleDevice() {
        AppleDevice ad = new AppleDevice("AD1", 103.48, 2019283);
        ad.setPrice(142.67);
        assertEquals(142.67, ad.getPrice());
    }

    @Test
    void shouldTestToStringInAppleDevice() {
        AppleDevice ad = new AppleDevice("AD2", 800.33, 29839323);
        String result = "AD2 29839323";
        assertEquals(result, ad.toString());
    }
}