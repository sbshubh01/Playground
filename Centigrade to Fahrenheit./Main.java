#include<stdio.h>
int main()
{
  	//type your code here
  int temp_c;
  scanf("%d", &temp_c);
  float temp_f = temp_c*1.8 + 32;
  printf("%0.2f", temp_f);
}