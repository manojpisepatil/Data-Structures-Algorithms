# Hybrid Inheritance in C++

This C++ program demonstrates **hybrid inheritance**, where a derived class inherits from more than one base class. It showcases single inheritance, multiple inheritance, and the combination of both to create a class hierarchy. The program consists of the following classes:

1. **Person**: Base class containing the name of a person.
2. **Employee**: Inherits from `Person` and adds employee-specific details.
3. **Student**: Inherits from `Person` and adds student-specific details.
4. **StudentIntern**: Inherits from both `Employee` and `Student` (Multiple Inheritance) and combines their functionalities.

## Code

```cpp
#include <bits/stdc++.h> 
using namespace std; 
// Base class 
class Person {   
protected: 
    string name;   
public: 
    Person(const string& name) 
        : name(name) 
    { 
    } 
    void display() { cout << "\nName: " << name << endl; } 
}; 
// Derived class 1: Employee (Single Inheritance) 
class Employee : public Person { 
protected: 
    int employeeId; 
public: 
    Employee(const string& name, int id) 
        : Person(name) 
        , employeeId(id) 
    { 
    } 
    void displayEmployee() 
    { 
        display(); 
        cout << "Employee ID: " << employeeId << endl; 
        cout << "Method inside Derived Class Employee" << endl; 
    } 
}; 

// Derived class 2: Student (Single Inheritance) 
class Student : public Person { 
protected: 
    int studentId; 
public: 
    Student(const string& name, int id) 
        : Person(name) 
        , studentId(id) 
    { 
    } 
    void displayStudent() 
    { 
        display(); 
        cout << "Student ID: " << studentId << endl; 
        cout << "Method inside Derived Class Student" << endl; 
    } 
}; 
// Derived class 3: StudentIntern (Multiple Inheritance) 
class StudentIntern : public Employee, public Student { 
public: 
    StudentIntern(const string& name, int empId, int stuId) 
        : Employee(name, empId) 
        , Student(name, stuId) 
    { 
    } 
    void displayStudentIntern() 
    { 
        cout << "Methods inside Derived Class StudentIntern : " << endl; 
        displayEmployee(); 
        displayStudent(); 
    } 
}; 
// driver code 
int main() 
{ 
    StudentIntern SI("Riya", 67537, 2215); 
    SI.displayStudentIntern(); 
    return 0; 
}
```
## Sample Output
```
Methods inside Derived Class StudentIntern : 
Name: Riya
Employee ID: 67537
Method inside Derived Class Employee
Name: Riya
Student ID: 2215
Method inside Derived Class Student
