#include <stdio.h>

int main() {
    int n1, n2, a, b, temp, gcd;

    
    printf("Enter two integers: ");
    scanf("%d %d", &n1, &n2);
    a = n1;
    b = n2;

    
    while (b != 0) {
        temp = b;
        b = a % b;
        a = temp;
    }

    gcd = a;

    printf("The GCD of %d and %d is: %d\n", n1, n2, gcd);

    return 0;
}