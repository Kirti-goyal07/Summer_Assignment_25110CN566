import java.util.*;
public class Q25{
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        System.out.print("Factorial =" + factorial(n));
        sc.close();
    }
}