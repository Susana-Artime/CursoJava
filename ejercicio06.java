//Suma de dos números: Escribe un programa que lea dos números enteros del usuario e imprima su suma.

package CursoJava;
import java.util.Scanner;
public class Ejercicio06{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Introduzca el valor del primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduzca el valor del segundo número: ");
        num2 = sc.nextInt();
        System.out.println("Valores : " + num1 + " y " + num2);                                        
        
        sum= num1+num2;
        System.out.println("La suma es : " +sum);

        sc.close();

    }

}