import java.util.*;
public class Q42{
    public static int MaxOfNumbers(int a,int b){
    if(a>b){
        return a;

    }
    else if(b>a){
        return b;
    }
    else{
        System.out.println("Both are Equal");
        return a;
    }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(MaxOfNumbers(a,b));
    }
}
