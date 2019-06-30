#include <stdio.h>
int g(int a, int b){
  return  (((a)>(b))?(a):(b));
}
int main(){
	// Type your code here
  int a, b, c,t;
  scanf("%d %d %d", &a, &b, &c);
  t = g(a,b);
  printf("%d",g(t,c));
  
  	return 0;
}