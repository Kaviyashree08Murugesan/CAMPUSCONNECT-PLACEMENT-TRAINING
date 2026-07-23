#include<stdio.h>
#include<stdlib.h>
int main()
{
    int i,n;
    scanf("%d",&n);
    int arr[n],*a;
    for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
    a=&arr[0];
    for(i=0;i<n;i++)
    printf("%d\t",*(a+i));
}