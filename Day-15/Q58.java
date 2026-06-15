import java.util.*;
public class Q58{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the no. of elements:");
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first = arr[0];
        for(int i = 0;i<n-1;i++){
            arr[i]=arr[i+1];

        }
        arr[n-1]=first;
        System.out.println("Array after left rotation:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}