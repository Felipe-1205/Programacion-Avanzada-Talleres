#include <iostream>

using namespace std;

void reclusivo(int disco,int inicio,int fin,int aux)
{
    if(disco==1)
    {
        cout<<"Disco: "<<disco<<endl<<"de la varilla "<<inicio<<" a la varilla "<<fin<<endl;
    }
    else
    {
        reclusivo(disco-1,inicio,aux,fin);
        cout<<"Disco: "<<disco<<endl<<"de la varilla "<<inicio<<" a la varilla "<<fin<<endl;
        reclusivo(disco-1,aux,fin,inicio);
    }
}

int main()
{
    int disco=8,inicio=1,aux=2,fin=3;
    reclusivo(disco,inicio,fin,aux);
    return 0;
}
