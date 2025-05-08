# Multilevel Inheritance in C++

This C++ program demonstrates **multilevel inheritance**, where a class inherits from another derived class. In this case, Class `C` inherits from Class `B`, and Class `B` inherits from Class `A`. The program allows the user to input values for three variables (`a`, `b`, `c`) and calculates the sum of these variables.

## Code

```cpp
#include <iostream>
#include <string>
#include <cmath>
using namespace std;

// Parent Class
class A {
public:
    int a;
    void get_A_data()
    {
        cout << "Enter value of a: ";
        cin >> a;
    }
};

// derived class from Parent Class
class B : public A {
public:
    int b;
    void get_B_data()
    {
        cout << "Enter value of b: ";
        cin >> b;
    }
};

// derived from class Previous derived class
class C : public B {
private:
    int c;

public:
    void get_C_data()
    {
        cout << "Enter value of c: ";
        cin >> c;
    }

    // function to print sum
    void sum()
    {
        int ans = a + b + c;
        cout << "sum: " << ans;
    }
};

int main()
{
    // object of derived class
    C obj;

    obj.get_A_data();
    obj.get_B_data();
    obj.get_C_data();
    obj.sum();
    return 0;
}
```
## Sample Output
```
Enter value of a: 3
Enter value of b: 5
Enter value of c: 7
sum: 15
