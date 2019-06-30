#include<stdio.h>
int main()
{
  //Type your code here
  int n,i,n1=-1,n2=-1;
  scanf("%d",&n);
  int a[n],num1,num2;
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d %d",&num1,&num2);
  
  for(i=0;i<n;i++){
    if(a[i]==num1)
     n1=i;
    if(a[i]==num2)
      n2=i;
  }
  
  printf("%d\n%d",n1,n2);
  return 0;
}