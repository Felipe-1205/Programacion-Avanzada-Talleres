#include <iostream>
#include <stdlib.h>
#include <ctime>

using namespace std;

int main()
{
    srand(time(NULL));
    int numero,columna, fila, sudoku[4][4],opcion,solucion, mal,copia[4][4];
    bool validacion, reinicio;

    do
    {
        cout<<"Escoja una opcion"<<endl
            <<"(1) Generar sudoku"<<endl
            <<"(2) solucion"<<endl
            <<"(3) salir"<<endl;
        cin>>opcion;

        switch(opcion)
        {
        case 1:
            for(int i=0; i<4; i++)
            {
                for(int l=0; l<4; l++)
                {
                    sudoku[i][l]=0;
                }
            }

            for(int i=0; i<4; i++)
            {
                do
                {
                    validacion=true;
                    numero=rand() % 4 + 1;
                    for(int l=0; l<4; l++)
                    {
                        for(int j=0; j<4; j++)
                        {
                            if(numero==sudoku[l][j])
                            {
                                validacion=false;
                            }
                        }
                    }
                }
                while(validacion==false);

                do
                {
                    validacion=true;
                    fila=rand() %4;
                    columna=rand() %4;
                    for(int l=0; l<4; l++)
                    {
                        if(sudoku[l][fila]!=0)
                        {
                            validacion=false;
                        }
                    }
                    for(int l=0; l<4; l++)
                    {
                        if(sudoku[columna][l]!=0)
                        {
                            validacion=false;
                        }
                    }
                }
                while(validacion==false);


                sudoku[columna][fila]=numero;
            }

            for(int i=0; i<4; i++)
            {
                for(int l=0; l<4; l++)
                {
                    cout<<sudoku[i][l]<<" ";
                }
                cout<<endl;
            }
            break;
        case 2:
            for(int i=0; i<4; i++)
            {
                for(int l=0; l<4; l++)
                {
                    copia[i][l]=sudoku[i][l];
                }
            }

            do
            {
                for(int i=0; i<4; i++)
                {
                    for(int l=0; l<4; l++)
                    {
                        sudoku[i][l]=copia[i][l];
                    }
                }
                reinicio=false;
                for(int i=0; i<4; i++)
                {
                    for(int l=0; l<4; l++)
                    {
                        if(sudoku[i][l]==0)
                        {
                            mal=0;
                            do
                            {
                                solucion=rand() % 4 + 1;
                                validacion=true;
                                for(int j=0; j<4; j++)
                                {
                                    if(sudoku[i][j]==solucion)
                                    {
                                        validacion=false;
                                    }
                                }
                                for(int j=0; j<4; j++)
                                {
                                    if(sudoku[j][l]==solucion)
                                    {
                                        validacion=false;
                                    }
                                }
                                if(i==0 || i==1)
                                {
                                    if(l==0 || l==1)
                                    {
                                        for(int j=0; j<1; j++)
                                        {
                                            for(int k=0; k<1; k++)
                                            {
                                                if(sudoku[j][k]==solucion)
                                                {
                                                    validacion=false;
                                                }
                                            }
                                        }
                                    }
                                    else
                                    {
                                        for(int j=0; j<2; j++)
                                        {
                                            for(int k=2; k<4; k++)
                                            {
                                                if(sudoku[j][k]==solucion)
                                                {
                                                    validacion=false;
                                                }
                                            }
                                        }
                                    }
                                }
                                else
                                {
                                    if(l==0 || l==1)
                                    {
                                        for(int j=2; j<4; j++)
                                        {
                                            for(int k=0; k<1; k++)
                                            {
                                                if(sudoku[j][k]==solucion)
                                                {
                                                    validacion=false;
                                                }
                                            }
                                        }
                                    }
                                    else
                                    {
                                        for(int j=2; j<4; j++)
                                        {
                                            for(int k=2; k<4; k++)
                                            {
                                                if(sudoku[j][k]==solucion)
                                                {
                                                    validacion=false;
                                                }
                                            }
                                        }
                                    }
                                }
                                if(validacion==false)
                                {
                                    mal++;
                                }
                                if(mal==20)
                                {
                                    validacion=true;
                                    reinicio=true;
                                    break;
                                }
                            }
                            while(validacion==false);

                            sudoku[i][l]=solucion;


                        }
                    }
                }
            }
            while(reinicio==true);

            for(int i=0; i<4; i++)
            {
                for(int l=0; l<4; l++)
                {
                    cout<<sudoku[i][l]<<" ";
                }
                cout<<endl;
            }
            break;
        case 3:
            cout<<"gracias por usar el sistema"<<endl;
            break;
        default:
            cout<<"ingreso un valor incorrecto"<<endl;
        }
    }
    while(opcion!=3);
    return 0;
}
