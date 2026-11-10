import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeManager manager = new GradeManager();

        int choice = 0;

        do {

            System.out.println("\n================================");
            System.out.println("       STUDENT GRADE TRACKER");
            System.out.println("================================");

            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Generate Grade Report");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");

            try {
                choice = Integer.parseInt(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Enter a number.");
                continue;
            }

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id;

                    try {
                        id = Integer.parseInt(sc.nextLine());

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Student ID!");
                        break;
                    }

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    if (name.trim().isEmpty()) {
                        System.out.println("Name cannot be empty.");
                        break;
                    }

                    int[] marks = new int[3];

                    String[] subjects = {
                        "Java", "DBMS", "Mathematics"
                    };

                    boolean valid = true;

                    for (int i = 0; i < 3; i++) {

                        System.out.print("Enter " + subjects[i] + " Marks: ");

                        try {
                            marks[i] = Integer.parseInt(sc.nextLine());

                            if (marks[i] < 0 || marks[i] > 100) {
                                System.out.println(
                                    "Marks must be between 0 and 100."
                                );
                                valid = false;
                                break;
                            }

                        } catch (NumberFormatException e) {
                            System.out.println("Invalid marks!");
                            valid = false;
                            break;
                        }
                    }

                    if (valid) {

                        Student student = new Student(id, name, marks);

                        manager.addStudent(student);
                    }

                    break;

                case 2:

                    manager.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter Student ID to search: ");

                    try {
                        int searchId = Integer.parseInt(sc.nextLine());

                        Student found = manager.searchStudent(searchId);

                        if (found != null) {

                            System.out.println("\nStudent Found!");
                            System.out.println("ID: " + found.getId());
                            System.out.println("Name: " + found.getName());

                            System.out.printf("Average: %.2f%n",
                                    found.calculateAverage());

                            System.out.println("Grade: " + found.getGrade());

                        } else {

                            System.out.println("Student not found!");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid ID!");
                    }

                    break;

                case 4:

                    manager.displayReport();

                    break;

                case 5:

                    System.out.println("Thank you for using Student Grade Tracker!");

                    break;

                default:

                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}