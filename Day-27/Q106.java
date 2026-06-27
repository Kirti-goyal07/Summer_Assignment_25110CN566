import java.util.*;

class Employee {
    int id;
    String name;
    double salary;
}

public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] e = new Employee[n];

        for (int i = 0; i < n; i++) {
            e[i] = new Employee();

            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter ID: ");
            e[i].id = sc.nextInt();

            System.out.print("Enter Name: ");
            e[i].name = sc.next();

            System.out.print("Enter Salary: ");
            e[i].salary = sc.nextDouble();
        }

        System.out.println("\nEmployee Details");
        System.out.println("--------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("ID     : " + e[i].id);
            System.out.println("Name   : " + e[i].name);
            System.out.println("Salary : " + e[i].salary);
            System.out.println();
        }
    }
}