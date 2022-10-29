nivel = int()
creditos = int()
promedio = float()
total = float()
descuento = float()
print("Ingrese su nivel")
print("1 = Pregado")
print("2 = Posgrado")
nivel = int(input())
if nivel==1 or nivel==2:
		print("Ingresa tu promedio")
		promedio = float(input())
		if nivel==1:
			if promedio>=4.5:
				total = 28*50000
				descuento = total*0.25
				creditos = 28
			if promedio>=4.0 and promedio<4.5:
				total = 25*50000
				descuento = total*0.10
				creditos = 25
			if promedio>=3.5 and promedio<4.0:
				total = 20*50000
				descuento = 0
				creditos = 20
			if promedio>=2.5 and promedio<3.5:
				total = 15*50000
				descuento = 0
				creditos = 15
			if promedio<2.5:
				print("Lo siento, no puedes matricularte")
		else:
			if promedio>=4.5:
				total = 20*300000
				descuento = total*0.20
				creditos = 20
			else:
				total = 10*300000
				descuento = 0
				creditos = 10
		print("El total a pagar por ",creditos," creditos es: $",total-descuento)
		print("El descuento aplicado es: $",descuento)
else:
		print("Ingresa un nivel valido! ")
