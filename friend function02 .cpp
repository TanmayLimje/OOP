#include <iostream>
using namespace std;

class m_cm;

class ft_in
{

private:
    double feet;
    double inch;

public:
    void get_data();
    friend ft_in add(ft_in y,m_cm x);
    friend m_cm add (m_cm x,ft_in y);
    friend ft_in sub(ft_in y,m_cm x);
    friend m_cm sub (m_cm x,ft_in y);
    void display();

};

class m_cm
{

private:
    double meter;
    double cm;

public:
    void get_data();
    friend ft_in add(ft_in y,m_cm x);
    friend m_cm add (m_cm x,ft_in y);
    friend ft_in sub(ft_in y,m_cm x);
    friend m_cm sub (m_cm x,ft_in y);
    void display();

};

void ft_in :: get_data()
{
    cout << "Enter feet: ";
    cin >> feet;

    cout << "Enter inches:  ";
    cin >> inch;
}

void m_cm :: get_data()
{
    cout << "Enter meter: ";
    cin >> meter;

    cout << "Enter centimeter:  ";
    cin >> cm;
}

void ft_in :: display()
{
    cout << "Feet: " << feet << "  " << "Inches: " << inch << endl;
}

void m_cm :: display()
{
    cout << "Meter: " << meter << "  " << "centimeter: " << cm << endl;
}


ft_in add (ft_in x, m_cm y)
{
    double result;

    result = (x.feet * 12) + x.inch  + (y.meter *39.3701) + (y.cm * 0.393701 );

    int ans = result;

    ft_in temp;
    temp.feet = ans / 12;
    temp.inch = ans % 12;

    return temp;

}

m_cm add (m_cm x, ft_in y)
{

    double result;

    result = (y.feet * 30.48) + (y.inch *2.54) + (x.meter * 100) + x.cm;

    int ans = result;

    m_cm temp;
    temp.meter = ans / 100;
    temp.cm = ans % 100;

    return temp;

}

ft_in sub (ft_in x,m_cm y)
{

    double result;

    result = (x.feet * 12) - x.inch  - (y.meter *39.3701) - (y.cm * 0.393701 );

    int ans = result;

    ft_in temp;
    temp.feet = ans / 12;
    temp.inch = ans % 12;

    return temp;
}

m_cm sub (m_cm x,ft_in y)
{

    double result;

    result = (y.feet * 30.48) + (y.inch *2.54) + (x.meter * 100) + x.cm;

    int ans = result;

    m_cm temp;
    temp.meter = ans / 100;
    temp.cm = ans % 100;

    return temp;

}

int main()
{

    ft_in f1,f2,f3;
    m_cm m1,m2,m3;


    int input = -1;

    do
    {

        cout << "1.  Enter the values" << endl;
        cout << "2.  Add" << endl;
        cout << "3.  Sub" << endl;
        cout << "4.  display" << endl;
        cout << "5.  Exit" << endl;
        cout << "ENTER YOUR CHOICE:  ";
        cin >> input;


        switch(input)
        {
            case 1:

                f1.get_data();
                m1.get_data();
                cout << "The values have been Entered" << endl;

                break;

            case 2:

                f2 = add(f1,m1);
                m2 = add(m1,f1);
                cout << "The values have been Added " << endl;

                break;

            case 3:

                f3 = sub(f1,m1);
                m3 = sub(m1,f1);
                cout << "The values have been Subtracted " << endl;
                break;

            case 4:
                int input2;

                do
                {
                    cout << "1. Display all values" << endl;
                    cout << "2. Display Addition" << endl;
                    cout << "3. Display Subtraction" << endl;
                    cout << "4. Exit" << endl;

                    cin >> input2;

                    switch(input2)
                    {
                        case 1:
                            cout << "DISPLAY" << endl;
                            f1.display();
                            m1.display();
                            break;
                        case 2:
                            cout << "DISPLAY" << endl;
                            f2.display();
                            m2.display();
                            break;
                        case 3:
                            cout << "DISPLAY" << endl;
                            f3.display();
                            m3.display();
                            break;

                    }
                }while (input2 !=4);
                break;



        }


    }while( input != 5)

}
