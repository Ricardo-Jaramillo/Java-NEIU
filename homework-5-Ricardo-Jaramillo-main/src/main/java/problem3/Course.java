package problem3;

public class Course {

    private final long courseId;
    private final String name;
    private Faculty instructor;
    private Student[] students;

    public Course(long courseId, String name){
        this.courseId = courseId;
        this.name = name;
        students = new Student[30];
    }

    public Faculty getInstructor(){
        return this.instructor;
    }

    public void setInstructor(Faculty instructor){
        this.instructor = instructor;
    }

    @Override
    public String toString(){
        return this.courseId + " " + this.name;
    }

    public void addStudent(Student student){
        int counter = 0;
        boolean finish = false;

        while (!finish){
            if (this.students[counter] == null){
                this.students[counter] = student;
                finish = true;
            }
            counter++;
        }
    }

    public void displayCourseInfo(){
        System.out.println(this.courseId + " " + this.name);
        System.out.println("Instructor: " + this.getInstructor().getName());
        System.out.println("Students: ");

        int counter = 0;
        while (students[counter] != null){
            System.out.println(students[counter].getName());
            counter++;
        }
    }
}
