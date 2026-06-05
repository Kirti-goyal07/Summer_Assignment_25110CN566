#include<stdio.h>
int main(){
    int n,i,j, prime;
    printf("Enter the number:");
    scanf("%d", &n);
    for(i=n;i>=2;i--){
        if(n%i==0){
        prime = 1;

            for(j=2;j<i;j++){
                if(i%j==0){
                      
                      prime=0;
                      break;
                
                }
            }
                if(prime==1){
                    printf("%d",i);
                    break;

                
            }
            
          
        }

    }

    return 0;
}