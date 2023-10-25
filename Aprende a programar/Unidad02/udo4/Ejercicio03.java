package udo4;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// variables
		Scanner sc = new Scanner(System.in);
		int lado, area;//se guardará el lado del cuadrado y el cálculo del área de este
		//Pedir lado del cuadrado al usuario
		System.out.print("Introduce el lado del cuadrado: ");
		lado = sc.nextInt();//escaner
		area = lado * lado;//cálculo del área del triangulo
		System.out.println("El área del cuadrado es: " + area);
		sc.close();
	}

}
