import java.util.*;
public class Q22{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,r,c=0;
        double sum =0.0;
        System.out.println("Enter number in binary form:");
        n = sc.nextInt();
        while (n!=0){
            r=n%10;
            sum = sum + r*(Math.pow(2,c));
            n=n/10;
            c++;
        }
        System.out.println("The decimal of the binary is" + (int)sum);
    }
}







