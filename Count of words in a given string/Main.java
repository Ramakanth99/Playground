#include<stdio.h>
#include<string.h>
int main()
{
  char c[100];
  int a=0;
  fgets(c,100,stdin);
  for(int i=0;c[i]!='\0';i++)
  {
    if(c[i]==' ')
    {
      a++;
    }
  }
  printf("%d",a+1);
  //Type your code here
  
}