#include <iostream>
#include <stdlib.h>
#include <ctime>

using namespace std;

int main()
{
    srand(time(NULL));
    int opcion, cajon[7],posicion,auxiliar;
    do
    {
        cout<<"Escoja una opcion"<<endl
            <<"(1) ingresar datos"<<endl
            <<"(2) generar aleatorio"<<endl
            <<"(3) orden ascendente"<<endl
            <<"(4) orden descendente"<<endl
            <<"(5) imprimir"<<endl
            <<"(6) salir"<<endl;
        cin>>opcion;

        switch(opcion)
        {
        case 1:
            for(int i=0; i<7; i++)
            {
                cout<<"que valor desea ingresar para el cajon "<<i<<": ";
                cin>>cajon[i];
            }
            break;
        case 2:
            cout<<"se van a ingresar valores aleatorios en el cajon";
            for(int i=0; i<7; i++)
            {
                cajon[i]=rand();
            }
            break;
        case 3:
            for (int i=0; i<7; i++)
            {
                for (int l=0; l<7; l++)
                {
                    if(cajon[i]<cajon[l])
                    {
                        auxiliar = cajon[i];
                        cajon[i] = cajon[l];
                        cajon[l] = auxiliar;
                    }
                }
            }
            break;
        case 4:
            for (int i=0; i<7; i++)
            {
                for (int l=0; l<7; l++)
                {
                    if(cajon[i]>cajon[l])
                    {
                        auxiliar = cajon[i];
                        cajon[i] = cajon[l];
                        cajon[l] = auxiliar;
                    }
                }
            }
            break;
        case 5:
            cout<<"los valores ingresados son"<<endl;
            for(int i=0; i<7; i++)
            {
                cout<<cajon[i]<<",";
            }
            cout<<endl;
            break;
        case 6:
            cout<<"gracias por usar el sistema"<<endl;
            break;
        default:
            cout<<"ingreso un valor incorrecto"<<endl;
        }
    }
    while(opcion!=6);
    return 0;
}
