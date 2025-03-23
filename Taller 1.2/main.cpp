#include <iostream>
#include<cstdlib> //libreria para poder pausar

using namespace std;

int main()
{
    int opcion, cajon[10],posicion;
    do
    {
        cout<<"Escoja una opcion"<<endl
            <<"(1) insertar"<<endl
            <<"(2) borrar"<<endl
            <<"(3) imprimir"<<endl
            <<"(4) insertar todo"<<endl
            <<"(5) borrar todo"<<endl
            <<"(6) imprimir todo"<<endl
            <<"(7) salir"<<endl;
        cin>>opcion;

        switch(opcion)
        {
        case 1:
            cout<<"en que cajon desedea guardar el valor: ";
            cin>>posicion;
            cout<<"cual valor desea ingresar: ";
            cin>>cajon[posicion];
            system("pause");//funcion de pausar
            break;
        case 2:
            cout<<"que cajon desea borrar: ";
            cin>>posicion;
            cajon[posicion]=0;
            system("pause");
            break;
        case 3:
            cout<<"que cajon desa consultar: ";
            cin>>posicion;
            cout<<cajon[posicion]<<endl;
            system("pause");
            break;
        case 4:
            for(int i=0; i<10; i++)
            {
                cout<<"que valor desea ingresar para el cajon "<<i<<": ";
                cin>>cajon[i];
            }
            system("pause");
            break;
        case 5:
            cout<<"se van a borrar todos los valores"<<endl;
            for(int i=0; i<10; i++)
            {
                cajon[i]=0;
            }
            system("pause");
            break;
        case 6:
            cout<<"los valores ingresados son"<<endl;
            for(int i=0; i<10; i++)
            {
                cout<<cajon[i]<<",";
            }
            cout<<endl;
            system("pause");
            break;
        case 7:
            cout<<"gracias por usar el sistema"<<endl;
            system("pause");
            break;
        default:
            cout<<"ingreso un valor incorrecto"<<endl;
            system("pause");
        }
    }
    while(opcion!=7);
    return 0;
}
