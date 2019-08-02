#include <stdio.h>
int main() {
  int a,b,c=1,d=0,i;
  scanf("%d",&a);
  int k=a;
  while(a>0)
  {
    b=a%10;
    for(i=1;i<=b;i++)
    {
      c=c*i;
    }
    d=d+c;
    a=a/10;
    c=1;
  }
  if(d==k)
  {
  printf("Yes");
  }
    else
    {
      printf("No");
    }
	//Type your code
	return 0;
}