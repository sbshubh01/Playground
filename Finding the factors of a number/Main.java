#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d", &n);
  int factors;
   for(factors = 1; factors <= n; factors++)
    {
       if(n % factors == 0)
       {
         printf("%d \n", factors);
       }
   }

	return 0;
}