#include<stdio.h>
int main()
{
  //type your code here
  int n, i, t_s1, t_s2, nth_term, a, r;
  scanf("%d", &n);
    for(i=1; i<=n; i++)
    {
      if(n%2 == 1)
      {
        a=1, r=2;
        t_s1 = (n+1)/2;
        nth_term = a*pow(r, t_s1-1);
      }
      else
      {
        a=1, r=3;
        t_s2 = n/2;
        nth_term = a*pow(r, t_s2-1);
      }
    }
  printf("%d", nth_term);
  return 0;
}