#include<stdio.h>
int sum(int num){
  return num*(num+1)/2;
}
int main() {
    // Type your code here
  int num;
  scanf("%d",&num);
  printf("%d",sum(num));  
  	return 0;
}