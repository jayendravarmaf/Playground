#include<stdio.h>
int power(int a, int b){
  int i,r=1;
  for (i=0;i<b;i++){
    r=r*a; 
  }     
  return r;
}
int main(){
    // Type your code here
  int a,b;
  scanf("%d %d",&a,&b);
  printf("%d",power(a,b)); 
  	return 0;
}