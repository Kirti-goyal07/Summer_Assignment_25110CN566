import java.util.*;
public class Q27{
    static int sum(int n){
        if(n==0){
            return 0;
        }
        
        return n%10 +sum(n/10);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.print("sum =" + sum(n));
        sc.close();
    }
}