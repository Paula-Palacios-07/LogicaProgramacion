#include<iostream>
using namespace std;

int main() {
	int creditos;
	float descuento;
	int nivel;
	float promedio;
	float total;
	cout << "Ingrese su nivel" << endl;
	cout << "1 = Pregado" << endl;
	cout << "2 = Posgrado" << endl;
	cin >> nivel;
	if (nivel==1 || nivel==2) {
		cout << "Ingresa tu promedio" << endl;
		cin >> promedio;
		if (nivel==1) {
			if (promedio>=4.5) {
				total = 28*50000;
				descuento = total*0.25;
				creditos = 28;
			}
			if (promedio>=4.0 && promedio<4.5) {
				total = 25*50000;
				descuento = total*0.10;
				creditos = 25;
			}
			if (promedio>=3.5 && promedio<4.0) {
				total = 20*50000;
				descuento = 0;
				creditos = 20;
			}
			if (promedio>=2.5 && promedio<3.5) {
				total = 15*50000;
				descuento = 0;
				creditos = 15;
			}
			if (promedio<2.5) {
				cout << "Lo siento, no puedes matricularte" << endl;
			}
		} else {
			if (promedio>=4.5) {
				total = 20*300000;
				descuento = total*0.20;
				creditos = 20;
			} else {
				total = 10*300000;
				descuento = 0;
				creditos = 10;
			}
		}
		cout << "El total a pagar por " << creditos << " creditos es: $" << total-descuento << endl;
		cout << "El descuento aplicado es: $" << descuento << endl;
	} else {
		cout << "Ingresa un nivel valido! " << endl;
	}
	return 0;
}