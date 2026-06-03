#include <stdio.h>

int main() {
   int n,i,dig, rev=0 ;
   printf("Enter a number:");
   scanf("%d", &n);
   i=n;
   while (i>0){
       dig=i%10;
       rev = (rev*10) + dig;
       i=i/10;
   }
   printf("The reverse of digits is %d", rev);
    return 0;
}