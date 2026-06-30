import java.util.Scanner;

public class Q118 {

    public static void displayBooks(String[] books, boolean[] issued) {

        System.out.println("\nLibrary Books");

        for (int i = 0; i < books.length; i++) {

            System.out.println((i + 1) + ". " + books[i] + " - " +
                    (issued[i] ? "Issued" : "Available"));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Java Programming",
                "Python Basics",
                "Data Structures",
                "Operating System",
                "DBMS"
        };

        boolean[] issued = new boolean[5];

        int choice;

        do {

            System.out.println("\n===== Mini Library =====");
            System.out.println("1. Display Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    displayBooks(books, issued);
                    break;

                case 2:

                    displayBooks(books, issued);

                    System.out.print("Enter Book Number: ");
                    int issue = sc.nextInt();

                    if (!issued[issue - 1]) {
                        issued[issue - 1] = true;
                        System.out.println("Book Issued Successfully.");
                    } else {
                        System.out.println("Already Issued.");
                    }

                    break;

                case 3:

                    displayBooks(books, issued);

                    System.out.print("Enter Book Number: ");
                    int ret = sc.nextInt();

                    if (issued[ret - 1]) {
                        issued[ret - 1] = false;
                        System.out.println("Book Returned.");
                    } else {
                        System.out.println("Book was not Issued.");
                    }

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