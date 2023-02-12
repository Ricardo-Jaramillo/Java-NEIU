import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class MovieTest {
    @Test
    void getters_shouldReturnRespectiveVariables() {
        Movie m1 = new Movie("The Matrix", 8, 136, "The Wachowskis");
        Movie m2 = new Movie("The Fifth Element", 6, 126, "Luc Besson");
        assertEquals(136, m1.getLength());
        assertEquals("Luc Besson", m2.getDirector());
    }

    @Test
    void superClassVariablesShouldGetSet() {
        Movie m1 = new Movie("The Matrix", 8, 136, "The Wachowskis");
        Movie m2 = new Movie("The Fifth Element", 6, 126, "Luc Besson");
        assertEquals(8, m1.getAwardsWon());
        assertEquals(6, m2.getAwardsWon());
    }

    /*@Test
    void toString_shouldReturnAllVariables() {
        Movie m1 = new Movie("Pan's Labyrinth", 27, 119, "Guillermo del Toro");
        Movie m2 = new Movie("Child's Play", 1, 87, "Tom Holland");
        assertEquals("Title: Pan's Labyrinth\nAwards Won: 27\nLength: 119\nDirector: Guillermo del Toro", m1.toString());
        assertEquals("Title: Child's Play\nAwards Won: 1\nLength: 87\nDirector: Tom Holland", m2.toString());
    }*/
}