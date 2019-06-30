#include<stdio.h>
int main()
{
  //Type your code here
  int num,first,last;
  scanf("%d",&num);
  first=num/100;
  last=num%10;
  printf("%d",first+last);
  return 0;
}