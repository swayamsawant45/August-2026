//============================================================================
// Name        : 1.cpp
// Author      : Swayam
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip>
#include <string>

using namespace std;

class Product
{
private:
    int productId;
    string name;
    double price;
    int quantity;

public:
    // Takes input from the user
    void acceptDetails()
    {
        cout << "\nEnter Product ID: ";
        cin >> productId;

        cout << "Enter Product Name: ";
        cin >> ws;              // Removes leftover newline
        getline(cin, name);

        cout << "Enter Price: ";
        cin >> price;

        cout << "Enter Quantity: ";
        cin >> quantity;
    }

    // Overloaded function: takes values directly
    void acceptDetails(int id, string productName, double productPrice, int productQuantity)
    {
        productId = id;
        name = productName;
        price = productPrice;
        quantity = productQuantity;
    }

    void displayDetails() const
    {
        cout << left
             << setw(10) << productId
             << setw(20) << name
             << setw(12) << fixed << setprecision(2) << price
             << setw(10) << quantity
             << setw(15) << totalValue()
             << endl;
    }

    double totalValue() const
    {
        return price * quantity;
    }

    bool isLowStock(int threshold) const
    {
        return quantity < threshold;
    }
};

int main()
{
    Product products[5];

    // Accept details for 5 products
    for (int i = 0; i < 5; i++)
    {
        cout << "\n----- Enter details for Product " << i + 1 << " -----";
        products[i].acceptDetails();
    }

    // Display all products
    cout << "\n\n========== INVENTORY REPORT ==========\n";

    cout << left
         << setw(10) << "ID"
         << setw(20) << "Name"
         << setw(12) << "Price"
         << setw(10) << "Qty"
         << setw(15) << "Total Value"
         << endl;

    cout << "-----------------------------------------------------------------\n";

    for (int i = 0; i < 5; i++)
    {
        products[i].displayDetails();
    }

    // Find product with highest total value
    int highestIndex = 0;

    for (int i = 1; i < 5; i++)
    {
        if (products[i].totalValue() > products[highestIndex].totalValue())
        {
            highestIndex = i;
        }
    }

    cout << "\nHighest Value Product:\n";
    products[highestIndex].displayDetails();

    // Low-stock products
    int threshold;

    cout << "\nEnter low-stock threshold: ";
    cin >> threshold;

    cout << "\nLow Stock Products:\n";

    bool foundLowStock = false;

    for (int i = 0; i < 5; i++)
    {
        if (products[i].isLowStock(threshold))
        {
            products[i].displayDetails();
            foundLowStock = true;
        }
    }

    if (!foundLowStock)
    {
        cout << "No products are below the threshold.\n";
    }

    return 0;
}

