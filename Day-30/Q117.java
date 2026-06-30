import java.util.Scanner;

public class Q117 {

    public static void addStudent(String[] names, int[] marks, int index, Scanner sc) {
        System.out.print("Enter Student Name: ");
        names[index] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[index] = sc.nextInt();
        sc.nextLine();
    }

    public static void displayStudents(String[] names, int[] marks, int count) {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\nStudent Records");
        System.out.println("---------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println("Roll No: " + (i + 1));
            System.out.println("Name: " + names[i]);
            System.out.println("Marks: " + marks[i]);
            System.out.println("---------------------------");
        }
    }

    public static void searchStudent(String[] names, int[] marks, int count, Scanner sc) {
        System.out.print("Enter Student Name to Search: ");
        String search = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(search)) {
                System.out.println("Student Found");
                System.out.println("Name: " + names[i]);
                System.out.println("Marks: " + marks[i]);
                found = true;
            }
        }

        if (!found)
            System.out.println("Student Not Found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[50];
        int[] marks = new int[50];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent(names, marks, count, sc);
                    count++;
                    break;

                case 2:
                    displayStudents(names, marks, count);
                    break;

                case 3:
                    searchStudent(names, marks, count, sc);
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

    }
}