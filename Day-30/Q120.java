import java.util.Scanner;

public class Q120{

    static String[] name = new String[100];
    static int[] marks = new int[100];
    static int count = 0;

    static void addStudent(Scanner sc) {

        System.out.print("Enter Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();
        sc.nextLine();

        count++;

        System.out.println("Student Added Successfully.");
    }

    static void display() {

        if (count == 0) {
            System.out.println("No Records.");
            return;
        }

        System.out.println("\nStudent List");

        for (int i = 0; i < count; i++) {

            System.out.println((i + 1) + ". " + name[i] + " - " + marks[i]);
        }
    }

    static void search(Scanner sc) {

        System.out.print("Enter Name: ");
        String s = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (name[i].equalsIgnoreCase(s)) {

                System.out.println("Student Found");
                System.out.println(name[i] + " - " + marks[i]);

                found = true;
            }
        }

        if (!found)
            System.out.println("Student Not Found");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Student Management Project =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    display();
                    break;

                case 3:
                    search(sc);
                    break;

                case 4:
                    System.out.println("Project Closed");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}