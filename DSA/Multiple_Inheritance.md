# Multiple Inheritance in C++

This C++ program demonstrates multiple inheritance where a derived class inherits from two base classes. The program defines two base classes, each with a member function, and a derived class that inherits both base classes and adds its own member function.

## Code

```cpp
#include <iostream>   
#include <cmath>  
#include <string> 
using namespace std;   

// create a base class1    
class Base_class  
{  
    // access specifier  
    public:   
    // It is a member function  
    void display()  
    {  
        cout << " It is the first function of the Base class " << endl;  
    }  
};  

// create a base class2  
class Base_class2  
{  
    // access specifier  
    public:   
    // It is a member function  
    void display2()  
    {  
        cout << " It is the second function of the Base class " << endl;  
    }  
};  

/* create a child_class to inherit features of Base_class and Base_class2 with access specifier. */  
class child_class: public Base_class, public Base_class2  
{  
      
    // access specifier  
    public:  
    void display3() // It is a member function of derive class  
    {  
        cout << " It is the function of the derived class " << endl;      
    }  
};  

int main ()  
{  
    // create an object for derived class  
    child_class ch;   
    ch.display(); // call member function of Base_class1  
    ch.display2(); // call member function of Base_class2  
    ch.display3(); // call member function of child_class  
}
```
## Sample Output
```
 It is the first function of the Base class
 It is the second function of the Base class
 It is the function of the derived class

