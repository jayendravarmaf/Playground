#include<stdio.h>

int square(int num){  
  return num*num;
}
int main() {
   // Type your code here
  int num;
  scanf("%d",&num);
  printf("%d",square(num));
   return 0;
}

