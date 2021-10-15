#include<stdio.h>
int main(){
    int test_case;
    scanf("%d",&test_case);
    for(int i = 0;i<test_case;i++){
        unsigned long long int x;
        scanf("%llu",&x);
        int movex = 0;
        while(x>1){
            if(x%2==0){
                x = x/2;

            }
            else if(x%3 == 0){
                x = (2*x)/3;

            }
            else if(x%5 == 0){
                x = (4*x)/5;

            }
            else{
                movex = -1;
                break;
            }
            movex++;
        }
        printf("%d\n",movex);
    }
}
