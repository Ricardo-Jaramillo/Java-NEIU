import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class VideoTest {
    @Test
    void getAwardsWon_shouldReturnAwardsWon() {
        Video v1 = new Video("Forrest Gump", 5);
        Video v2 = new Video("Carrie", 1);
        assertEquals(5, v1.getAwardsWon());
        assertEquals(1, v2.getAwardsWon());
    }

    @Test
    void setAwardsWon_shouldReturnAwardsWon() {
        Video v1 = new Video("Forrest Gump", 5);
        Video v2 = new Video("Carrie", 1);
        v1.setAwardsWon(2);
        v2.setAwardsWon(4);
        assertEquals(2, v1.getAwardsWon());
        assertEquals(4, v2.getAwardsWon());
    }

    @Test
    void toString_shouldReturnInstanceVariables() {
        Video v1 = new Video("Ghostbusters", 0);
        Video v2 = new Video("The Little Mermaid", 3);
        assertEquals("Title: Ghostbusters\nAwards Won: 0", v1.toString());
        assertEquals("Title: The Little Mermaid\nAwards Won: 3", v2.toString());
    }
}