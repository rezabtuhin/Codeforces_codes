#include<stdio.h>
int main(){
    long long n, k;
    scanf("%lld",&n);
    scanf("%lld",&k);
    if (k <= (n + 1) / 2)
    {
        long long xy = k*2-1;
        printf("%lld",xy);
 
    }
    else
    {
        long long xz = (k - (n + 1) / 2) * 2;
        printf("%lld",xz);
    }
    return 0;
}