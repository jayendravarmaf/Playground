#include <stdio.h>
int main(){
	// Type your code here
  int num,i,j;
  scanf("%d",&num);
  for(i=1;i<=num;i++,printf("\n"))
    for(j=1;j<=num;j++,printf("%d",i));
  	return 0;
}