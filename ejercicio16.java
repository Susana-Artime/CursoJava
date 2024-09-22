//Comprobar si un año es bisiesto: Escribe un programa para verificar si un año
//dado es bisiesto usando una sentencia if-else.

package CursoJava;
import java.util.Scanner;
import java.time.*;

public class ejercicio16 {
    
      public static void main(String[] args) {

            long year;
            Scanner sc = new Scanner(System.in);
                    
            System.out.println("Introduce el año: ");
            year = sc.nextLong();
            
            if (Year.isLeap(year)){
                System.out.println("El año " + year + " es bisiesto");
            } else {
                System.out.println("El año " + year + " no es bisiesto");
            }

            sc.close();
        }

 }


    

