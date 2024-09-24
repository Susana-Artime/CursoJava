//Imprimir patrones: Escribe un programa para imprimir un patrón piramidal de
//estrellas usando bucles anidados.

package CursoJava;

import java.util.Scanner;

public class Ejercicio25 {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
		int rows;
	
				
        System.out.println("Vamos a imprimir una piramide de estrellas");
		System.out.println("Dime cuantas filas quieres: ");
		rows = sc.nextInt();
	

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j<=i;  j++)
                System.out.print("*");
            System.out.println();
        }
				
    }
}
        


