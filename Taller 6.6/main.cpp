#include <iostream>
#include <math.h>
using namespace std;
void recursividad(long int& numero, int binario[], int& i)
{
    if(i!=-1)
    {
        if(pow(2,i)<=numero)
        {
            binario[i]=1;
            numero=numero-pow(2,i);
        }
        else
        {
            binario[i]=0;
        }
        i--;
        recursividad(numero,binario,i);
    }
}

int main()
{
    int binario[32],i=31,bits;
    long int numero;
    cout << "Ingrese el valor del numero que desa convertir a binario" << endl;
    cin>>numero;
    for(int l=31;l>=0;l--)
    {
        if(pow(2,l)<=numero)
        {
            bits=l;
            break;
        }
    }

    recursividad(numero,binario,i);
    cout<<"el numero binario es"<<endl;
    for(int l=bits; l>=0; l--)
    {
        cout<<binario[l]<<" ";
    }
    return 0;
}
