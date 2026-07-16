#include<stdio.h>
int main()
{
    int i,j,rows=5,num=1;
    for(i=0;i<=rows;i++){
        for(j=1;j<=i;j++){
            if(j<=i){
                printf("%3d",num);
                num++;
            }
        }
        printf("\n");
    }
    return 0;
}