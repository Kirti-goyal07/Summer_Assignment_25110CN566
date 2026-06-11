import java.util.*;
public class Q44{
    public static void factOfNumber(int n){
        int fact = 1;
        for(int i =n;i>=1;i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        factOfNumber(n);
        
    }
}
