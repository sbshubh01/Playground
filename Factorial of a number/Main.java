#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d", &n);
  int P = 1;
     for(int i = 1; i <= n; i ++)
     {
        P = P * i;
     }
  printf("%d", P);
  return 0;
}