#include<stdio.h>
int main()
{
  int a,t,b=0,i=1;
  scanf("%d",&a);
  while(a>0)
  {
    t=a%2;
    b=b+t*i;
    i=i*10;
    a=a/2;
  }
  printf("%d",b);
  //Type your code here
  return 0;
}