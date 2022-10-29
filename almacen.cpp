#include <iostream>
using namespace std;

int unidades;
int total;
int descuento;

int main(){
cout << "Escriba el numero de escritorios comprados: " <<endl;
cin >> unidades;
  
    total = unidades*800000;

        if( unidades < 5 )
        {
          descuento = ( total * 0.1 );
        }
        else if( unidades<10 )
        {
            descuento = ( total * 0.2 );
        }
        else
        {
           descuento = ( total * 0.4 );
        }
  
cout << "El total a pagar es: " << total - descuento << endl;
cout << "El descuento aplicado es: " << descuento << endl;
  
}


