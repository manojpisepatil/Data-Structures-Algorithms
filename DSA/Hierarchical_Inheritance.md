# Inheritance in C++: Animal, Dog, and Cat Classes

This C++ program demonstrates the concept of inheritance in object-oriented programming. The program uses three classes:
- A **base class** called `Animal`.
- Two **derived classes**: `Dog` and `Cat`, both inherit from `Animal`.

The program shows how a derived class can inherit properties and functions from a base class and also have its own unique behavior.

## Code

```cpp
#include <iostream>
#include <cmath>  
using namespace std;   
// base class
class Animal { 
public:
    void info() {
        cout << "I am an animal." << endl;
    }
};
// derived class 1
class Dog : public Animal {
public:
    void bark() {
        cout << "I am a Dog. Woof woof." << endl;
    }
};
// derived class 2
class Cat : public Animal {
public:
    void meow() {
        cout << "I am a Cat. Meow." << endl;
    }
};
int main() {
    // create object of Dog class
    Dog dog1;
    cout << "Dog Class:" << endl;
    dog1.info();  // parent Class function
    dog1.bark();
    // create object of Cat class
    Cat cat1;
    cout << "\nCat Class:" << endl;
    cat1.info();  // parent Class function
    cat1.meow();
    return 0;
}
```
## Sample Output
```
Dog Class:
I am an animal.
I am a Dog. Woof woof.

Cat Class:
I am an animal.
I am a Cat. Meow.


