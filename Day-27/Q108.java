import java.util.*;

public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int roll;
        String name;
        double m1, m2, m3, total, percentage;

        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Marks of Subject 1: ");
        m1 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 2: ");
        m2 = sc.nextDouble();

        System.out.print("Enter Marks of Subject 3: ");
        m3 = sc.nextDouble();

        total = m1 + m2 + m3;
        percentage = total / 3;

        System.out.println("\nMarksheet");
        System.out.println("-------------------------");
        System.out.println("Roll No    : " + roll);
        System.out.println("Name       : " + name);
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage + "%");

        if (percentage >= 90)
            System.out.println("Grade : A+");
        else if (percentage >= 75)
            System.out.println("Grade : A");
        else if (percentage >= 60)
            System.out.println("Grade : B");
        else if (percentage >= 40)
            System.out.println("Grade : C");
        else
            System.out.println("Grade : Fail");
    }
}