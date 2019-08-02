#include <stdio.h>
int main() {
  int a,b,c;
  scanf("%d",&a);
  b=a%10;
  while(a>=10)
  {
    a=a/10;
  }
  c=a+b;
  printf("%d",c);
  
	//Type your code
	return 0;
}