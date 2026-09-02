//============================================================================
// Name        : 2.cpp
// Author      : Swayam
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;


// ================================
// Physics Namespace
// ================================

namespace Physics
{
    // Clamp a velocity
    double clamp(double val, double min, double max)
    {
        if (val < min)
        {
            return min;
        }

        if (val > max)
        {
            return max;
        }

        return val;
    }


    // Linear interpolation for physics
    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}


// ================================
// GameMath Namespace
// ================================

namespace GameMath
{
    // Clamp an integer stat
    int clamp(int val, int min, int max)
    {
        if (val < min)
        {
            return min;
        }

        if (val > max)
        {
            return max;
        }

        return val;
    }


    // Linear interpolation for UI animations
    double lerp(double a, double b, double t)
    {
        return a + (b - a) * t;
    }
}


// ================================
// Main Function
// ================================

int main()
{
    // Calling Physics::clamp()
    double velocity = Physics::clamp(150.5, 0.0, 100.0);

    cout << "Physics clamp: "
         << velocity << endl;


    // Calling GameMath::clamp()
    int health = GameMath::clamp(120, 0, 100);

    cout << "GameMath clamp: "
         << health << endl;


    // Calling Physics::lerp()
    double physicsResult = Physics::lerp(0.0, 100.0, 0.25);

    cout << "\nPhysics lerp: "
         << physicsResult << endl;


    // Calling GameMath::lerp()
    double uiResult = GameMath::lerp(50.0, 100.0, 0.5);

    cout << "GameMath lerp: "
         << uiResult << endl;


    // ==========================================
    // Limited block scope using namespace
    // ==========================================

    {
        using namespace Physics;

        cout << "\nUsing namespace in limited scope:" << endl;

        // We can write lerp() directly here
        // because Physics namespace is active
        // only inside this block.

        cout << lerp(0.0, 100.0, 0.5) << endl;
    }


    return 0;
}
