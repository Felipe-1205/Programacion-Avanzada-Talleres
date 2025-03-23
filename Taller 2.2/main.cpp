#include <iostream>
#include <fstream>
#include <cstdlib>
#include <cstdio>
#include <stdio.h>
#include <stdlib.h>

using namespace std;

struct Cuestionario
{
    int numero;
    char descripcion[200];
    char respuesta1[200];
    char respuesta2[200];
    char respuesta3[200];
    char respuesta4[200];
};

int main()
{
    Cuestionario nuevo,buscar;
    int opcion,busqueda;
    ofstream Guardar;
    bool encontrado;
    ifstream Leer;
    char borrar;
    string nombreArchivo = "cuestionario.txt";

    cout<<"desea eliminar el archivo de preguntas anterior para hcer uno nuevo?(y/n)";
    cin>>borrar;
    if(borrar=='y')
    {
        remove("cuestionario.txt");
    }

    do
    {
        cout<<"%%%%%%%%%%%%%%%%%"<<endl;
        cout<<"1 GUARDAR NUEVA PREGUNTA"<<endl;
        cout<<"2 BUSCAR PREGUNTA"<<endl;
        cout<<"3 SALIR"<<endl;
        cout<<"%%%%%%%%%%%%%%%%%"<<endl;
        cout<<endl;
        cout<<"Elija una opcion:"<<endl;
        cin>>opcion;

        switch(opcion)
        {
        case 1:
            Guardar.open(nombreArchivo,ios::app);
            cout<<"Ingrese numero de la pregunta: ";
            cin>>nuevo.numero;
            cout<<"Ingrese descripcion de la pregunta: ";
            cin>>nuevo.descripcion;
            cout<<"Ingrese la respuesta numero 1: ";
            cin>>nuevo.respuesta1;
            cout<<"Ingrese la respuesta numero 2: ";
            cin>>nuevo.respuesta2;
            cout<<"Ingrese la respuesta numero 3: ";
            cin>>nuevo.respuesta3;
            cout<<"Ingrese la respuesta numero 4: ";
            cin>>nuevo.respuesta4;
            Guardar<<nuevo.numero<<endl;
            Guardar<<nuevo.descripcion<<endl;
            Guardar<<nuevo.respuesta1<<endl;
            Guardar<<nuevo.respuesta2<<endl;
            Guardar<<nuevo.respuesta3<<endl;
            Guardar<<nuevo.respuesta4<<endl;
            Guardar.close();
            break;
        case 2:
            Leer.open(nombreArchivo);
            Leer>>buscar.numero;
            Leer>>buscar.descripcion;
            Leer>>buscar.respuesta1;
            Leer>>buscar.respuesta2;
            Leer>>buscar.respuesta3;
            Leer>>buscar.respuesta4;
            encontrado=false;
            cout<<"Ingrese el numero de la pregunta que busca"<<endl;
            cin>>busqueda;
            while(!Leer.eof())
            {


                if(buscar.numero==busqueda)
                {
                    encontrado=true;
                    cout<<"----------------------------"<<endl;
                    cout<<buscar.numero<<endl;
                    cout<<buscar.descripcion<<endl;
                    cout<<buscar.respuesta1<<endl;
                    cout<<buscar.respuesta2<<endl;
                    cout<<buscar.respuesta3<<endl;
                    cout<<buscar.respuesta4<<endl;
                    cout<<"----------------------------"<<endl;
                    cout<<endl;
                }
                Leer>>buscar.numero;
                Leer>>buscar.descripcion;
                Leer>>buscar.respuesta1;
                Leer>>buscar.respuesta2;
                Leer>>buscar.respuesta3;
                Leer>>buscar.respuesta4;
            }
            if(encontrado==false)
            {
                cout<<"pregunta no encontrada"<<endl;
            }
            Leer.close();
            break;
        case 3:
            cout<<"Gracias"<<endl;
            break;
        }
    }
    while(opcion!=3);
    return 0;
}
