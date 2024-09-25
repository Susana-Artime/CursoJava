//Lista dinámica de enteros: Escribe un programa que permita al usuario
//ingresar enteros en un ArrayList, luego muestre la lista y su suma.
package CursoJava;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Ejercicio35 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int number;
        int suma=0;
        int cantidad;

        System.out.println("¿Cuántos numeros quieres añadir a la lista?");  
        cantidad=sc.nextInt(); 
        
     
        for(int i=0; i<cantidad; i++) {
            System.out.println("Ingresa un numero para añadirlo: ");
            number=sc.nextInt();
            numbers.add(number);
            suma=suma + number;
			
         }
         
         System.out.println("Los numeros añadido a la lista son: ");
         for(int i=0; i<numbers.size(); i++) {

            System.out.println(numbers.get(i));
         }
         
        System.out.println("La suma total de los numeros es: "+ suma);
        sc.close();

     }
    

	
}
        


