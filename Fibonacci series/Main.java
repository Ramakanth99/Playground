#include<stdio.h>
int main()
{
  int a,b=0,c=1,d;
  scanf("%d",&a);
   printf("%d ",b);
   printf("%d ",c);
  for(int i=2;i<a;i++)
  {
    d=b+c;
    b=c;
    c=d;
    printf("%d ",d);
  }
  //Type your code here
  return 0;
}