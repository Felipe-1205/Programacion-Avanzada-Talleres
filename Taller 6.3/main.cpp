#include <iostream>
#include <string.h>

using namespace std;

void recursiva(char palabra[],int& i)
{
    if(palabra[i]!='\0')
    {
        cout<<palabra<<endl;
        palabra[i]='_';
        i++;
        recursiva(palabra,i);
    }
}
;int main()
{
    int i=0 ;
    char palabra[50];
    cout<<"ingrese una palabra"<<endl;
    cin.getline(palabra,50,'\n');
    cout<<endl<<endl;
    recursiva(palabra,i);
    return 0;
}
