#include <iostream>
#include <string.h>
#include <stdlib.h>

using namespace std;

void letras_rep(char *);
void numero(char *);

char *letras;
int *nume_let;

int main()
{
    char palabra[50];

    cout<<"ingrese la palabra que desa verificar(no ingrese mas de 50 caracteres)"<<endl;
    cin.getline(palabra,50,'\n');
    strupr(palabra);
    letras_rep(palabra);
    numero(palabra);

    return 0;
}
void letras_rep(char *palabra)
{
    letras =new char[26];
    for(int i=0; i<26; i++)
    {
        letras[i]=' ';
    }
    while(*palabra)
    {
        bool validar=false;
        for(int i=0; i<26; i++)
        {
            if(*palabra==letras[i])
            {
                validar=true;
            }
        }
        if(validar==false)
        {
            for(int i=0; i<26; i++)
            {
                if(letras[i]==' ')
                {
                    letras[i]=*palabra;
                    i=26;
                }
            }
        }
        palabra++;
    }
}
void numero(char *palabra)
{
    nume_let =new int[26];
    for(int i=0; i<26; i++)
    {
        nume_let[i]=0;
    }

    while(*palabra)
    {
        for(int i=0; i<26; i++)
        {
            if(letras[i]!=' ')
            {
                if(*palabra==letras[i])
                {
                    nume_let[i]++;
                }
            }
        }
        palabra++;
    }
    for(int i=0; i<26; i++)
    {
        if(letras[i]!=' ')
        {
            cout<<letras[i]<<" ";
        }
        if(nume_let[i]!=0)
        {
            cout<<nume_let[i]<<endl;
        }
    }
}
