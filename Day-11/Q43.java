import java.util.*;
public class Q43{
    public static void isPrime(int n){
    int prime =0;   
    for(int i = 2;i<n;i++){
        if(n%i==0)
        prime=1;
    }
    if(prime==0){
        System.out.println("prime number");
    }
    else{
        System.out.println(" not a prime number");
        
    }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        
        isPrime(n);
    }
}
