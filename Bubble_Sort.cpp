#include<iostream>
#include<cmath>
using namespace std;
int main(){
  int n;
  cout<<"enter count : ";     // element count in array
  cin>>n;

  int a[n] = { };         

  
  for ( int i=0; i<n; i++ ){
    cout<<"enter element : ";
    cin>>a[i];                     // inserting elements in array
  }

  cout<<"\narray : { ";
  for ( int i=0; i<n; i++ ){
    cout<<"\t"<<a[i];              // displaying  elements from array
  }
  cout<<" }";

                              // Bubble sorting
  int temp = 0;
  for ( int i=0; i<n; i++ ){
    for ( int j=0; j<n; j++ ){
      if( a[i]<a[j]){
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
    }
  }


  cout<<"\n\nsorted array : { ";
  for ( int i=0; i<n; i++ ){
    cout<<"\t"<<a[i];              // displaying  sorted array
  }
  cout<<" }";
  
}
