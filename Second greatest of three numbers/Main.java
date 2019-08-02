#include<stdio.h>
int main()
{
  int a[10],t;
  for(int i=0;i<3;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<3;i++)
  {
    if(a[i]>a[i+1])
    {
      t=a[i];
      a[i]=a[i+1];
      a[i+1]=t;
    }
  }
  printf("%d",a[1]);
  // Type your code here
}