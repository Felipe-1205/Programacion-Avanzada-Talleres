#include <iostream>
#include <stdlib.h>
#include<time.h>

using namespace std;
void momentum(double);
void vectorAleatorio ();

double *momento,*velocidad;

int main()
{
    double ii,promedio[3],*ptr[3];
    srand(time(NULL));
    for(int i=0; i<15; i++)
    {
        ptr[i]=&promedio[i];
    }
    for(int i=0; i<1000; i++)
    {
        vectorAleatorio();
        ii=1+rand()%(11-1);
        momentum(ii);
        if(i==0)
        {
            for(int l=0; l<3; l++)
            {
                *ptr[l]=momento[l];
            }
        }
        else
        {
            for(int l=0; l<3; l++)
            {
                *ptr[l]=momento[l]+*ptr[l];
            }
        }
        delete[] momento;
        delete[] velocidad;
    }
    for(int i=0; i<3; i++)
    {
        *ptr[i]=*ptr[i]/1000;
    }
    cout<<"el promedio de los 1000 momentum es"<<endl;
    for(int i=0; i<3; i++)
    {
        cout<<*ptr[i]<<endl;
    }
    return 0;
}
void momentum(double ii)
{
    momento=new(nothrow) double[3];
    if(momento!=nullptr)
    {
        for(int i=0; i<3; i++)
        {
            momento[i]=ii*velocidad[i];
        }
    }
}
void vectorAleatorio ()
{
    velocidad=new(nothrow) double[3];
    if(velocidad!=nullptr)
    {
        for(int i=0; i<3; i++)
        {
            velocidad[i]= -100+rand()%(101+100);
        }
    }
}
