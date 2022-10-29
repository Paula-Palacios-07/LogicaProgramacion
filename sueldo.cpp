#include <iostream>
using namespace std;

string nombre;
float saldo;
int horas; 

int main(){
  cout << "Ingrese su nombre completo: " <<endl;
  cin >> nombre;
  cout << "Ingrese salario basico por hora: " <<endl;
  cin >>saldo;
  cout << "Ingrese las horas trabajadas en el mes: " <<endl;
  cin >>horas;
  
saldo = saldo * horas;
  
  if(saldo >= 450000){
     cout << "Su nombre es: " << nombre << endl;
     cout << "Su sueldo es: " << saldo << endl;
    
    }
  else{
    cout << "Su nombre es: " << nombre << endl;
  }
}