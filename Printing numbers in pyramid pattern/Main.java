#include <stdio.h>
int main()
{
    int i,j,k,num,p=0;
    scanf("%d",&num);
    for( i = 1; i <= num; i++)
    {
        for( j = 0; j < num-i; j++)
        {
            printf(" ");
        }
        for( j = 1; j <= i; j++)
        {
            p++;
            printf("%d ",p);
        }
       printf("\n");
        
    }
    
    return 0;
}
