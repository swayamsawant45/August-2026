//============================================================================
// Name        : 3.cpp
// Author      : Swayam
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
#include <iomanip>

int main() {
	float arr[3][3];
	cout << "Enter temp of 9 rooms" <<endl;


	for(int i = 0 ; i<3 ; i++)
	{
		for(int j = 0 ; j<3 ; j++){
			cin >> arr[i][j];
		}

	}

	cout << "temp of 9 rooms : " <<endl ;

	cout << "       "
		         << setw(8) << "Room1"
		         << setw(8) << "Room2"
		         << setw(8) << "Room3"
		         << endl;


	for(int i = 0 ; i<3 ; i++)
		{
			cout << "Floor " <<i+1 << " : " << "  " ;
			for(int j = 0 ; j<3 ; j++){
				cout << arr[i][j] << "       " ;

			}

			cout << endl ;

		}


	double hottest = 0, hottestAvg=0, hottestAvgFloor=0;
	int hottestfloor=0, hottestroom=0, count = 0;

		for (int i=0 ; i<3 ; i++){  // i = 0, 1, 2

			double tempTotal=0;     // tempTotal = 0

			for (int j=0 ; j<3 ; j++){ // j = 0 , 1, 2
				tempTotal= tempTotal + arr[i][j]; // tempTotal = 1 , 3, 6 // 4, 9, 15 // 7, 15, 24

				if(arr[i][j] > 30){
					count++;
				}
			 if(arr[i][j] > hottest) // 1>0
			 {
				 hottest = arr[i][j]; // 1
				 hottestfloor = i ; // 0
				 hottestroom = j; //0
			  }

			}
			double avg = tempTotal / 3;  // avg = 2 , 5, 8
			hottestAvgFloor = avg > hottestAvg ? i : hottestAvgFloor; // 2 > 0 = 0 , 5 > 2 = 1

			hottestAvg = avg > hottestAvg ? avg : hottestAvg ;  // 5 > 2 ==5 // 8 > 5  == 8
			// var = condition ? true : false

//			if(avg > hottestAvg){ // 2 > 0
//				hottestAvg = avg; // 2
//			}
		}

		//if (arr[0][0])
		cout <<"Hottestroom : " << "Floor : " << hottestfloor+1 <<" " << "Room : " <<hottestroom+1 <<" " <<"-> " << hottest <<"\u00B0C1" <<endl;
		cout << "Hottest Floor :" << hottestAvgFloor+1  << " : " << hottestAvg <<endl;
		cout << "Rooms at WARNING or above : "  << count ;



//		double floor1, floor2, floor3;
//		double avg1, avg2, avg3;
//
//
//
//		avg1 = (arr[0][0] + arr[1][0] + arr[2][0])/3;
//		cout << "Avrage 1: " <<avg1 <<endl ;
//
//
//		avg2 = (arr[0][1] + arr[1][1] + arr[2][1])/3;
//		cout << "Avrage 2: " <<avg2 <<endl ;
//
//
//		avg3 = (arr[0][2] + arr[0][1] + arr[0][1])/3;
//		cout << "Avrage 3: " <<avg3 <<endl ;
//
//
//		for(int i = 0 ; i<3 ; i++)
//			{
//				for(int j = 0 ; j<3 ; j++){
//					cin >> arr[i][j];
//				}
//
//			}
//
//
////
////			if (floor1){
////						avg1 = (arr[0][0] + arr[0][1] + arr[0][3])/3;
////
////					}

	return 0;
}
