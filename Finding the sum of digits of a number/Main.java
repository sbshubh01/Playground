#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  int sum=0;
  int count=1;
  while(n>0)
  {
   count=n%10;
    sum=sum+count;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}