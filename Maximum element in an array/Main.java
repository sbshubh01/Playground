#include<stdio.h>
int main()
{
  	//type your code here
   int n, i, max_ele;
  scanf("%d", &n);
  int arr[n];
  for(i=0; i<n; i++)
  {
    scanf("%d", &arr[i]);
  }
  max_ele = arr[0];
     for(i=1; i<n; i++)
   {
      if(arr[i] > max_ele)
      {
           max_ele = arr[i];
      }
    }
  printf("%d", max_ele);
  return 0;
}