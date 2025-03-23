#include <iostream>

using namespace std;

int main()
{
    int arreglo[3][3],arreglo2 [3][3];

    for(int i=0; i<3; i++)
    {
        for(int l=0; l<3; l++)
        {
            cout<<"ingrese un valor: ";
            cin>>arreglo[i][l];
        }
    }
    for(int i=0; i<3; i++)
    {
        for(int l=0; l<3; l++)
        {
            cout<<arreglo[i][l]<<" ";
        }
        cout<<endl;
    }
    cout<<"----------------------";
    for(int i=0; i<3; i++)
    {
        for(int l=0; l<3; l++)
        {
            cout<<arreglo[l][i]<<" ";
        }
        cout<<endl;
    }
}
