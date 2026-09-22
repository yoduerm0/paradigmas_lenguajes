#include <stdio.h>

int main() {
    int n = 5;
    long resultado = 1;

    for (int i = 1; i <= n; i++) {
        resultado = resultado + i;
    }

    printf("Factorial de %d = %ld\n", n, resultado);
    return 0;
}