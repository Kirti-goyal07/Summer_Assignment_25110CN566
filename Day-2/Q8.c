#include <stdio.h>

int main() {
   int n,i,dig, rev = 0, remainder ;
   printf("Enter a number:");
   scanf("%d", &n);
   i=n;
   while(i>0){
       dig=i%10;
       rev = rev *10 + dig;
       i = i /10;
   }
   if ( n == rev){
       printf("The number is palindrome");
   }
       else{ 
           printf("The number is not palindrome");
   }
   return 0;
}
      