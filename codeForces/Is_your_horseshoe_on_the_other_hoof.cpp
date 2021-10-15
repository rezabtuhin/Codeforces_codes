#include <iostream>
#include <bits/stdc++.h>
using namespace std;
int main(){
    int count = 0;
    string s[5];
    for(int i = 0;i<4;i++){
        cin>>s[i];
    }
    sort(s,s+4);
    for(int i = 0;i<3;i++){
        if(s[i] == s[i+1]){
            count++;
        }
    }
    cout<<count;
}

