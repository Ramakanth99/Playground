#include <stdio.h>
int main() {
  char a;
  scanf("%c",&a);
    if(a>='a' && a<='z')
       {
         a=a-32;
         printf("%c",a);
       }
       else
       {
         a=a+32;
         printf("%c",a);
         
       }
	// Type your code here
	return 0;
}