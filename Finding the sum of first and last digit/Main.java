#include <stdio.h>
int main() {
	//Type your code
  int num,sum;
  scanf("%d",&num);
  sum=num%10;
  while(num>10){
    num=num/10;
  }
  printf("%d",sum+num);
  
	return 0;
}