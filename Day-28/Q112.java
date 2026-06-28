import java.util.Scanner;

public class Q112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[10];
        String[] numbers = new String[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Contact Management System ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 10) {
                        System.out.print("Enter Name: ");
                        names[count] = sc.nextLine();

                        System.out.print("Enter Mobile Number: ");
                        numbers[count] = sc.nextLine();

                        count++;
                        System.out.println("Contact Added Successfully.");
                    } else {
                        System.out.println("Contact List Full.");
                    }
                    break;

                case 2:
                    System.out.println("\nContact List:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(names[i] + " - " + numbers[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (names[i].equalsIgnoreCase(search)) {
                            System.out.println("Name : " + names[i]);
                            System.out.println("Number : " + numbers[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Contact Not Found.");
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}