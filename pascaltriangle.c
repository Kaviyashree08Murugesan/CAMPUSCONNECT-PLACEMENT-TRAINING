#include <stdio.h>

int main()
{
    int rows = 5;
    int i, j;
    int coef;

    for(i = 0; i < rows; i++)
    {
        // Print spaces
        for(j = 0; j < rows - i - 1; j++)
        {
            printf("  ");
        }

        coef = 1;

        // Print numbers
        for(j = 0; j <= i; j++)
        {
            printf("%4d", coef);

            coef = coef * (i - j) / (j + 1);
        }

        printf("\n");
    }

    return 0;
}