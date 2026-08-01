#include<stdio.h>
int main()
{
    int n,i,rot,temp;
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    scanf("%d",&rot);
    rot= rot%n;
    while(rot--)
    {
        temp arr[n-1];
        for(i=0;i>=0;i--)
        arr[i]=arr[i-1];
    }
        arr[n-1]=temp;
        printf("%d",arr[i]);
}
