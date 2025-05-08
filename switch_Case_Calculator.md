# Simple Calculator using Switch Statement in C++

This C++ program implements a simple calculator that can perform basic arithmetic operations such as addition, subtraction, multiplication, and division. The program uses a `switch` statement to determine which operation to perform based on user input.

## Code

```cpp
// simple calculator using switch Statement
#include <iostream>
using namespace std;  
int main() { 
    char oper;
    float num1, num2;
    cout << "Enter an operator (+, -, *, /): ";
    cin >> oper;
    cout << "Enter two numbers: " << endl;
    cin >> num1 >> num2;
    switch (oper) {
        case '+':
            cout << num1 << " + " << num2 << " = " << num1 + num2;
            break;
        case '-':
            cout << num1 << " - " << num2 << " = " << num1 - num2;
            break;
        case '*':
            cout << num1 << " * " << num2 << " = " << num1 * num2;
            break;
        case '/':
            cout << num1 << " / " << num2 << " = " << num1 / num2;
            break;
        default:
            // operator is doesn't match any case constant (+, -, *, /) 
            cout << "Error! The operator is not correct";
            break;
    }
    return 0;
}
```
## Sample Output
```
Enter an operator (+, -, *, /): +
Enter two numbers: 
5 3
5 + 3 = 8

