#include <iostream>
#include <math.h>

using namespace std;
void recursiv(long double& semillas, int& i)
{
    if(i<64)
    {
        semillas=semillas+pow(2,i);
        i++;
        recursiv(semillas,i);
    }
}
int main()
{
    long double semillas=0;
    int i=0;
    recursiv(semillas,i);
    cout<<semillas;
    return 0;
}
