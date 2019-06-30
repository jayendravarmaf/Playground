#include<stdio.h>
int main(int argc, char const *argv[])
{
    int n,i;
    scanf("%d",&n);
    int a[n],p=0;
    
    for(i = 0;i < n;i++)
    {
        scanf("%d",&a[i]);
        if(a[i]>a[p])
            p=i;
    }

    printf("%d",p);

    return 0;
}
