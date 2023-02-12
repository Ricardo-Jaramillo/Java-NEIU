package problem3;

public class CourseDemo {

    public static void main(String[] args) {
        Course course = new Course(7394, "Programming II");
        Faculty f = new Faculty("Dr. Dean Harding");
        course.setInstructor(f);
        Student s1 = new Student("Francis James");
        Student s2 = new Student("Jenna Williams");
        Student s3 = new Student("Carole King");
        course.addStudent(s1);
        course.displayCourseInfo();
        course.addStudent(s2);
        course.addStudent(s3);
        course.displayCourseInfo();
    }
}
