// Calcular área de un círculo: Escribe un programa que calcule el área de un 
//círculo en función del radio ingresado por el usuario.

package CursoJava;
import java.util.Scanner;

public class ejercicio08{
    
    public static void main (String [] args){
        int r; 
        double pi= 3.14;
        double area;   

        System.out.println("Ingresa el tamaño del radio: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
       
        area = pi *(r*r);
        System.out.println("El área del circulo es de " + area);

        sc.close();
               
     }
    
}
