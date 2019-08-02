#include<stdio.h>
int main()
{
 long int a,t,i=1,b=0;
  scanf("%ld",&a);
   while(a>0)
        {
          t=a%10;
          if(t==1)
          {
            b=b+i;
            i=i*2;
          }
          else
          {
            i=i*2;
          }
          a=a/10;
        }
        printf("%d",b);
  //Type your code here
  return 0;
}