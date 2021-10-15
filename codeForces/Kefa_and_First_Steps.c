#include<stdio.h>
int main()
{
    int n,i,maxx=0,cnt=1;
    scanf("%d",&n);
    int a[n];
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0; i<n-1; i++)
    {
        if(a[i]>a[i+1])
        {
            if(cnt>maxx){
                maxx=cnt;
            }
            cnt=1;
        }
        else
        cnt++;
    }
    if(cnt>maxx)
        maxx=cnt;
    printf("%d\n",maxx);
    return 0;
}