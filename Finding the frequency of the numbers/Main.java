#include <stdio.h>

int main()
{
    int arr[100], freq[100];
    int size, i, j, count, k, num=1,flag=0;

    scanf("%d", &size);

    scanf("%d", &k);

    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);

        freq[i] = -1;
    }

    for (i = 0; i < size; i++)
    {
        count = 1;
        for (j = i + 1; j < size; j++)
        {
            if (arr[i] == arr[j])
            {
                count++;

                freq[j] = 0;
            }
        }

        if (freq[i] != 0)
        {
            freq[i] = count;
        }
    }


    while (num <= k)
    {
        for (i = 0; i < size; i++)
        {
            if (arr[i] == num)
            {
                printf("%d %d \n", arr[i], freq[i]);
                flag++;
                break;
            }
        }

        if(!flag)
            printf("%d 0\n",num);

        flag=0;
        num++;
    }

    return 0;
}