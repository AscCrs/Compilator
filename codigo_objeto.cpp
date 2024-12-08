#include <iostream>
using namespace std;
int main() {
	int n = 0; 
	int i = 1; 
	float calif = 0.0; 
	float promedio = 0.0; 
	int informe = 5; 
	int j = 0; 
	cout << "Ingresa la cantidad calificaciones a leer: " << endl; 
	cin >> n; 
while ((i <= n)) {
	cout << "Ingresa la calificación " << i << " : " << endl; 
	cin >> calif; 
	if ((calif > 60.0 &calif < 69.9)) { 
		calif = 70.0;
	cout << "Calificación redondeada a: " << calif << endl; 
	} 
	promedio = promedio + calif;
	if ((calif >= 70)) { 
		cout << "Calificación aprobatoria con: " << calif << endl; 
	} 
else  { 
	cout << "Calificación reprobatoria con: " << calif << endl; 
	} 
	i = i + 1;
}
	promedio = promedio / n;
while ((j < informe)) {
	cout << "Promedio de Calificaciones: " << promedio << endl; 
	j = j + 1;
}
	cout << "\nPresiona Enter para salir...";
	cin.ignore();
	cin.get();
	return 0;
}