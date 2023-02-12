import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TVShowTest {
    @Test
    void getters_shouldReturnRespectiveVariables() {
        TVShow tv1 = new TVShow("Happy Days", 0, 255, 1974);
        TVShow tv2 = new TVShow("I Love Lucy", 5, 180, 1951);
        assertEquals(1974, tv1.getStartYear());
        assertEquals(180, tv2.getNumEpisodes());
    }

    @Test
    void superClassVariablesShouldGetSet() {
        TVShow tv1 = new TVShow("Happy Days", 0, 255, 1974);
        TVShow tv2 = new TVShow("I Love Lucy", 5, 180, 1951);
        assertEquals(0, tv1.getAwardsWon());
        assertEquals(5, tv2.getAwardsWon());
    }
}