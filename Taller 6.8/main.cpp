#include<iostream>

using namespace std;
void recursivo(int tablero[][8], int& x,int& y)
{
    tablero[x][y]=1;
    if(x+1<8 && y+2<8 && tablero[x+1][y+2]==0)
    {
        x+=1,y+=2;
    }
    else if(x+2<8 && y+1<8 && tablero[x+2][y+1]==0)
    {
        x+=2,y+=1;
    }
    else if(x+2<8 && y-1>=0 && tablero[x+2][y-1]==0)
    {
        x+=2,y-=1;
    }
    else if(x+1<8 && y-2>=0 && tablero[x+1][y-2]==0)
    {
        x+=1,y-=2;
    }
    else if(x-1>=0 && y-2>=0 && tablero[x-1][y-2]==0)
    {
        x-=1,y-=2;
    }
    else if(x-2>=0 && y-1>=0 && tablero[x-2][y-1]==0)
    {
        x-=2,y-=1;
    }
    else if(x-2>=0 && y+1<8 && tablero[x-2][y+1]==0)
    {
        x-=2,y+=1;
    }
    else if(x-1>=0 && y+2<8 && tablero[x-1][y+2]==0)
    {
        x-=1,y+=2;
    }
    else
    {
        return;
    }
    tablero[x][y]=7;
    cout<<"----------------"<<endl;
    for(int i=0;i<8;i++)
    {
        for(int l=0;l<8;l++)
        {
            cout<<tablero[l][i]<<" ";
        }
        cout<<endl;
    }
    cout<<"----------------"<<endl;
    recursivo(tablero,x,y);
}

int main()
{
    int tablero[8][8],x,y;
    cout<<"ingrese lo valores inciales delcaballo (numero entre 1 y 8)" << endl;
    cout<<"ingrese x: ";
    cin>>x;
    cout<<"ingrese y: ";
    cin>>y;
    x--,y--;
    for(int i=0;i<8;i++)
    {
        for(int l=0;l<8;l++)
        {
            tablero[l][i]=0;
        }
    }
    tablero[x][y]=7;
    cout<<"----------------"<<endl;
    for(int i=0;i<8;i++)
    {
        for(int l=0;l<8;l++)
        {
            cout<<tablero[l][i]<<" ";
        }
        cout<<endl;
    }
    cout<<"----------------"<<endl;
    recursivo(tablero,x,y);
    return 0;
}
