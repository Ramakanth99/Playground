#include<stdio.h>
#include<math.h>
int main()
{
  int a,b=0,c=0,p,q;
  scanf("%d",&a);
  for(int i=1;i<=a;i++)
  {
    if(i%2!=0)
    {
      p=pow(2,b);
      b++;
    }
    else
    {
      q=pow(3,c);
      c++;
    }
  }
  if(a%2==0)
  {
    printf("%d",q);
  }
  else
  {
    printf("%d",p);
  }
  //type your code here
  return 0;
}