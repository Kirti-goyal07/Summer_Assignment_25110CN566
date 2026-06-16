import java.util.*;
public class Q63{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum:");
        int Sum = sc.nextInt();
        for(int i =0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(Sum==arr[i]+arr[j]){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }

            }
        }
    }
}