#include <stdio.h>
int main() {
	//Type your code
  int n,i,c=0;
  scanf("%d",&n);
  for(i=1;c<n;i++){
    if(i%2==1){
    printf("%d \n",i);
      c++;
    }
  }
	return 0;
}