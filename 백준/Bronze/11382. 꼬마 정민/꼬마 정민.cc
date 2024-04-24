#include<stdio.h>

int main(){
    long int A,B,C; //범위가 10^12승까지이기때문
    
    scanf("%ld %ld %ld", &A, &B, &C);
    printf("%ld", A+B+C);
    
    return 0;
}