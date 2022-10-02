/*
intro to freind function
finding greater number
*/

#include <iostream>
using namespace std;

class basic1;

class basic
{
    int num1;
public:
    basic(int);
    void display();
    friend void compare(basic,basic1);
};

class basic1
{
    int num2;
public:
    basic1(int);
    void display();
    friend void compare(basic,basic1);
};

basic ::basic(int n) {
    num1  = n;
}

basic1 ::basic1(int n) {
    num2 = n;
}

void basic::display() {
    cout << "num1 : " << num1 << endl;
}

void basic1 ::display() {
    cout << "num2:" << num2 << endl;
}

void compare (basic x , basic1 y)
{
    if (x.num1 > y.num2)
        cout << "num1 > num2";
    else
        cout << "num2 > num1";
}

int main() {

    basic obj1(10);
    obj1.display();

    basic1 obj2(20);
    obj2.display();


    compare(obj1,obj2);

    return 0;
}
