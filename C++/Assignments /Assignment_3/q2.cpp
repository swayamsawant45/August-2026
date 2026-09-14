#include <iostream>
#include <memory>
#include <string>
using namespace std;


class Texture{
private:
    string name;
    int width;
    int height;

public:

    Texture(string n,int w , int h){
        name = n;
        width = w;
        height = h;
    }

    ~Texture(){
        cout << "Texture Destrooyed" << endl;

    }

    void display() const{
        cout << "name: " << name << endl;
        cout << "width: " << width << endl;
        cout << "height: " << height << endl;
    }


};

int main(){
    unique_ptr<Texture> t1 = make_unique<Texture>("Soham",20,30);
    t1->display();

    shared_ptr<Texture> p1 = make_shared<Texture>("Basic texture",20,30);
    shared_ptr<Texture> p2 =  p1;

    cout << p1.use_count() << endl;

    shared_ptr<Texture> audio = make_shared<Texture>("soham",20,30);
    weak_ptr<Texture> w =  audio;

    auto temp = w.lock();
    temp->display();

    return 0;


}