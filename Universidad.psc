Algoritmo Universidad 
	Definir nivel, creditos Como Entero
	Definir promedio, total, descuento Como Real
	Escribir "Ingrese su nivel"
	Escribir "1 = Pregado"
	Escribir "2 = Posgrado"
	Leer nivel
	
	si nivel == 1 o nivel == 2 Entonces
		Escribir "Ingresa tu promedio"
		leer promedio
		si nivel == 1 Entonces
			si promedio >= 4.5 Entonces
				total = 28 * 50000
				descuento = total * 0.25
				creditos = 28
			FinSi
			
			si promedio >= 4.0 y promedio < 4.5 Entonces
				total = 25 * 50000
				descuento = total * 0.10
				creditos = 25
			FinSi
			
			si promedio >= 3.5 y promedio < 4.0 Entonces
				total = 20 * 50000
				descuento = 0
				creditos = 20
			FinSi
			
			si promedio >= 2.5 y promedio < 3.5 Entonces
				total = 15 * 50000
				descuento = 0
				creditos = 15
			FinSi
			
			si promedio < 2.5 Entonces
				Escribir "Lo siento, no puedes matricularte"
			FinSi	
			
		SiNo
			si promedio >= 4.5 Entonces
				total = 20 * 300000
				descuento = total * 0.20
				creditos = 20
			SiNo
				total = 10 * 300000 
				descuento = 0
				creditos = 10
			FinSi
		FinSi
		
		Escribir "El total a pagar por ",creditos," creditos es: $",total - descuento
		Escribir "El descuento aplicado es: $",descuento
	SiNo
		Escribir "Ingresa un nivel valido! "
	FinSi	
FinAlgoritmo

