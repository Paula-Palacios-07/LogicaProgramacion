import java.util.Scanner;
public class almacen {
public static void main(String[]args){
Scanner entrada= new Scanner(System.in);
  


System.out.print("Escriba el numero de escritorios comprados:");  
int unidades = entrada.nextInt();

int total = unidades * 800000;
  int descuento = 0;
  
  if(unidades < 5){
   descuento = (int) (total * 0.1);
  }
  else if (unidades < 10){
    descuento = (int) (total * 0.2);
  }
  else{
    descuento = (int) (total * 0.4);
  }
  
  System.out.println("El total a pagar es: " + (total - descuento));

  System.out.println("El descuento aplicado es: " + (descuento));
     
}
}
  
  