#include <stdio.h>

int main() {
   int n,i,dig, prod =1 ;
   printf("Enter a number:");
   scanf("%d", &n);
   i=n;
   while (i>0){
       dig=i%10;
       prod = prod* dig;
       i=i/10;
   }
   printf("The product of digits is %d", prod);
    return 0;
}