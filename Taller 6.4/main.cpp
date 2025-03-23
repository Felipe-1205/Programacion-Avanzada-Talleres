#include <iostream>

using namespace std;

void recursiva(int triangulo[],int& num)
{
    if(num!=0)
    {
        for(int i=0;i<num;i++)
        {
            cout<<triangulo[i]<<" ";
        }
        for(int i=1;i<num;i++)
        {
            triangulo[i-1]=triangulo[i-1]+triangulo[i];
        }
        cout<<endl;
        num--;
        recursiva(triangulo,num);
    }
}

int main()
{
    int triangulo[30],num;
    cout<<"ingrese la cantidad de numeros con lo que va a comenzar: ";
    cin>>num;
    for(int i=0;i<num;i++)
    {
        cout<<"ingrese el valor numero "<<i+1<<": ";
        cin>>triangulo[i];
    }

    recursiva(triangulo,num);

    return 0;
}
