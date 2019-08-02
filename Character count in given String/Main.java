#include<stdio.h>
#include<string.h>
int main()
{
  char a[50];
  scanf("%s",a);
  int p=strlen(a);
  int k=0;
  if(p<=20)
  {
  for(int i=0;i<p;i++)
  {
    if(a[i]==a[i+1])
       {
         k++;
       }
       else
       {
         printf("%c%d",a[i],k+1);
         k=0;
       }
  }
  }
  else
  {
    printf("Invalid Input");
  }
	//type your code here
}