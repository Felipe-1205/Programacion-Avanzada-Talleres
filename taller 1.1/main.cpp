#include <iostream>
#include <stdlib.h>
#include <ctime>

using namespace std;

int main()
{
    srand(time(NULL));//ayuda a que siempre el numero sea aleatorio
    /**1**/
    int suma=0, arreglo[5][5]= {{1,2,3,4,5},{6,7,8,9,10}, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};

    for(int i=0; i<5; i++)
    {
        for(int l=0; l<5; l++)
        {
            suma=suma+arreglo[i][l];
        }
    }
    cout<<suma<<endl;

    /**2**/
    int posicion, cajon[10];
    for(int i=0; i<10; i++)
    {
        cout<<"en que cajon desedea guardar el valor: ";
        cin>>posicion;
        cout<< "cual valor desea ingresar: ";
        cin>>cajon[posicion];
    }
    for(int i=0; i<10; i++)
    {
        cout<<cajon[i]<<",";
    }
    /**3**/
    int posicion2, cajon2[100];
    for(int i=0; i<100; i++)
    {
        cajon2[i]=rand()%101;//generar numero aleatorio
    }
    cout<<endl;
    for(int i=0; i<10; i++)
    {
        cout<<"que cajon desea consultar: ";
        cin>>posicion2;
        cout<<"el valor es: "<<cajon2[posicion2]<<endl;
    }

}
