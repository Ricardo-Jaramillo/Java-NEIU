package problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void shouldTestToString() {
        Course course = new Course(3923, "Data Structures");
        String result = "3923 Data Structures";
        assertEquals(result, course.toString());
    }

    @Test
    void shouldTestGetSetInstructor() {
        Course course = new Course(111, "Media in the World");
        Faculty f = new Faculty("Henry Martin");
        course.setInstructor(f);
        assertEquals(f, course.getInstructor());
    }
}