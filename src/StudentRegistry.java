import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRegistry {

    private Map<Integer, String> students;

    public StudentRegistry() {
        students = new HashMap<>();
    }

    public void addStudent(int roll, String name) {
        if (students.put(roll, name) == null) {
            System.out.println("Student added successfully");
        } else {
            System.out.println("Roll number already existed, name updated");
        }
    }

    public void updateStudent(int roll, String name) {
        if (students.containsKey(roll)) {
            students.put(roll, name);
            System.out.println("Student name updated successfully");
        } else {
            System.out.println("Roll number not found");
        }
    }

    public void removeStudent(int roll) {
        if (students.remove(roll) != null) {
            System.out.println("Student removed successfully");
        } else {
            System.out.println("Roll number not found");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available");
        } else {
            System.out.println("Roll No   Student Name");
            for (Map.Entry<Integer, String> entry : students.entrySet()) {
                System.out.println(entry.getKey() + "      " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {

        StudentRegistry registry = new StudentRegistry();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Registry System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                registry.addStudent(roll, name);

            } else if (choice == 2) {
                System.out.print("Enter Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter New Name: ");
                String name = sc.nextLine();
                registry.updateStudent(roll, name);

            } else if (choice == 3) {
                System.out.print("Enter Roll Number to Remove: ");
                int roll = sc.nextInt();
                registry.removeStudent(roll);

            } else if (choice == 4) {
                registry.displayStudents();

            } else if (choice == 5) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}