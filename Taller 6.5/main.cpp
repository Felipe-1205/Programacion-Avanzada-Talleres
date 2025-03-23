#include <iostream>

using namespace std;

void recursiva(int numero[],int opcion,int num,int& respuesta,int& l)
{
    if(l<num)
    {
        if(l==0)
        {
            respuesta=numero[l];
        }
        else
        {
            if(opcion==1)
            {
                if(numero[l]>respuesta)
                {
                    respuesta=numero[l];
                }
            }
            else if(opcion==2)
            {
                if(numero[l]<respuesta)
                {
                    respuesta=numero[l];
                }
            }
            else
            {
                cout<<"No escogio un valor apropiado";
            }
        }
        l++;
        recursiva(numero,opcion,num,respuesta,l);
    }
    else
    {
        cout<<"la respuesta es: "<< respuesta;
    }
}
int main()
{
    int numero[30],num,opcion,respuesta,l=0;
    cout<<"ingrese la cantidad de numeros con lo que va a comenzar: ";
    cin>>num;
    for(int i=0; i<num; i++)
    {
        cout<<"ingrese el valor numero "<<i+1<<": ";
        cin>>numero[i];
    }
    cout<<"desea buscar mayor(1) o menor(2)?: ";
    cin>>opcion;
    recursiva(numero,opcion,num,respuesta,l);
    return 0;
}
