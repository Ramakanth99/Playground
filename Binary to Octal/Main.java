#include<stdio.h>

int main()
{
  int a,m=1,p,t,k=0;
  scanf("%d",&a);
  while(a>0)
  {
    t=a%1000;
    int b=0,i=1;
    while(t>0)
    {
      p=t%10;
      if(p==1)
      {
      b=b+i;
        i=i*2;
      }
      else
      {
        i=i*2;
      }
      t=t/10;
    }
    k=k+b*m;
    m=m*10;
    a=a/1000;
  }
  printf("%d",k);
  //Type your code here
}