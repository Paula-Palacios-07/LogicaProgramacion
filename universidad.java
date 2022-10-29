import java.util.Scanner;
public class universidad {
public static void main(String[]args){
Scanner entrada= new Scanner(System.in);

int creditos = 0;
double descuento = 0;
int nivel;
double promedio;
double total = 0;
  
		System.out.println("Ingrese su nivel");
		System.out.println("1 = Pregado");
		System.out.println("2 = Posgrado");
		nivel = entrada.nextInt();
  
		if (nivel==1 || nivel==2) {
			System.out.println("Ingresa tu promedio");
			promedio= entrada.nextDouble();
      
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
					System.out.println("Lo siento, no puedes matricularte");
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
      System.out.println("El total a pagar por "+creditos+" creditos es:$" + (total - descuento));
			System.out.println("El descuento aplicado es: $"+ descuento);    
		} else {
			System.out.println("Ingresa un nivel valido! ");
		}
	}


}
