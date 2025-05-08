# Dynamic Array Input and Display in C++

This C++ program demonstrates how to take input for a dynamic array from the user, store the values, and then display the array. The user is prompted to enter the number of elements in the array and their values. The program then displays the array elements in a formatted output.

## Code

```cpp
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
```
## Sample Output
```
enter the count : 5
enter element : 12
enter element : 34
enter element : 56
enter element : 78
enter element : 90
 array : {   12    34    56    78    90 }
