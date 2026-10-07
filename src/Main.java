public class Main {
    public static void main(String[] args) {

        Student student = new Student(
                "SE-101",
                "Ali",
                "Software Engineering"
        );

        Course course = new Course(
                "SCD-301",
                "Software Construction and Development",
                3
        );

        Registration registration = new Registration(student, course);

        registration.displayRegistration();
    }
}