# Bubble Sort in C++

This program implements a simple bubble sort algorithm to sort an array of integers input by the user.

## Code

```cpp
#include<iostream>
#include <string>
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
```

## Sample output
```
enter count : 5
enter element : 8
enter element : 1
enter element : 4
enter element : 6
enter element : 3

array : { 8    1    4    6    3  }

sorted array : { 1    3    4    6    8  }
