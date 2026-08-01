#include<stdio.h>

int main(){
    int n,i,j;
    printf("Enter the size of the 2D array : ");
    scanf("%d",&n);
    int arr[n][n],*a;
    printf("Enter the elements of the 2D array : ");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    a = &arr[0][0];
    printf("\nThe 2D array is : \n");
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            printf("%d ",*(a+(i*n)+j));
        }
        printf("\n");
    }
}