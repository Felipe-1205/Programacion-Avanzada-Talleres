#include <iostream>
#include <stdlib.h>

using namespace std;

void momentum(double vec[],double);

double *momento;

int main()
{
    double vec[3], ii,a;
    cout<<"ingrese la masa del objeto: "<<endl;
    cin>>ii;
    cout<<"ingrese los tres valores de la velocidad (numero,unidad,direccion) : "<<endl;
    cin>>vec[0];
    cin>>vec[1];
    cin>>vec[2];
    momentum(vec,ii);
    cout<<"los valores de el momentum"<<endl;
    cout<<momento[0]<<endl;
    cout<<momento[1]<<endl;
    cout<<momento[2]<<endl;

    delete[] momento;

    return 0;
}
void momentum(double vec[],double ii)
{
    momento=new(nothrow) double[3];
    if(momento!=nullptr)
    {
        for(int i=0; i<3; i++)
        {
            momento[i]=ii*vec[i];
        }
    }
}
