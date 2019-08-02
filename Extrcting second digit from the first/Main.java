#include <stdio.h>
int main() {
  int a;
  scanf("%d",&a);
  while(a>=100)
  {
    a=a/10;
  }
  printf("%d",a%10);
	//Type your code
	return 0;
}