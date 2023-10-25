package udo4;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int n1, n2; //numeros que introducirá el usuario en ese orden
		int suma, resta, producto, div; //recogerán los calculos
		//Preguntar por los números al usuario
		System.out.print("Introduce el primer número: ");
		n1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		n2 = sc.nextInt();
		//Cáclulos con los números introducidos por el usuario
		suma = n1 + n2;//suma
		resta = n1 - n2;//resta
		producto = n1 * n2;//producto
		div = n1 / n2;//división
		//Devolver datos por consola
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(producto);
		System.out.println(div);
		sc.close();//cierre escaner
		
		

	}

}
