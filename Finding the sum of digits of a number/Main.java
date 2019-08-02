#include <stdio.h>
int main() {
  int a,x=0,s;
  scanf("%d",&a);
  while(a>0)
  {
    s=a%10;
    x=x+s;
    a=a/10;
  }
  printf("%d",x);
	//Type your code
	return 0;
}