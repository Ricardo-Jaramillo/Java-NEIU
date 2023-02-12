import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StarStringTest {

    @Test
    void exploding_shouldTestBasicCase() {
        assertEquals("ab-*-cd", StarString.exploding("ab*cd"));
    }

    @Test
    void exploding_shouldTestSingleAsterisk() {
        assertEquals("-*-", StarString.exploding("*"));
    }

    @Test
    void exploding_shouldTestSequentialAsterisks() {
        assertEquals("ab-*--*-cd", StarString.exploding("ab**cd"));
    }

    @Test
    void exploding_shouldTestEndingAsterisks() {
        assertEquals("yaya-*--*-", StarString.exploding("yaya**"));
    }

    @Test
    void exploding_shouldTestLotsOfSequentialAsterisks() {
        assertEquals("-*--*--*--*--*--*--*--*-", StarString.exploding("********"));
    }

    @Test
    void exploding_shouldTestAlternatingAsterisks() {
        assertEquals("b-*-n-*-n-*-", StarString.exploding("b*n*n*"));
    }

}