#include <iostream>
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
    
    for ( int i=1; i<n+1; i++){
        if(a[i]+a[i+1] == k){
            cout<<"Values are : ";
            cout<<a[i]<<" & "<<a[i+1];
            cout<<" for , index  "<<i<<" , "<<i+1<<" respectively";
        }
    }

    return 0;
}
