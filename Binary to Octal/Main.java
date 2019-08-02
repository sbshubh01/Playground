#include<stdio.h>
int power_fun(int base, int exp)
{
    int i, sum=1;
    for(i=0; i<exp; i++)
    {
      sum = sum*base;
    }
     return sum;
}
int main()
{
  //Type your code here
  int binary;
  scanf("%d", &binary);
  int rem, sum=0, exp=0;
   while(binary!=0)
    { 
       rem=binary%10;
       sum=sum+ rem*power_fun(2, exp);
         exp=exp+1;
        binary=binary/10;
    }
    int arr[100], i=0, j;
    while(sum != 0)
    {
      arr[i++]=sum%8;
      sum=sum/8;
    }
      for(j=i-1; j>=0; j--)
      printf("%d", arr[j]);
  return 0;
}