#include<stdio.h>
int main()
{
  //Type your code here
  int n, i, rem_count, arr[100];
  scanf("%d",&n);
  while(n != 0)
  {
     arr[rem_count++] = n%2;
     n = n/2;
  }
  for(i=rem_count-1; i>=0; i--)
  {
     printf("%d", arr[i]);
  }
   
  return 0;
}