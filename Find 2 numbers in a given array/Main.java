#include<stdio.h>
int main()
{
  	//type your code here
  int n, i;
  scanf("%d", &n);
  int arr[n];
    for(i=0; i<n; i++)
    {
      scanf("%d", &arr[i]);
    }
  int n1, n2, n1_index=-1, n2_index=-1;
  scanf("%d %d", &n1, &n2);
    for(i=0; i<n; i++)
    {
      if(n1==arr[i] && n1_index==-1)
      {
        n1_index = i;
      }
      if(n2==arr[i] && n2_index==-1)
      {
        n2_index = i;
      }
    }
  printf("Element 1 index = %d\nElement 2 index = %d", n1_index, n2_index);
 return 0;
}