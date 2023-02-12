package problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacultyTest {

    @Test
    void shouldTestToString() {
        Faculty faculty = new Faculty("Richard Feynman");
        String result = "Richard Feynman";
        assertEquals(result, faculty.toString());
    }

}