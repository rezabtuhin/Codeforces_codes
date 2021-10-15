#include <iostream>
#include <bits/stdc++.h>
#include <map>
using namespace std;
int main(){
    int magnets;
    cin>>magnets;
    int counts = 1;
    int arr[magnets];
    for(int i = 0;i<magnets;i++){
        cin>>arr[i];
    }
    for(int i = 0;i<magnets-1;i++){
        if(arr[i]!=arr[i+1]){
            counts++;
        }
    }
    cout<<counts;
}

