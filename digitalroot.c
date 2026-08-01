# include<stdio.h>

int main()
{
    int num;
    scanf("%d",&num);

    if(num==0)
        printf("0");
    else if(num%9==0)
        printf("9");
    else
        printf("%d",num%9);

    return 0;
}