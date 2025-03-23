#include <iostream>
#include <stdlib.h>
#include <ctime>

using namespace std;

int main()
{
    srand(time(NULL));
    int arreglo[10][10],MAX,MIN;
    for(int i=0; i<10; i++)
    {
        for(int l=0; l<10; l++)
        {
            arreglo[i][l]=1+rand()%(1001-1);
            if(i==0&&l==0)
            {
                MAX=arreglo[i][l];
                MIN=arreglo[i][l];
            }
            else if( arreglo[i][l]<MIN)
            {
                MIN=arreglo[i][l];
            }
            else if( arreglo[i][l]>MAX)
            {
                MAX=arreglo[i][l];
            }
        }
    }
    cout<<"el numero maximo es: "<<MAX<<endl<<"el numero minimo es: "<<MIN;
}
