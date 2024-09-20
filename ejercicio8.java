
package CursoJava;
import java.util.Scanner;

public class ejercicio8{
    
    public static void main (String [] args){
        int r; 
        double pi= 3.14;
        double area;   

        System.out.println("Ingresa el tamaño del radio: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
       
        area = pi *(r*r);
        System.out.println("El área del circulo es de " + area);
               
     }
    
}
