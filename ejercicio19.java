//Verificación de elegibilidad para votar: Escribe un programa para comprobar
//si un usuario es elegible para votar (edad >= 18) usando operadores lógicos.

package CursoJava;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        int edad;
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingresa tu edad:");
        edad = sc.nextInt();

        if(edad>18){

            System.out.println("Eres mayor de 18 años. Puedes votar");
            
        }
        else {
            if (edad==18){
                 
                System.out.println("Tienes 18 años. Puedes votar");

            }
        

        else{
            System.out.println("Eres menor de 18 años. Todavía no puedes votar");
        }

        sc.close();

    }

  }



}
