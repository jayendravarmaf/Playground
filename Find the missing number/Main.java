#include <stdio.h>
main()
{
    int arr[100], max, num = 1, i, n, flag = 0;

    scanf("%d", &n);
    scanf("%d", &arr[0]);
    max = arr[0];

    for (i = 1; i < n; i++)
    {
        scanf("%d", &arr[i]);

        if (arr[i] > max)
        {
            max = arr[i];
        }
    }

    while (num <= max)
    {
        for (i = 0; i < n; i++)
        {
            if (arr[i] == num)
            {
                flag++;
            }
        }

        if (flag == 0)
        {
            printf("%d\n", num);
        }

        flag = 0;
        num++;
    }
}
