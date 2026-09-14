#include <iostream>
#include <memory>
using namespace std;

class Shader{
private:
    string name;
    string type;
public:
    Shader(string n,string t){
        name = n;
        type = t;
        cout << "Shader Compiled" << endl;
    }

    ~Shader(){
        cout << "Shader destroyed" << endl;
    }

    void display(){
        cout << "Name:" << name << endl;
        cout << "Type:" << type << endl;
    }

};

int main(){
    shared_ptr<Shader> s1 = make_shared<Shader>("main_vert","vertex");
    cout << "Count1: " << s1.use_count() << endl;
    shared_ptr<Shader> s2 =  s1;
    cout << "Count2: " << s1.use_count() << endl;
    shared_ptr<Shader> s3 =  s2;
    cout << "Count3: " << s1.use_count() << endl;

    {
    shared_ptr<Shader> s4 = s3;
    cout << "Inside block: " << s1.use_count() << endl;
}
     cout << "After block: " << s1.use_count() << endl;
    return 0;
}