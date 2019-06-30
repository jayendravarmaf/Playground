#include<stdio.h>
#include<math.h>
int prime(int num){
	int l=sqrt(num),i;
  for(i=2;i<=l;i++){
  	if(num%i == 0)
      return 0;
  }
  return 1;
}
int main(){
    // Type your code here
  int max,i;
  scanf("%d",&max);
  for(i=2;i<=max;i++)
    if(prime(i)) printf("%d \n",i);
  
    return 0;
}