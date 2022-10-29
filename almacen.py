unidades = int(input("Escriba el numero de escritorios comprados: "))
total = int()
descuento = int()

total = unidades * 800000

if unidades < 5:
  descuento = total * 0.1
  
elif unidades < 10:
  descuento = total * 0.2

else: 
  descuento = total*0.4

print("El total a pagar por ",unidades," escritorios es: $",total - descuento)
print("El descuento aplicado es: $",descuento)
