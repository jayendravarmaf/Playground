#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  while(num>100){
    num=num/10;
  }
  printf("%d",num%10);
	return 0;
}