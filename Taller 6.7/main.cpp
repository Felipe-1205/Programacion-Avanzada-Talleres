#include <iostream>

using namespace std;

int main()
{
    char var[2]= {'a','b'};

    for(int i=0; i<2; i++)
    {
        cout<<var[i]<<" ";
    }
    for(int i=0; i<2; i++)
    {
        for(int l=0; l<2; l++)
        {
            cout<<var[l]<<var[i]<<" ";
        }
    }
    return 0;
}
