#include<stdio.h>
#include<string.h>
int main()
{
  char str[100],c[100];
  int j,k=0,d=0,x;
  fgets(str,100,stdin);
  for(int i=0;str[i]!='\0';++i)
  {
    if(!(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o' || str[i]=='u' || str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U'))
    {
        c[d]=str[i];
        d++;
    }
  }
  c[d]='\0';
 printf("%s",c);
  
  return 0;
}