#include <stdio.h>

int main() {
  int i , n ,count=0  ;
  printf("Enter the value of n:");
  scanf("%d", &n);
  i=n;
  while(i>0){
      i = i/10;
      count++;
  }
  printf("count is %d", count);
    return 0;
}