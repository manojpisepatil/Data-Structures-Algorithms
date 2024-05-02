#include <iostream>
#include <cmath>  
using namespace std;  
   
// base class
class Animal {
public:
    void info() {
        cout << "I am an animal." << endl;
    }
};n

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
