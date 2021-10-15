#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
    int numbers[6];
    int a,b,c;
    cin>>a>>b>>c;
    numbers[0] = a+b+c;
    numbers[1] = a+b*c;
    numbers[2] = a*b+c;
    numbers[3] = a*(b+c);
    numbers[4] = (a+b)*c;
    numbers[5] = a*b*c;
    int sum = 0;
    for(int i = 0;i<6;i++){
        if(sum < numbers[i]){
            sum = numbers[i];
        }
    }
    cout<<sum;
}
