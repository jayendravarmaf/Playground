#include<stdio.h>
int gcd(int , int , int);
int main()
{
int i , j , k , g;
scanf("%d %d %d", &i , &j , &k);

g = gcd(i , j , k);
printf("%d",g);

return 0;
}

int gcd(int i , int j , int k)
{
int least;
least = i;
while(!( (i == j) && (j == k) ) )
{
i = (i == 0 ? least : i);
j = (j == 0 ? least : j);
k = (k == 0 ? least : k);
if(i <= j)
{
if(i <= k)
least = i;
else
least = k;
}
else
{
if(j <= k)
least = j;
else
least = k;
}
i = i % least;
j = j % least;
k = k % least;
}
return least;

}