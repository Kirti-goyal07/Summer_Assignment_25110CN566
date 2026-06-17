import java.util.*;
public class Q66{
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
        int union[] = new int[n_first +n_second];
        int k = 0;
        for(int i = 0;i<n_first;i++){
            union[k++]=arr1[i];
        }
        for(int i= 0;i<n_second;i++){
            boolean found=false;
            for(int j =0 ; j<k;j++){
                if(arr2[i]==union[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                union[k++]=arr2[i];
            }
        }
        System.out.println("Union:");
        for(int i = 0;i<k;i++){
            System.out.print(union[i]+" ");
        }
    }
}