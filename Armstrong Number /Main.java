#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int num,numcpy1,numcpy2,sum=0,power=0,d;
  scanf("%d",&num);
  numcpy2=numcpy1=num;
  while(numcpy1){
    numcpy1=numcpy1/10;
    power++;
  }
  while(numcpy2){
    d=numcpy2%10;
    d=pow(d,power);
    sum=sum+d;
    numcpy2=numcpy2/10;
  }
  
  if(sum==num) printf("Armstrong Number");
  else printf("Not an Armstrong Number");
  
	return 0;
}