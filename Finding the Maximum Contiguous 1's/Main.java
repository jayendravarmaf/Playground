#include<stdio.h>

int main() {
    int arr_size;

    int max = 0;
    int continious = 0;

    scanf("%d", & arr_size);

    int arr[arr_size];
    for (int index = 0; index < arr_size; index++) {
        scanf("%d", & arr[index]);

        if (arr[index] == 1) continious++;
        else {
            if (continious > max) max = continious;
            continious = 0;
        }

    }

    printf("%d", max);
    return 0;
}