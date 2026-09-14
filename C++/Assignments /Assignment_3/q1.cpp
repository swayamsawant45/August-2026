#include <iostream>
using namespace std;

enum class HttpStatus{
    OK = 200,
    Created = 201,
    BadRequest = 400,
    Unauthorized = 401,
    NotFound = 404,
    ServerError = 500

};



void handleResponse(HttpStatus status, const string& endpoint){
    cout << "Endpoint: " << endpoint << endl;
    switch(status){
        case HttpStatus::OK: cout << "OK" << endl;break;
        case HttpStatus::Created: cout << "Created" << endl;break;
        case HttpStatus::BadRequest: cout << "BadRequest" << endl;break;
        case HttpStatus::Unauthorized: cout << "Unauthorized" << endl;break;
        case HttpStatus::ServerError: cout << "ServerError" << endl;break;
        case HttpStatus::NotFound: cout << "NotFound" << endl;break;
        
        
    }
    cout << "Status: " << static_cast<int>(status)<<endl;
}


int main(){

    handleResponse(HttpStatus::Created,"/home") ;
    handleResponse(HttpStatus::OK,"/profile");
    handleResponse(HttpStatus::BadRequest,"/settings");
    handleResponse(HttpStatus::NotFound,"/aboutus");


    return 0;
}