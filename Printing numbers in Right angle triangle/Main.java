#include <stdio.h>
int main(){
  	// Type your code here
  int i,j,num;
  scanf("%d",&num);
  for(i=1;i<=num;i++,printf("\n"))
    for(j=1;j<=i;j++,printf("%d",i));
	return 0;
}