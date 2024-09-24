/*Leer y mostrar entrada del usuario: Escribe un programa que lea un entero,
un número decimal y una cadena de texto ingresados por el usuario, luego
muéstralos.*/

package CursoJava;
import java.util.Scanner;
public class Ejercicio05{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        float decimal;
        String cadena;

        System.out.println("Introduzca un número: ");
        num = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca un decimal: ");
        decimal= sc.nextFloat();
        sc.nextLine();
        
        System.out.println("Introduzca una palabra o frase: ");
        cadena= sc.nextLine();
        
                                               
        System.out.println("El número introducido es: " + num); 
        System.out.println("El decimal introducido es: " + decimal); 
        System.out.println("La palabra o frase introducida es: " + cadena); 
        
        sc.close();
    }
    
}

