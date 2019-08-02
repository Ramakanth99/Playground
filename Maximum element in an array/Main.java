#include<stdio.h>
int main()
{
  int a,b[100];
  scanf("%d",&a);
  for(int i=0;i<a;i++)
  {
    scanf("%d",&b[i]);
  }
  int max=b[0];
  for(int i=0;i<a;i++)
  {
    if(max<b[i])
    {
      max=b[i];
    }
  }
  printf("%d",max);
  	//type your code here
}