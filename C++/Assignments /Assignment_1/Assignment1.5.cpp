//============================================================================
// Name        : 5.cpp
// Author      : Swayam
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cmath>

using namespace std;

const double PI = 3.14159265358979323846;

inline double distanceBetween(double x1, double y1,
                              double x2, double y2) {
    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
}

inline double toRadians(double degrees) {
    return degrees * (PI / 180.0);
}

inline double clamp(double value, double minVal, double maxVal) {
    if (value < minVal) {
        return minVal;
    }

    if (value > maxVal) {
        return maxVal;
    }

    return value;
}

inline bool isInSafeZone(double x, double y,
                         double cx, double cy,
                         double radius) {
    double distance = distanceBetween(x, y, cx, cy);

    return distance <= radius;
}

int main() {
    double homeX = 0.0;
    double homeY = 0.0;
    double safeRadius = 50.0;

    // Three drone waypoints
    double x1 = 30.0, y1 = 40.0;
    double x2 = 40.0, y2 = 40.0;
    double x3 = 10.0, y3 = 20.0;

    double distance1 = distanceBetween(x1, y1, homeX, homeY);
    cout << "Waypoint 1 distance: " << distance1 << endl;
    cout << "Inside safe zone: "
         << isInSafeZone(x1, y1, homeX, homeY, safeRadius) << endl;

    double distance2 = distanceBetween(x2, y2, homeX, homeY);
    cout << "\nWaypoint 2 distance: " << distance2 << endl;
    cout << "Inside safe zone: "
         << isInSafeZone(x2, y2, homeX, homeY, safeRadius) << endl;

    double distance3 = distanceBetween(x3, y3, homeX, homeY);
    cout << "\nWaypoint 3 distance: " << distance3 << endl;
    cout << "Inside safe zone: "
         << isInSafeZone(x3, y3, homeX, homeY, safeRadius) << endl;

    // Examples of the other helper functions
    cout << "\n90 degrees in radians: " << toRadians(90.0) << endl;
    cout << "Clamped value of 120 in range 0-100: "
         << clamp(120.0, 0.0, 100.0) << endl;

    return 0;
}
