import java.util.*;
public class Q59{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the no. of elements:");
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i = 0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int end = arr[n-1];
        for(int i = n-1;i>0;i--){
            arr[i]=arr[i-1];

        }
        arr[0]=end;
        System.out.println("Array after right rotation:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}