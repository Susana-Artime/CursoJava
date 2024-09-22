//Operaciones matemáticas: Escribe un programa que demuestre el uso de
//Math.pow(), Math.sqrt(), y Math.abs().

package CursoJava;
import java.util.Scanner;

public class ejercicio11{
    
    public static void main (String [] args){
        //Calcular el area de un circulo utilizando Math.pow que sirve para cacular las potencias de un numero
        //en este caso es el radio al cuadrado
        
        int r; 
        double a;   
        double pi= 3.1416; 
        System.out.println("Ingresa el tamaño del radio: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        a =  pi * Math.pow(r, 2) ; 
        System.out.println("El área del circulo es de " + a);


        //Calcular la raiz cuadrada de un numero ingresado utilizando Math.sqrt

        int num; 
        double raizCuadrada;

        System.out.println("Ingresa un número : ");
        num = sc.nextInt();
        raizCuadrada = Math.sqrt(num);
        System.out.println("La raiz cuadrada de " + num + " es " + raizCuadrada);
        
        //Calcular el valor absoluto de un número ingresado utilizando Math.abs

        int absoluto;

        System.out.println("Ingresa un número : ");
        num = sc.nextInt();
        absoluto = Math.abs(num);
        System.out.println("El valor absoluto de " + num + " es " + absoluto);
               
     }

    
}



