nombre = str(input("Ingrese su nombre completo: "))
sueldo = float(input("Ingrese su sueldo por hora: "))
horas = int(input("Ingrese el numero de horas trabajadas en el mes: "))

sueldo = sueldo * horas

if sueldo >= 450000:
  print("Su nombre es:", nombre)
  print("Su sueldo es:", sueldo)
else: 
  print("Su nombre es:", nombre)