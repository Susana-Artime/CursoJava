//Contar vocales en una cadena: Escribe un programa que cuente el número de
//vocales en una cadena ingresada por el usuario.
package CursoJava;
import java.util.Scanner;

public class Ejercicio32 {
      public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cadena;        
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        System.out.println("Ingresa la cadena y te cuento las vocales que tiene: ");
        cadena=sc.nextLine();

        for (int x = 0; x < cadena.length(); x++) {
               char actual = cadena.toLowerCase().charAt(x);

        switch (actual) {
          case 'a':
            a++;
            break;
          case 'e':
            e++;
            break;
         case 'i':
            i++;
            break;
         case 'o':
            o++;
            break;
         case 'u':
            u++;
            break;
        default:
            break;
       }
    }
            
            System.out.println("Total de vocales: " + (a+e+i+o+u));

            System.out.println("Cantidad de a: " + a);
            System.out.println("Cantidad de e: " + e);
            System.out.println("Cantidad de i: " + i);
            System.out.println("Cantidad de o: " + o);
            System.out.println("Cantidad de u: " + u);
            sc.close();
      }
      
   
}
