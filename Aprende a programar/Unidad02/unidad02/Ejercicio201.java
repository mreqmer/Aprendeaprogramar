package unidad02;
import java.util.Scanner;

public class Ejercicio201 {

	public static void main(String[] args) {
		// Variables
		final int MAYOR = 10;
		Scanner sc = new Scanner (System.in);
		int n1, n2, n3; //números que introducirá el usuario
		
		//Pregunta el primer número
		System.out.print("Introduce el primer número: ");
		n1 = sc.nextInt();
		//Pregunta el primer número
		System.out.print("Introduce el segundo número: ");
		n2 = sc.nextInt();
		//Pregunta el primer número
		System.out.print("Introduce el tercer número: ");
		n3 = sc.nextInt();
		//if que comprueba si algún número es mayor que 10
		if (n1>MAYOR || n2>MAYOR || n3>MAYOR) {
			System.out.println("ALGUNO ES MAYOR QUE " + MAYOR + ".");
		//Si ninguno es nayor que 10 entonces:
		}else {
			System.out.println("NINGUNO ES MAYOR QUE " + MAYOR + ".");
		}//Fin if
		
		sc.close();//Cierre escaner
	}

}
