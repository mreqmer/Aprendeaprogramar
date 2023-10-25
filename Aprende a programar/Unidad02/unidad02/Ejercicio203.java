package unidad02;

import java.util.Scanner;

public class Ejercicio203 {

	public static void main(String[] args) {
		// Variables
		Scanner sc = new Scanner(System.in);
		int antiguedad, sueldo; //registra la antiguedad y el sueldo del empleado
		int aumento; //registra el cálculo del nuevo salario
		//Pedir la antiguedad y el sueldo del empleado para luego comprobar si se le produce una rebaja
		System.out.println("Introduce la antigüedad del empleado:");
		antiguedad = sc.nextInt();
		System.out.println("Introduce su sueldo:");
		sueldo = sc.nextInt();
		//Comprobaciónes
		if (sueldo<500 && antiguedad >= 10) {
			//Se triplica el sueldo si este es menor a 500 y tiene más 10 años de antiguedad
			aumento = sueldo * 3;
			System.out.print("Su sueldo es de: "+ aumento + "€");
		}else if(sueldo<500 && antiguedad<10) {
			//Se dobla el sueldo si este es menor a 500 y tiene menos de 10 años de antiguedad
			aumento = sueldo*2;
			System.out.print("Su sueldo es de: "+ aumento + "€");
		}else {
			//Si el sueldo es mayor a 500 sin cambios
			System.out.print("Su sueldo es de: "+ sueldo + "€");
		}//fin if
		sc.close();//cierre escaner

	}

}
