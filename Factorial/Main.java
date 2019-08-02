#include<stdio.h>
int main()
{
	long int a,b=1;
  scanf("%d",&a);
  if(a==0)
  {
    printf("%d",a+1);
  }
  else
  {
  for(int i=1;i<=a;i++)
  {
    b=b*i;
  }
    printf("%ld",b);
  }
  return 0;
}