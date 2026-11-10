import java.util.ArrayList;

public class GradeManager {

    private ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    // Add student
    public void addStudent(Student student) {

        if (searchStudent(student.getId()) != null) {
            System.out.println("Student ID already exists!");
            return;
        }

        students.add(student);

        System.out.println("Student added successfully!");
    }

    // Display all students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n========== STUDENT LIST ==========");

        for (Student student : students) {

            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.printf("Average: %.2f%n",
                    student.calculateAverage());

            System.out.println("--------------------------------");
        }
    }

    // Search student
    public Student searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    // Display individual student report
    public void displayReport() {

        if (students.isEmpty()) {
            System.out.println("No records available.");
            return;
        }

        System.out.println("\n========== GRADE REPORT ==========");

        for (Student student : students) {

            System.out.println("\nStudent ID: " + student.getId());

            System.out.println("Name: " + student.getName());

            System.out.printf("Average Marks: %.2f%n",
                    student.calculateAverage());

            System.out.println("Highest Marks: "
                    + student.getHighestMark());

            System.out.println("Lowest Marks: "
                    + student.getLowestMark());

            System.out.println("Grade: " + student.getGrade());

            System.out.println("--------------------------------");
        }
    }

    // Display total student count
    public int getStudentCount() {
        return students.size();
    }
}