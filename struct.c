//structure
#include<stdio.h>
typedef struct student
{
    int reg_no;//4 bytes
    char name[50];//10 bbytes
    float cgpa;//4bytes
}acer;//only allocated the bytes if not put the acer the bytes be 0 imp  mcqques
int main()
{
    acer a;
    scanf("%d%s%f",&a.reg_no,a.name,&a.cgpa);
    printf("%d%s%f",a.reg_no,a.name,a.cgpa);
}
