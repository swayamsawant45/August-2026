//============================================================================
// Name        : 1.cpp
// Author      : Swayam
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
using namespace std;

class Patient
{
private:
    int patientId;
    string name;
    int age;
    string ward;
    const string bloodGroup;

public:
    // Default Constructor
    Patient();

    // Emergency Admission Constructor
    Patient(int id, const string& name);

    // Full Admission Constructor
    Patient(int id, const string& name, int age,
            const string& ward, const string& bg);

    // Destructor
    ~Patient();

    // Display patient details
    void displayRecord() const;

    // Transfer patient to another ward
    void transferWard(const string& newWard);
};


// Default Constructor
Patient::Patient()
    : patientId(0),
      name("Unknown"),
      age(0),
      ward("General"),
      bloodGroup("O+")
{
    cout << "[Constructor] Default patient registered." << endl;
}


// Emergency Admission Constructor
Patient::Patient(int id, const string& patientName)
    : patientId(id),
      name(patientName),
      age(0),
      ward("General"),
      bloodGroup("O+")
{
    cout << "[Constructor] Emergency: " << name << endl;
}


// Full Admission Constructor
Patient::Patient(int id, const string& patientName, int patientAge,
                 const string& patientWard, const string& bg)
    : patientId(id),
      name(patientName),
      age(patientAge),
      ward(patientWard),
      bloodGroup(bg)
{
    cout << "[Constructor] Full admission: " << name << endl;
}


// Destructor
Patient::~Patient()
{
    cout << "[Destructor] Patient "
         << name
         << " discharged."
         << endl;
}


// Display Patient Record
void Patient::displayRecord() const
{
    cout << "\nPatient Record:" << endl;
    cout << "ID        : " << patientId << endl;
    cout << "Name      : " << name << endl;
    cout << "Age       : " << age << endl;
    cout << "Ward      : " << ward << endl;
    cout << "Blood Grp : " << bloodGroup << endl;
}


// Transfer Ward
void Patient::transferWard(const string& newWard)
{
    ward = newWard;

    cout << "\nWard Transfer: "
         << name
         << " -> "
         << ward
         << endl;
}


int main()
{
    // 1. Three stack objects

    Patient p1(1001, "Meera Joshi", 34, "Cardiology", "B+");

    Patient p2(1002, "Raj Patel");

    Patient p3;


    cout << "\n--- Full Patient Record ---" << endl;
    p1.displayRecord();


    // 2. Dynamic array of 4 patients
    cout << "\n--- Creating Dynamic Patient Array ---" << endl;

    Patient* patients = new Patient[4];


    // 3. Display all 4 records
    cout << "\n--- Dynamic Patient Records ---" << endl;

    for (int i = 0; i < 4; i++)
    {
        patients[i].displayRecord();
    }


    // 4. Transfer Raj Patel to ICU
    p2.transferWard("ICU");


    // Show updated record
    p2.displayRecord();


    // 5. Delete dynamic array
    cout << "\n--- Deleting Dynamic Patient Array ---" << endl;

    delete[] patients;


    // 6. p1, p2 and p3 will automatically
    // be destroyed at the end of main()

    cout << "\n--- End of main() ---" << endl;

    return 0;
}
