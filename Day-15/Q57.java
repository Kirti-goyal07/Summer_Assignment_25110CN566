import java.util.*;
public class Q57{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in an array:");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Array elements are:");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
            int start = 0;
            int end = n-1;
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end]=temp;
                start++;
                end--;
            }

        System.out.println("Reversed array:");
          for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
            }
        
    }
}