#include<stdio.h>
int main()
{
  int a,b[100],c,d,p,q,x=0,y=0;
  scanf("%d",&a);
  for(int i=0;i<a;i++)
  {
    scanf("%d",&b[i]);
  }
  scanf("%d",&c);
  scanf("%d",&d);
  for(int i=0;i<a;i++)
  {
    if(b[i]==c)
    {
      x++;
      p=i;
    }
    if(b[i]==d)
    {
      y++;
      q=i;
    }
  }
  if(x==1)
  {
  printf("Element 1 index = %d\n",p);
  }
  else
  {
    printf("Element 1 index = -1\n");
  }
  if(y==1)
  {
  printf("Element 2 index = %d\n",q);
  }
  else
  {
    printf("Element 2 index = -1\n");
  }
  
}