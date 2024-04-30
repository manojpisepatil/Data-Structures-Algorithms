#include<iostream>
#include <string>
#include<cmath>
using namespace std;
int main(){
  int n;
  cout<<"enter the count : ";
  cin>>n;                            // taking size of array from user 

  int a[n]={ };                      // Dynamic array

  for( int i=0; i<n; i++ ){
    cout<<"enter element : ";
    cin>>a[i];                     // taking input in array 
  }
  
  cout<<" array : { ";
  
  for( int i=0; i<n; i++ ){
    cout<<"\t"<<a[i];              // Displaying array elements 
  }
  cout<<" }";

  return 0;
}
