import java.util.Scanner;

public class Q46 {
    
    public static int isArmstrong(int num) {
        int original = num;
        int temp = num;
        int count = 0;

        while (temp > 0) {
            temp = temp/ 10;
            count++;
        }
        int sum = 0;
        while(original>0){
            int digit = original%10;
            sum = sum + (int)Math.pow(digit,count);
            original = original/10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int ans =isArmstrong(n);
        if (n==ans)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}