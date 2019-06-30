#include <stdio.h>
int main() {
	//Type your code
  int num,i,fact=1;
  scanf("%d",&num);
  for(i=2;i<=num;i++)
    fact=fact*i;
  printf("%d",fact);
	return 0;
}