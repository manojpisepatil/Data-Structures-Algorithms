# Room Area and Volume Calculator in C++

This C++ program defines a `Room` class that calculates the area and volume of a room. The class has three data members: `length`, `breadth`, and `height`, and two member functions: one to calculate the area and one to calculate the volume.

## Code

```cpp
#include <iostream>
#include <string>
#include <cmath>
using namespace std;

class Room {

   public:
    double length;
    double breadth;
    double height;

    double calculate_area() {
        return length * breadth;
    }

    double calculate_volume() {
        return length * breadth * height;
    }
};

int main() {

    Room room1;

    // assign values to data members
    room1.length = 42.5;
    room1.breadth = 30.8;
    room1.height = 19.2;

    // calculate and display the area and volume of the room
    cout << "Area of Room =  " << room1.calculate_area() << endl;
    cout << "Volume of Room =  " << room1.calculate_volume() << endl;

    return 0;
}
```
## Sample Output
```
Area of Room =  1308.2
Volume of Room =  24357.6

