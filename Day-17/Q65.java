import java.util.*;
public class Q65{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements for first array:");
        int n_first = sc.nextInt();
        int arr1[] = new int[n_first];
        System.out.println("Elements:");
        for(int i =0;i<n_first;i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the no of elements for second array:");
        int n_second = sc.nextInt();
        int arr2[] = new int[n_second];
        System.out.println("Elements:");
        for(int i =0;i<n_second;i++){
            arr2[i] = sc.nextInt();
        }
        int merge[] = new int[n_first +n_second];
        for(int i = 0;i<n_first;i++){
            merge[i]=arr1[i];
        }
        for(int i =0;i<n_second;i++){
            merge[n_first + i]= arr2[i];
        }
        System.out.println("Merged Array:");
        for(int i = 0;i<merge.length;i++){
            System.out.print(merge[i]+" ");
        }
    }
}