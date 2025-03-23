#include <iostream>
#include <stdlib.h>
#include <cstdio>
#include <ctime>
#include <fstream>

using namespace std;

int main()
{
    remove("pasos.txt");
    int camino[200],numero,pasos,direccion[4]={0,0,0,0};
    ofstream Guardar;
    srand(time(NULL));

    cout<<"cuantos pasos desea que recorra el robot: ";
    cin>>pasos;

    for(int i=0; pasos>i; i++)
    {
        numero=rand()%4;
        direccion[numero]++;
        camino[i]=numero;
    }

    Guardar.open("pasos.txt",ios::app);
    cout<<"Se van a almacenar los datos en un archivo llamado pasos.txt"<<endl;
    for(int i=0; pasos>i; i++)
    {
        switch(camino[i])
        {
        case 0:
            Guardar<<"Izquierda"<<endl;
            break;
        case 1:
            Guardar<<"Derecha"<<endl;
            break;
        case 2:
            Guardar<<"Arriba"<<endl;
            break;
        case 3:
            Guardar<<"Abajo"<<endl;
            break;
        }
    }
    Guardar.close();

    if(direccion[0]<direccion[1])
    {
        direccion[1]=direccion[1]-direccion[0];
        direccion[0]=0;
    }
    else if(direccion[0]>direccion[1])
    {
        direccion[0]=direccion[0]-direccion[1];
        direccion[1]=0;
    }
    else
    {
        direccion[0]=0;
        direccion[1]=0;
    }
    if(direccion[2]<direccion[3])
    {
        direccion[3]=direccion[3]-direccion[2];
        direccion[2]=0;
    }
    else if(direccion[2]>direccion[3])
    {
        direccion[2]=direccion[2]-direccion[3];
        direccion[3]=0;
    }
    else
    {
        direccion[2]=0;
        direccion[3]=0;
    }

    cout<<"en total el robot se desplazo: "<<endl;
    if(direccion[0]!=0)
    {
        cout<<"a la izquierda "<<direccion[0]<<" pasos"<<endl;
    }
    if(direccion[1]!=0)
    {
        cout<<"a la derecha "<<direccion[1]<<" pasos"<<endl;
    }
    if(direccion[2]!=0)
    {
        cout<<"hacia arriba "<<direccion[2]<<" pasos"<<endl;
    }
    if(direccion[3]!=0)
    {
        cout<<"hacia abajo "<<direccion[3]<<" pasos"<<endl;
    }
    if(direccion[0]==0&&direccion[1]==0)
    {
        cout<<"el robot termino en el mismo lugar horizontalmente"<<endl;
    }
    if(direccion[2]==0&&direccion[3]==0)
    {
        cout<<"el robot termino en el mismo lugar verticalmente"<<endl;
    }

    return 0;
}
