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

        student.displayStudent();

        System.out.println();

        course.displayCourse();
    }
}