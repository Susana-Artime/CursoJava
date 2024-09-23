//Suma de números naturales: Escribe un programa que calcule la suma de
//números naturales hasta un número dado usando un bucle while.
package CursoJava;
import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
    
    int num;
    int total=0;
    int i=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa un número: ");
    num=sc.nextInt();
    
    while(i <= num) {
      total = total+i;
      i++;
    }
    
    System.out.println("La suma total es: " + total);
    
    sc.close();
    }
}
