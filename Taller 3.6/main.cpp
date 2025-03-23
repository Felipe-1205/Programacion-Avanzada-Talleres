#include <iostream>

using namespace std;

int main()
{
    int opcion,num1,num2,respuesta,*pt_num1,*pt_num2,*pt_respuestas;
    pt_num1=&num1;
    pt_num2=&num2;
    pt_respuestas=&respuesta;
    do
    {
        cout<<"==================================================================="<<endl;
        cout<<"\t\t\t MINI CALCULADORA         "<<endl;
        cout<<"-------------------------------------------------------------------"<<endl;
        cout<<" 1. Suma             "<<endl;
        cout<<" 2. Resta              "<<endl;
        cout<<" 3. Multiplicacion             "<<endl;
        cout<<" 4. Division             "<<endl;
        cout<<" 5. salir              "<<endl;

        cout<<"\n Ingrese opcion: ";
        cin>>opcion;
        cout<<"==================================================================="<<endl;
        if(opcion!=5)
        {
            cout<<"ingrese el primer digito: ";
            cin>>num1;
            cout<<"ingrese el segundo digito: ";
            cin>>num2;
            cout<<"==================================================================="<<endl;
        }
        switch(opcion)
        {
        case 1:
            respuesta=*pt_num1;
            for(int i=0; i<*pt_num2; i++)
            {
                respuesta++;
            }

            cout<<"la suma de los digitos "<<*pt_num1<<" y "<<*pt_num2<<" es: "<<*pt_respuestas<<endl;
            break;

        case 2:
            respuesta=*pt_num1;
            for(int i=0; i<*pt_num2; i++)
            {
                respuesta--;
            }
            cout<<"la resta de los digitos "<<*pt_num1<<" y "<<*pt_num2<<" es: "<<*pt_respuestas<<endl;
            break;

        case 3:
            respuesta=0;
            for(int i=0; i<*pt_num2; i++)
            {
                respuesta=*pt_respuestas+*pt_num1;
            }
            cout<<"la multiplicacion de los digitos "<<*pt_num1<<" y "<<*pt_num2<<" es: "<<*pt_respuestas<<endl;
            break;

        case 4:
        {
            int sobras=*pt_num1,*sobras2;
            sobras2=&sobras;
            respuesta=0;
            while(*sobras2 >= *pt_num2)
            {
                *sobras2 = *sobras2-*pt_num2;
                respuesta++;
            }
            cout<<"la division de los digitos "<<*pt_num1<<" y "<<*pt_num2<<" es: "<<*pt_respuestas<<" y de residuo quedo: "<<*sobras2<<endl;
        }
        break;

        case 5:
            cout<<"gracias por hacer uso de este programa"<<endl;
            cout<<"==================================================================="<<endl;
            break;

        }
        system("pause");
    }
    while(opcion!=5);
    return 0;
}
