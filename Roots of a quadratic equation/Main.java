#include<stdio.h>
int main()
{
  //Type your code here
  float a, b, c, det, root1, root2, real, img;
  scanf("%f%f%f", &a, &b, &c);
  det=(b*b)-(4*a*c);
  if(det>0)
  {
     root1=(-b+(sqrt(det)))/(2*a);
     root2=(-b-(sqrt(det)))/(2*a);
     printf("root1 = %0.2f  root2 = %0.2f", root1, root2);
  }
  else if(det==0)
  {
    root1=root2=(-b/(2*a));
    printf("root1 = %0.2f  root2 = %0.2f", root1, root2);
  }
  else
  {
    real=(-b/(2*a));
    img=(sqrt(-det))/(2*a);
    printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi", real, img, real, img);
  }

}