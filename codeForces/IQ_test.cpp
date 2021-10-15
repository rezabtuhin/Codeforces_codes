
#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
    int x;
    cin>>x;
    int evencount = 0;
    int oddcount = 0;
    int a[x+1];
    for(int i = 1;i<=x;i++){
        cin>>a[i];
        if(a[i]%2==0){
            evencount++;
        }
        if(a[i]%2!=0){
            oddcount++;
        }
    }
    if(evencount>oddcount){
        for(int i = 1;i<=x;i++){
            if(a[i]%2!=0){
                cout<<i;
                return 0;
            }
        }
    }
    if(evencount<oddcount){
        for(int i = 1;i<=x;i++){
            if(a[i]%2==0){
                cout<<i;
                return 0;
            }
        }
    }
}

