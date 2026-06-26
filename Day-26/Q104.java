import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;
        int ans;

        System.out.println("Simple Quiz");

        // Question 1
        System.out.println("\n1. Where is film city located?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.print("Enter answer: ");
        ans = sc.nextInt();

        if (ans == 1)
            score++;

        // Question 2
        System.out.println("\n2. Java is a?");
        System.out.println("1. Programming Language");
        System.out.println("2. Operating System");
        System.out.println("3. Browser");
        System.out.print("Enter answer: ");
        ans = sc.nextInt();

        if (ans == 1)
            score++;

        // Question 3
        System.out.println("\n3. 5 + 1 = ?");
        System.out.println("1. 4");
        System.out.println("2. 51");
        System.out.println("3. 6");
        System.out.print("Enter answer: ");
        ans = sc.nextInt();

        if (ans == 3)
            score++;

        System.out.println("\nYour Score = " + score + "/3");

        if (score == 3)
            System.out.println("Excellent");
        else if (score == 2)
            System.out.println("Good");
        else
            System.out.println("Keep Practicing");
    }
}