Algoritmo almacen
	
	Escribir "Escribe el numero de escritorios comprados"
	leer unidades
	total = unidades * 800000
	si unidades < 5 Entonces
		descuento = total * 0.1
	SiNo
		si unidades < 10 Entonces
			descuento = total * 0.2
		SiNo
			descuento = total * 0.4
		FinSi
	FinSi
	Escribir "El total a pagar por ",unidades," computadoras compradas es: $",total - descuento
	Escribir "El descuento aplicado es: $",descuento
FinAlgoritmo
