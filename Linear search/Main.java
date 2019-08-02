#include<stdio.h>
int main()
{
  int a,b[100],c,p=0,k;
  scanf("%d",&a);
  for(int i=0;i<a;i++)
  {
    scanf("%d",&b[i]);
  }
  scanf("%d",&c);
  for(int i=0;i<a;i++)
  {
    if(b[i]==c)
    {
      p++;
      k=i;
    }
  }
  if(p==1)
  {
  printf("%d",k+1);
  }
  else
  {
    printf("%d isn't present in the array.",c);
  }
  //Type your code here
  return 0;
}