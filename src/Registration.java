public class Registration {
    Student student;
    Course course;

    Registration(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    void displayRegistration() {
        System.out.println("Registration Details");
        System.out.println("--------------------");

        student.displayStudent();

        System.out.println();

        course.displayCourse();
    }
}