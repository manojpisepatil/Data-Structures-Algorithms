#include <iostream>
#include <string>
#include <cmath>
using namespace std;

// Parent Class
class Room {
   public:
    double length;
    double breadth;
    double height;

};

// Single Inheritance  ( Child Class )
class Home : public Room {
    public :
      double calculate_area() {
          return length * breadth;
      }
      
      double calculate_volume() {
          return length * breadth * height;
      }
};


int main() {

    Home room1;     // Object of Child Class

    // assign values to data members
    room1.length = 42.5;
    room1.breadth = 30.8;
    room1.height = 19.2;

    // calculate and display the area and volume of the room
    cout << "Area of Room =  " << room1.calculate_area() << endl;
    cout << "Volume of Room =  " << room1.calculate_volume() << endl;

    return 0;
}
