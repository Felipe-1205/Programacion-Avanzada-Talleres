#include <iostream>

using namespace std;

int main()
{
    int opcion,vect[15],multiplo,inicio,*ptr[15],*aux,num1,num2;
    do
    {
        cout<<"==================================================================="<<endl;
        cout<<"\t\tMENU DE PUNTEROS Y ARRAYS"<<endl;
        cout<<"-------------------------------------------------------------------"<<endl;
        cout<<" 1. Crear tabla de multiplicar en un Vector"<<endl;
        cout<<" 2. Almacenar en Array las direcciones de memoria"<<endl;
        cout<<" 3. Mostrar valores y direcciones de memoria del Array"<<endl;
        cout<<" 4. Intercambiar direcciones de memoria entre elementos"<<endl;
        cout<<" 5. Ordenar direcciones de manera ascendente en el Array"<<endl;
        cout<<" 6. Ordenar direcciones de manera descendente en el Array"<<endl;
        cout<<" 7. salir"<<endl;

        cout<<"\n Ingrese opcion: ";
        cin>>opcion;
        cout<<"==================================================================="<<endl;
        switch(opcion)
        {
        case 1:
            cout<<"ingrese el rango inicial de la tabla de multiplicar: ";
            cin>>inicio;
            cout<<"Ingrese el número al que se le va a generar la tabla de multiplicar: ";
            cin>>multiplo;

            for(int i=0; i<15; i++)
            {
                vect[i]=((inicio+i)*multiplo);
            }

            break;
        case 2:

            for(int i=0; i<15; i++)
            {
                ptr[i]=&vect[i];
            }

            cout<<"Direccion del vector guardada en un puntero"<<endl;

            break;

        case 3:
            cout<<"Operacion\tResultado\tPosicion en memoria"<<endl;
            for(int i=0; i<15; i++)
            {
                cout<<(*ptr[i]/multiplo)<<"x"<<multiplo<<"              "<<*ptr[i]<<"              "<<ptr[i]<<endl;
            }
            break;



        case 4:
            cout<<"ingrese el primer valor a intercambiar (el valor debe ser entre el 0 y el 14): ";
            cin>>num1;
            cout<<"Ingrese el segundo valor a intercambiar (el valor debe ser entre el 0 y el 14): ";
            cin>>num2;

            aux=ptr[num1];
            ptr[num1]=ptr[num2];
            ptr[num2]=aux;

            cout<<"Operacion\tResultado\tPosicion en memoria"<<endl;
            for(int i=0; i<15; i++)
            {
                cout<<(*ptr[i]/multiplo)<<"x"<<multiplo<<"              "<<*ptr[i]<<"              "<<ptr[i]<<endl;
            }

            break;

        case 5:
            for(int i=0; i<15; i++)
            {
                for(int j=i+1; j<15; j++)
                {
                    if(*ptr[i]<*ptr[j])
                    {
                        aux=ptr[i];
                        ptr[i]=ptr[j];
                        ptr[j]=aux;
                    }
                }
            }
            cout<<"Operacion\tResultado\tPosicion en memoria"<<endl;
            for(int i=0; i<15; i++)
            {
                cout<<(*ptr[i]/multiplo)<<"x"<<multiplo<<"              "<<*ptr[i]<<"              "<<ptr[i]<<endl;
            }
            break;

        case 6:

            for(int i=0; i<15; i++)
            {
                for(int j=i+1; j<15; j++)
                {
                    if(*ptr[i]>*ptr[j])
                    {
                        aux=ptr[i];
                        ptr[i]=ptr[j];
                        ptr[j]=aux;
                    }
                }
            }
            cout<<"Operacion\tResultado\tPosicion en memoria"<<endl;
            for(int i=0; i<15; i++)
            {
                cout<<(*ptr[i]/multiplo)<<"x"<<multiplo<<"              "<<*ptr[i]<<"              "<<ptr[i]<<endl;
            }

            break;

        case 7  :
            cout<<"gracias por hacer uso de este programa"<<endl;
            cout<<"==================================================================="<<endl;
            break;
        }
        system("pause");
    }
    while(opcion!=7);
    return 0;
}
