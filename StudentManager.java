import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter roll number: ");
            int rollNumber = sc.nextInt();

            System.out.print("Enter number of subjects: ");
            int n = sc.nextInt();
            int[] marks = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = sc.nextInt();
            }

            sc.nextLine(); // clear buffer

            students.add(new Student(name, rollNumber, marks));
            System.out.println("Student added successfully!\n");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers only!");
            sc.nextLine();
        }
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.\n");
            return;
        }

        System.out.println("----- Student Records -----");
        for (Student s : students) {
            s.display();
        }
    }

    public void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int roll = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getRollNumber() == roll) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("No student found with that roll number.\n");
    }
}
