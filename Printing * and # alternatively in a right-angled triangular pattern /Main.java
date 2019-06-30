#include <stdio.h>
int main(){
	// Type your code here
  int i,j,num,p=1;
  char a[]={'*','#'};
  scanf("%d",&num);
  for(i=1;i<=num;i++,printf("\n")){
    for(j=1;j<=i;j++){
      p=!p;
      printf("%c",a[p]);
    }
  }
  	return 0;
}