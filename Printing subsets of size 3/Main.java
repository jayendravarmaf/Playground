#include <stdio.h>
int main()
{
    int size;
    scanf("%d", &size);
    int arr[50], i, j, k;
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    for (i = 0; i < size - 1; i++)
    {
        for (j = i + 1; j < size; j++)
        {
            for (k = j + 1; k < size; k++)
            {
                printf("(%d, %d, %d) ", arr[i], arr[j], arr[k]);
            }
        }
        printf("\n");
    }
    

    return 0;
}
