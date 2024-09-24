//Verificar si un número es par o impar: Escribe un programa que lea un
//número del usuario y verifique si es par o impar.

package CursoJava;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
     
        int num; 
        
        System.out.println("Ingresa un número para verificar si es par o impar: ");
        Scanner sc = new Scanner(System.in);
        num =sc.nextInt();

        if(num%2==0)
          System.out.println("El número " + num + " es par");
        else{
          System.out.println("El número " + num + " es impar");

        }

        sc.close();

}

}
