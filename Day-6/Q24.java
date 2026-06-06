import java.util.*;
public class Q24{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,x,i,mul=1;
        System.out.println("Enter the number:");
        n= sc.nextInt();
        System.out.println("Enter the power to be raised:");
        x = sc.nextInt();
        for(i=1; i<=x;i++){
            mul = mul*n;
        }
         System.out.println("x^n would be equal to:" + mul);
        

    }
}