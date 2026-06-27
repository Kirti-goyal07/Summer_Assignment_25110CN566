import java.util.*;

class Student {
    int roll;
    String name;
    double marks;
}

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Roll No: ");
            s[i].roll = sc.nextInt();

            System.out.print("Enter Name: ");
            s[i].name = sc.next();

            System.out.print("Enter Marks: ");
            s[i].marks = sc.nextDouble();
        }

        System.out.println("\nStudent Records");
        System.out.println("-------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("Roll No : " + s[i].roll);
            System.out.println("Name    : " + s[i].name);
            System.out.println("Marks   : " + s[i].marks);
            System.out.println();
        }
    }
}