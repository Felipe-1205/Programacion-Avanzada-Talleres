#include <iostream>
#include <locale.h>

using namespace std;

int main()
{
    setlocale(LC_CTYPE, "Spanish");
    int varint=5, *puntint;
    float varfloat=5.123456, *puntfloat;
    bool varbool=true, *puntbool;
    char varchar='1', *puntchar;
    double vardouble=9.12345678, *puntdouble;

    puntint=&varint;
    puntbool=&varbool;
    puntchar=&varchar;
    puntfloat=&varfloat;
    puntdouble=&vardouble;

    cout<<"\n\t\t\t\t\t Datos de variables\n"<<endl;
    cout<<"la variable =varint= de tipo =int= con valor ="<<varint<<"= que esta almacenada en ="<<&varint<<"= con un tamaño de ="<<sizeof(varint)<<endl;
    cout<<"la variable =varfloat= de tipo =float= con valor ="<<varfloat<<"= que esta almacenada en ="<<&varfloat<<"= con un tamaño de ="<<sizeof(varfloat)<<endl;
    cout<<"la variable =varbool= de tipo =bool= con valor ="<<varbool<<"= que esta almacenada en ="<<&varbool<<"= con un tamaño de ="<<sizeof(varbool)<<endl;
    cout<<"la variable =varchar= de tipo =char= con valor ="<<varchar<<"= que esta almacenada en ="<<&varchar<<"= con un tamaño de ="<<sizeof(varchar)<<endl;
    cout<<"la variable =vardouble= de tipo =double= con valor ="<<vardouble<<"= que esta almacenada en ="<<&vardouble<<"= con un tamaño de ="<<sizeof(vardouble)<<endl;

    cout<<"\n\t\t\t\t\t Datos de punteros\n"<<endl;
    cout<<"El puntero =puntint= de la variable =varint= con valor ="<<puntint<<"= que esta almacenada en ="<<&puntint<<"= con un tamaño de ="<<sizeof(varint)<<endl;
    cout<<"El puntero =puntfloat= de la variable =varfloat= con valor ="<<puntfloat<<"= que esta almacenada en ="<<&puntfloat<<"= con un tamaño de ="<<sizeof(puntfloat)<<endl;
    cout<<"El puntero =puntbool= de la variable =varbool= con valor ="<<puntbool<<"= que esta almacenada en ="<<&puntbool<<"= con un tamaño de ="<<sizeof(puntbool)<<endl;
    cout<<"El puntero =puntchar= de la variable =varchar= con valor ="<<(void *)puntchar<<"= que esta almacenada en ="<<&puntchar<<"= con un tamaño de ="<<sizeof(puntchar)<<endl;
    cout<<"El puntero =puntdouble= de la variable =vardouble= con valor ="<<puntdouble<<"= que esta almacenada en ="<<&puntdouble<<"= con un tamaño de ="<<sizeof(puntdouble)<<endl;


    return 0;
}
