#include<stdio.h>
int main()
{
	//type your code here
  int n, a, d, t_s1, t_s2, nth_term;
  scanf("%d",&n);
   if(n % 2 == 1)
   {
      a = 0, d = 2;
      t_s1 = (n + 1) / 2; 
      nth_term = a +(t_s1 - 1) * d;
      printf("%d", nth_term);
   }
    else
    {
       a = 0, d = 1;
       t_s2 = n / 2;
       nth_term = a + (t_s2 - 1) * d;
       printf("%d", nth_term);
     }
  return 0;
}