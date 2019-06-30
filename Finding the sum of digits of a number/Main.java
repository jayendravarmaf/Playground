#include <stdio.h>
int main() {
	//Type your code
  int num,sum=0;
  scanf("%d",&num);
  while(num){
    sum=sum+(num%10);
    num/=10;
  }
  printf("%d",sum);
	return 0;
}