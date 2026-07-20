#include<stdio.h>
#include<string.h>
int add(int a,int b)
{
    printf("%d",a+b);
    return a+b;
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    int c=add(a,b);
}