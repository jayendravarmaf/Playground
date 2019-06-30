#include <stdio.h>
int main()
{
    int num, num1, i = 0, j, sum = 0, fact, digit;
    scanf("%d", &num);
    num1 = num;
    while (num1)
    {
        digit = num1 % 10;
        j = 1;
        fact = 1;
        while (j <= digit)
        {
            fact = fact * j;
            j++;
        }
        sum = sum + fact;
        num1 /= 10;
    }
    if (sum==num) {
        printf("Yes\n");
    }
    else
    {
        printf("No\n");
    }
    
    
    return 0;
}