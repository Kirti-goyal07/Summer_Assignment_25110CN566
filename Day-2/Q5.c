#include <stdio.h>

int main() {
   int n,i, dig , sum = 0;
   printf("Enter a number:");
   scanf("%d", &n);
   i=n;
   while (i>0){
       dig=i%10;
       sum = sum + dig;
       i=i/10;
   }
   printf("The sum of digits is %d", sum);
    return 0;
}