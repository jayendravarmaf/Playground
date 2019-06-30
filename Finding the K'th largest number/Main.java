#include <stdio.h>
main()
{

    int number[30];

    int i, j, a, n, k;
    scanf("%d", &n);

    for (i = 0; i < n; ++i)
        scanf("%d", &number[i]);

    scanf("%d", &k);

    for (i = 0; i < n; ++i)
    {
        for (j = i + 1; j < n; ++j)
        {
            if (number[i] < number[j])
            {
                a = number[i];
                number[i] = number[j];
                number[j] = a;
            }
        }
    }

    printf("%d\n", number[k-1]);
}