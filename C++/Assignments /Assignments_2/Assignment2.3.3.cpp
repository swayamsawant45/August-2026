//============================================================================
// Name        : 3.cpp
// Author      : Swayam
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

// Global variable
int level = 1;

// Nested namespace
namespace Engine {
    namespace Audio {
        void playSound(string name) {
            cout << "Playing: " << name << endl;
        }
    }
}

int main() {

    // Local variable
    int level = 5;

    // Scope Resolution Operator
    cout << "Global level: " << ::level << endl;
    cout << "Player level: " << level << endl;

    // Read rows and columns
    int R, C;

    cout << "Enter number of rows: ";
    cin >> R;

    cout << "Enter number of columns: ";
    cin >> C;

    // Allocate 2D array dynamically
    int** gameMap = new int*[R];

    for (int i = 0; i < R; i++) {
        gameMap[i] = new int[C];
    }

    // Seed random number generator
    srand(time(0));

    // Fill the grid
    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            gameMap[i][j] = rand() % 5;
        }
    }

    // Display the map
    cout << "\n===== GAME MAP (" << R << " x " << C << ") =====\n";

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            cout << gameMap[i][j] << "  ";
        }
        cout << endl;
    }

    // Legend
    cout << "\nLegend: "
         << "0=Grass  "
         << "1=Water  "
         << "2=Mountain  "
         << "3=Forest  "
         << "4=Dungeon\n";

    // Count each tile
    int count[5] = {0};

    for (int i = 0; i < R; i++) {
        for (int j = 0; j < C; j++) {
            count[gameMap[i][j]]++;
        }
    }

    // Display counts
    cout << "\nTile Count:\n";
    cout << "Grass    : " << count[0] << endl;
    cout << "Water    : " << count[1] << endl;
    cout << "Mountain : " << count[2] << endl;
    cout << "Forest   : " << count[3] << endl;
    cout << "Dungeon  : " << count[4] << endl;

    // Call nested namespace function
    Engine::Audio::playSound("sword_clash");

    // Deallocate memory
    for (int i = 0; i < R; i++) {
        delete[] gameMap[i];
    }

    delete[] gameMap;

    return 0;
}
