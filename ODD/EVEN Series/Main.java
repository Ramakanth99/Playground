#include<stdio.h>
int main()
{
  int a,b=0,c=0;
  scanf("%d",&a);
  for(int i=1;i<=a;i++)
  {
    if(i%2!=0)
    {
 
      b++;
      b++;
    }
    else
    {
 
      c++;
    }
  }
  if(a%2==0)
  {
    printf("%d",c-1);
  }
  else
  {
    printf("%d",b-2);
  }
    return 0;
    
	//type your code here
	
}