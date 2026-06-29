import java.util.Scanner;

public class Q116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String itemName = "";
        int quantity = 0;
        double price = 0;

        int choice;

        do {

            System.out.println("\n===== INVENTORY MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. View Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Total Value");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter Item Name: ");
                    itemName = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    price = sc.nextDouble();

                    System.out.println("Item Added Successfully.");
                    break;

                case 2:
                    System.out.println("Item Name : " + itemName);
                    System.out.println("Quantity  : " + quantity);
                    System.out.println("Price     : " + price);
                    break;

                case 3:
                    System.out.print("Enter New Quantity: ");
                    quantity = sc.nextInt();
                    System.out.println("Quantity Updated.");
                    break;

                case 4:
                    System.out.println("Total Inventory Value = " + (quantity * price));
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);
    }
}