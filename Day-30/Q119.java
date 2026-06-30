import java.util.Scanner;

public class Q119 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] name = new String[50];
        double[] salary = new double[50];

        int count = 0;
        int choice;

        do {

            System.out.println("\n===== Employee Management =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;

                    break;

                case 2:

                    for (int i = 0; i < count; i++) {

                        System.out.println("\nEmployee " + (i + 1));
                        System.out.println("Name : " + name[i]);
                        System.out.println("Salary : " + salary[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (name[i].equalsIgnoreCase(search)) {

                            System.out.println("Employee Found");
                            System.out.println("Name : " + name[i]);
                            System.out.println("Salary : " + salary[i]);

                            found = true;
                        }
                    }

                    if (!found)
                        System.out.println("Employee Not Found.");

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