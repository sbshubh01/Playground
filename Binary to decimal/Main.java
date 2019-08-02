#include<stdio.h>
int main()
{
  //Type your code here
  int n, i=0, sum, digit;
  scanf("%d",&n);
  while(n != 0)
  {
     digit = n % 10;
     sum = sum + digit * pow(2,i);
     n = n / 10;
     i++;
  }
  printf("%d", sum);
  return 0;
}