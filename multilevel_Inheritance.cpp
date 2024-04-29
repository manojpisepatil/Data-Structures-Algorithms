// Multilevel Inheritance
#include <iostream>
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

// derived class from base class
class B : public A {
public:
	int b;
	void get_B_data()
	{
		cout << "Enter value of b: ";
		cin >> b;
	}
};

// derived from class derive1
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
