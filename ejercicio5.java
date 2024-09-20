package CursoJava;
import java.util.Scanner;
public class ejercicio5{
    
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

    }
    
}

