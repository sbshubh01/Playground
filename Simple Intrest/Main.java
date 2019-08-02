#include<stdio.h>
int main()
{
  //your code here
  int no_years;
  float principle, rate, simple_interest;
  scanf("%f\n %d", &principle, &no_years);
  scanf("%f", &rate);
  simple_interest = (principle*no_years*rate) / 100;
  printf("%lf", simple_interest);
  return 0;
}