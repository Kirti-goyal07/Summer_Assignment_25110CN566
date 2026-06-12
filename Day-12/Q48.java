import java.util.Scanner;

public class Q48 {

    public static int isPerfect(int num) {
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int ans = isPerfect(n);

        if (n == ans)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}