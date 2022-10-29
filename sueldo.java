import java.util.Scanner;
public class sueldo{
public static void main(String[]args){
  
String nombre; 
double sueldo;
int horas;

Scanner entrada= new Scanner(System.in);

System.out.println("Ingrese su nombre complato: ");
nombre= entrada.next();

System.out.println("Ingrese su sueldo basico por hora: ");
sueldo= entrada.nextDouble();
  
System.out.println("Ingrese el numero de horas trabajdas al mes: ");  
horas= entrada.nextInt();

sueldo = sueldo * horas;

  if(sueldo >= 450000){
  System.out.println("Su nombre es: " + nombre);
  System.out.println("Su sueldo es:" + sueldo);
    }
  else{
    System.out.println("Su nombre es: " + nombre);
  }
}
  
}