#include <stdio.h>

int main()
{
	int n,a=0,i,j;
    scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i%2)
		{
			++a;
			for(j=1;j<n;j++)
				printf("%d",a);
			printf("%d",++a);
		}
		else{
				printf("%d",++a);
			--a;
			for(j=1;j<n;j++)
				printf("%d",a);
		}
		printf("\n");
	}
	return 0;
}