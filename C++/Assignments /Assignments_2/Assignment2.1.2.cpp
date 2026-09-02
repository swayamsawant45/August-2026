//============================================================================
// Name        : 2.cpp
// Author      : Swayam
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

double reorderCost(int qty, double unitPrice)  							  // integer quantity
{
	return qty*unitPrice;
}

double reorderCost(double qty, double unitPrice)			   			 // fractional (by weight)
{
	return qty*unitPrice;
}
double reorderCost(int qty, double unitPrice, double taxRate) 		    // with tax
{
	double base = qty * unitPrice;
	 return base + (base * taxRate / 100.0);

}

double applyDiscount(double price, double discountPercent = 10.0)		// If no discount is passed, apply 10% by defaul
{
	return price - (price * discountPercent / 100);
}


int main() {

		int qtyInt = 50;
	    double qtyFrac = 12.5;
	    double unitPrice = 20.0;
	    double taxRate = 8.0;

	    double cost1 = reorderCost(qtyInt , unitPrice);
	    double cost2 = reorderCost( qtyFrac , unitPrice);
	    double cost3 = reorderCost(qtyInt, unitPrice, taxRate);

	    cout << "Cost (int qty): " << cost1 <<endl;
	    cout << "Cost (fractional qty): " << cost2 << endl;
	    cout << "Cost (int qty + tax): " << cost3 << endl;

	    double discounted1 = applyDiscount(500);
	    double discounted2 = applyDiscount(500,15);

	    cout << "Price after default discount: " << discounted1 << endl;
	    cout << "Price after custom discount: " << discounted2 << endl;

	    return 0;

}
