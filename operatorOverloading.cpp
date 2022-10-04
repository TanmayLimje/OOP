#include <iostream>
using namespace std;

class sample{
    int num;

public:
    void getdata();
    void display();
    friend sample operator + (sample,int);
    friend sample operator + (int,sample);
};

void sample :: getdata(){
    cout<< "Enter a number:" << endl;
    cin >> num;
}

void sample ::display() {
    cout << "the number is:" <<num << endl;
}

sample operator+(sample y, int z) {
    sample temp;
    temp.num = z + y.num;
    return temp;
}

sample operator+(int z, sample y){
    sample temp;
    temp.num = y.num + z;
    return temp;
}

int main() {

    sample obj, obj1, obj3;

    obj.getdata();
    obj.display();

    int x;
    cout << "Enter value for x: " << endl;
    cin >> x;

    obj1 = obj + x;
    obj1.display();

    obj3 = x + obj;
    obj3.display();
}
