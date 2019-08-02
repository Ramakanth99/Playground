#include<stdio.h>
#include<math.h>
int main()
{
  double a,b,c;
  double r1,r2;
  scanf("%lf%lf%lf",&a,&b,&c);
  double d=b*b-4*a*c;
  if(d>0)
  {
    r1=(-b+sqrt(d))/(2*a);
    r2=(-b-sqrt(d))/(2*a);
    printf("root1 = %.2lf  root2 = %.2lf",r1,r2);
  }
  else if(d==0)
  {
    r1=r2=-b/(2*a);
    printf("root1 = %.2lf  root2 = %.2lf",r1,r2);
  }
  else
  {
    double r=-b/(2*a);
    double i=sqrt(-d)/(2*a);
    printf("root1 = %.2lf + %.2lfi  root2 = %.2lf - %.2lfi",r,i,r,i);
  }
  return 0;
  //Type your code here
  
}