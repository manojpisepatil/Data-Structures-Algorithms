#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n;
  cout<<"enter the count : ";
  cin>>n;

  int a[n]={ };

  for( int i=0; i<n; i++ ){
    cout<<"enter element : ";
    cin>>a[i];
  }
  
  cout<<" array : { ";
  
  for( int i=0; i<n; i++ ){
    cout<<\t<<a[i];
  }
  cout<<" }";

  return 0;
}
