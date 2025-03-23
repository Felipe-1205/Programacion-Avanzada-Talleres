#include <iostream>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_CTYPE, "Spanish");
    int opcion, num1,num2,*pt_num1,*pt_num2;
    double dou1,dou2,*pt_dou1,*pt_dou2;
    float flo1,flo2,*pt_flo1,*pt_flo2;
    do
    {
        cout<<"==================================================================="<<endl;
        cout<<"\t\t\t MENU DE INTERCAMBIO "<<endl;
        cout<<"-------------------------------------------------------------------"<<endl;
        cout<<" 1. Int             "<<endl;
        cout<<" 2. Double              "<<endl;
        cout<<" 3. Float             "<<endl;
        cout<<" 4. salir              "<<endl;

        cout<<"\n Ingrese opcion: ";
        cin>>opcion;
        cout<<"==================================================================="<<endl;
        switch(opcion)
        {
        case 1:
            cout<<"Ingrese el valor del primer número entero: ";
            cin>>num1;
            cout<<"Ingrese el valor del segundo número entero: ";
            cin>>num2;
            pt_num1=&num1;
            pt_num2=&num2;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_num1<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_num1<<endl;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_num2<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_num2<<endl;
            system("pause");
            pt_num1=&num2;
            pt_num2=&num1;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_num1<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_num1<<endl;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_num2<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_num2<<endl;
            break;

        case 2:
            cout<<"Ingrese el valor del primer número doble:  ";
            cin>>dou1;
            cout<<"Ingrese el valor del segundo número doble:  ";
            cin>>dou2;
            pt_dou1=&dou1;
            pt_dou2=&dou2;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_dou1<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_dou1<<endl;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_dou2<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_dou2<<endl;
            system("pause");
            pt_dou1=&dou2;
            pt_dou2=&dou1;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_dou1<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_dou1<<endl;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_dou2<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_dou2<<endl;
            break;

        case 3:
            cout<<"Ingrese el valor del primer número doble:  ";
            cin>>flo1;
            cout<<"Ingrese el valor del segundo número doble:  ";
            cin>>flo2;
            pt_flo1=&flo1;
            pt_flo2=&flo2;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_flo1<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_flo1<<endl;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_flo2<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_flo2<<endl;
            system("pause");
            pt_flo1=&flo2;
            pt_flo2=&flo1;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_flo1<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_flo1<<endl;
            cout<<"El valor a donde apunta el primer puntero es: "<<*pt_flo2<<endl;
            cout<<"La dirección a donde apunta el primer puntero es: "<<pt_flo2<<endl;
            break;

        case 4:
            cout<<"gracias por hacer uso de este programa"<<endl;
            cout<<"==================================================================="<<endl;
            break;

        }
        system("pause");
    }
    while(opcion!=4);
    return 0;
}
