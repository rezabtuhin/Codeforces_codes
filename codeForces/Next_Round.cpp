#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main(){
    int a[100];
    int count = 0;
    int x,y;
    cin>>x>>y;
    for(int i = 1;i<=x;i++){
        cin>>a[i];
    }
    for(int i = 1;i<=x;i++){
        if(a[i]>=a[y] && a[i]>0){
            count++;
        }
    }
    cout<<count;
}