# Finding Two Elements Sum in an Array

This C++ program accepts an array of integers and a target value `k`. It then finds two consecutive elements in the array whose sum is equal to `k` and displays their values along with their indices.

## Code

```cpp
#include <iostream>
#include <string>
#include <cmath>
using namespace std;
int main() {
    int n , k;
    cout << "enter count : ";
    cin>>n;
    int a[n] = { };
    for ( int i=0; i<n; i++){
        cout<<"enter element : ";
        cin>>a[i];
    }
    cout << "\n\narray : {";
    for ( int i=0; i<n; i++){
        cout<<"\t"<<a[i];
    }
    cout <<" }"<<endl;
     // k should be addition of two numbers from array
    cout<<"\nenter k : ";
    cin>>k;
    // Logic Created for finding k parents from the array
    for ( int i=1; i<n+1; i++){
        if(a[i]+a[i+1] == k){                // at minimum cost of time and space for better complexity
            cout<<"Values are : ";
            cout<<a[i]<<" & "<<a[i+1];
            cout<<" for , index  "<<i<<" , "<<i+1<<" respectively";
        }
    }
    return 0;
}
```
## Sample Output
```
enter count : 5
enter element : 1
enter element : 2
enter element : 3
enter element : 4
enter element : 5

array : {    1    2    3    4    5 }

enter k : 5
Values are : 2 & 3 for , index  1 , 2 respectively
