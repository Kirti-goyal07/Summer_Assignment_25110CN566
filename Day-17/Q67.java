import java.util.*;
public class Q67{
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
        int intersection[]=new int[Math.min(n_first,n_second)];
        int k = 0;
        for(int i =0;i<n_first;i++){
            for(int j=0;j<n_second;j++){

               if(arr1[i]==arr2[j]){
                intersection[k++]=arr1[i];
                break;
               } 
            }
        }
        System.out.print("Intersection:");
        for(int i=0;i<k;i++){
            System.out.print(intersection[i]+" ");
        }
    }
}