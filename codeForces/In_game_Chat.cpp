/**
 *
 * @author tuhin
 */
 
 
 
#include<bits/stdc++.h>
using namespace std;
int main(){
	int t;
	cin>>t;
	for(int i = 0;i<t;i++){
		int len,cnt = 0;
		string s;
		cin>>len;
		cin>>s;
		for(int i = len-1;i>=0;i--){
			if(s[i] == ')'){
				cnt++;
			}
			else
				break;
		}
		if(cnt*2>len){
			cout<<"Yes"<<endl;
		}
		else
			cout<<"No"<<endl;
	}
}