#include<stdio.h>
int main()
{
	//type your code here
  char str[100];
  scanf("%s", str);
  int i, count=1, length; 
  for(length=0; str[length]!='\0'; length++);
  if(length>20)
  {
    printf("Invalid Input");
  }
  else
  {
    for(i=0; i<length; i++)
     {
        if(str[i] == str[i+1])
        {
          count++;
        }
      else
      {
         printf("%c%d", str[i], count); 
         count = 1;
      }
    }
  }
  return 0;
}