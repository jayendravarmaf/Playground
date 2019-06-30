#include <stdio.h>

int main() {
    int n, c, d, swap,a,i,j;


    scanf("%d", & n);

    int array[n];

    int l = n / 2;

    for (c = 0; c < n; c++)
        scanf("%d", & array[c]);



    for (c = 0; c < l - 1; c++) {
        for (d = 0; d < l - c - 1; d++) {
            if (array[d] > array[d + 1])  {
                swap = array[d];
                array[d] = array[d + 1];
                array[d + 1] = swap;
            }
        }
    }

    for (i = l; i < n; ++i) {
        for (j = i + 1; j < n; ++j) {
            if (array[i] < array[j]) {
                a = array[i];
                array[i] = array[j];
                array[j] = a;
            }
        }
    }

    for (c = 0; c < n; c++)
        printf("%d ", array[c]);

    return 0;
}