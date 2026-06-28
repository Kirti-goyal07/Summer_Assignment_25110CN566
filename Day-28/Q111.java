import java.util.Scanner;

public class Q111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean[] seats = new boolean[10];
        int choice;

        do {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. View Seats");
            System.out.println("2. Book Seat");
            System.out.println("3. Cancel Seat");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (int i = 0; i < seats.length; i++) {
                        if (seats[i])
                            System.out.println("Seat " + (i + 1) + " : Booked");
                        else
                            System.out.println("Seat " + (i + 1) + " : Available");
                    }
                    break;

                case 2:
                    System.out.print("Enter seat number: ");
                    int book = sc.nextInt();

                    if (!seats[book - 1]) {
                        seats[book - 1] = true;
                        System.out.println("Seat Booked.");
                    } else {
                        System.out.println("Seat Already Booked.");
                    }
                    break;

                case 3:
                    System.out.print("Enter seat number: ");
                    int cancel = sc.nextInt();

                    if (seats[cancel - 1]) {
                        seats[cancel - 1] = false;
                        System.out.println("Booking Cancelled.");
                    } else {
                        System.out.println("Seat was not booked.");
                    }
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