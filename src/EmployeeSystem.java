import java.util.TreeSet;
import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {

        TreeSet<Integer> employeeIds = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n------ Employee ID System ------");
            System.out.println("1. Add Employee ID");
            System.out.println("2. Update Employee ID");
            System.out.println("3. Remove Employee ID");
            System.out.println("4. Display Employee IDs");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Employee ID to add: ");
                int id = sc.nextInt();

                if (employeeIds.add(id)) {
                    System.out.println("Employee ID added successfully");
                } else {
                    System.out.println("Employee ID already exists");
                }

            } else if (choice == 2) {
                System.out.print("Enter old Employee ID: ");
                int oldId = sc.nextInt();

                if (employeeIds.contains(oldId)) {
                    System.out.print("Enter new Employee ID: ");
                    int newId = sc.nextInt();

                    employeeIds.remove(oldId);
                    employeeIds.add(newId);

                    System.out.println("Employee ID updated successfully");
                } else {
                    System.out.println("Employee ID not found");
                }

            } else if (choice == 3) {
                System.out.print("Enter Employee ID to remove: ");
                int id = sc.nextInt();

                if (employeeIds.remove(id)) {
                    System.out.println("Employee ID removed successfully");
                } else {
                    System.out.println("Employee ID not found");
                }

            } else if (choice == 4) {
                if (employeeIds.isEmpty()) {
                    System.out.println("No Employee IDs available");
                } else {
                    System.out.println("Employee IDs (sorted):");
                    for (Integer id : employeeIds) {
                        System.out.println(id);
                    }
                }

            } else if (choice == 5) {
                System.out.println("Exiting system...");
            } else {
                System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}