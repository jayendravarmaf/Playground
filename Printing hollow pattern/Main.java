#include <stdio.h>
int main() {
	// Type your code here
  int n,i,j;
  scanf("%d",&n);
  for(i=0;i<n;i++,printf("\n"))
  {
    for(j=0;j<n;j++) if(i==0||i==n-1||j==0||j==n-1) printf("*"); else printf(" ");
  }
	return 0;
}