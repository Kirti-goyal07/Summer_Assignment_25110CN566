import java.util.*;
public class Q64{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i = 0 ; i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                    
                }
            }
        }
        System.out.println("Array after removing duplicates:");
        for(int i = 0;i<n;i++){
            if(arr[i]!=-1){
                System.out.print(arr[i]+" ");
            }
        }
         
    }
}