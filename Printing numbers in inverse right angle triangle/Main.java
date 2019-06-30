#include <stdio.h>
int main() {
    // Type your code here
  int rows,i,j,k;
  scanf("%d",&rows);
  k=rows;
  for(i=1;i<=rows;i++,printf("\n"),k--)
    for(j=k;j>0;printf("%d",j),j--);
	return 0;
}