import java.util.*;

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        double basic, hra, da, gross;

        System.out.print("Enter Employee ID: ");
        id = sc.nextInt();

        System.out.print("Enter Employee Name: ");
        name = sc.next();

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        hra = basic * 0.20;
        da = basic * 0.10;
        gross = basic + hra + da;

        System.out.println("\nSalary Slip");
        System.out.println("----------------------");
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basic);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("Gross Salary  : " + gross);

    }
}