package unidad02;
import java.util.*;
public class Ejercicio202 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner (System.in);
		int dia, mes;//Recoge el dia y el mes de el usuario
		//Recoger datos del usuario
		System.out.println("Que día es hoy?");
		dia = sc.nextInt();
		System.out.println("¿Qué mes es hoy?");
		mes = sc.nextInt();
		//if que comprueba si es navidad
		if (dia == 25 && mes == 12) {
			System.out.println("SI");
			//Si no cumple con la condición anterior entonces devuelve NO
		}else {
			System.out.println("NO");
		}
		sc.close();
	}

}
