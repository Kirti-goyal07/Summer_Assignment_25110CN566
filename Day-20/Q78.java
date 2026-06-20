import java.util.*;
public class Q78{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for square marix:");
        int n = sc.nextInt();
        int matrix[ ][ ]=new int[n][n];
        System.out.println("Enter matrix elements: ");
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        boolean isSym = true;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(matrix[i][j]!=matrix[j][i]){
                    isSym=false;
                    break;
                }
            }
        }
        if(isSym){
            System.out.println("Symmetric matrix");
        }
        else{
            System.out.println("Not a Symmetric matrix");
        }
    }
}