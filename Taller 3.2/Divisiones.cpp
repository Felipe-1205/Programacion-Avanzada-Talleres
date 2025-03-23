#include <iostream>

using namespace std;

void divisionSucesivaDe(int *dividendo, int *divisor);

int main()
{
    int dividendo, divisor ;

    cout << "Ingrese el dividendo: ";
    cin>>dividendo;
    cout << "Ingrese el divisor: ";
    cin>>divisor;
    divisionSucesivaDe(&dividendo,&divisor);

    return 0;
}

void divisionSucesivaDe(int* dividendo, int* divisor)
{
    int cociente=0,*cociente2;
    cociente2=&cociente;
    while(*dividendo >= *divisor)
    {
        *dividendo = *dividendo-*divisor;
        cociente++;
    }
    cout<<"El resto es: "<<*dividendo<<endl;
    cout<<"El cociente es: "<<*cociente2<<endl;
}
