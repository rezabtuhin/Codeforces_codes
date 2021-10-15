#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int arr[n];
    int count = 0;
    for(int i=0; i<n; i++){
        cin>>arr[i];
    }
    int max = arr[0], min = arr[0];
    for(int j=0; j<n; j++){
        if(arr[j]<min){
            min = arr[j];
            count++;
        }
        if(arr[j]>max){
            max = arr[j];
            count++;
        }
    }
    cout<<count<<endl;

}