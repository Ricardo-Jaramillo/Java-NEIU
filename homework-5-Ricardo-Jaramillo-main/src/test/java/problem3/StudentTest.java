package problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void shouldTestToString() {
        Student student = new Student("Frederick Angola");
        String result = "Frederick Angola";
        assertEquals(result, student.toString());
    }

}