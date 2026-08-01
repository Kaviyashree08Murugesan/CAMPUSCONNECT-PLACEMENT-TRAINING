#include<stdio.h>

void main(){
    int i,n,temp;
    printf("Enter a Number : ");
    scanf("%d",&n);
    int arr[n];
    for(i=0;i<n;i++){  
        printf("Enter Element %d : ",i+1);
        scanf("%d",&arr[i]);
    }
    int target;
    printf("Enter the number of positions to rotate: ");
    scanf("%d",&target);
    target = target % n; // To handle cases where target is greater than n
    while(target--){
        temp = arr[n-1];
        for(i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
    printf("Array after right rotation by 1 position:\n");
    for(i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}