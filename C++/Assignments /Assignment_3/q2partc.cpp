#include <iostream>
#include <memory>
using namespace std;

class AudioClip{
private:
    string name;
    int time;
    
public:
    AudioClip(string n, int t){
        name = n;
        time = t;
       
        cout << "Audio clip Compiled" << endl;
    }

    ~AudioClip(){
        cout << "audioclip destroyed" << endl;
    }

    void display(){
        cout << "Name:" << name << endl;
        cout << "Time:" << time << endl;
    }

};

int main(){
    shared_ptr<AudioClip> audio = make_shared<AudioClip>("explosion" , 3);
    weak_ptr<AudioClip> w = audio;

    auto temp = w.lock();
    temp->display();
    audio.reset();
    cout << "Count: " << audio.use_count() << endl;
    auto temp2 = w.lock();
    // w.reset();

    if(w.expired()){
        cout << "Clip already unlocked" << endl;
    }

    return 0;
}