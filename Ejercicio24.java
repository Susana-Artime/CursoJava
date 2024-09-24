//Cálculo de factorial: Escribe un programa que calcule el factorial de un número
//usando un bucle for.
package CursoJava;
import java.util.Scanner;

public class Ejercicio24{

    public static void main(String[] args) {
         
      int num; 
      double factorial=1;   
      Scanner sc = new Scanner(System.in);

      System.out.println("Vamos a calcular el factorial del número: ");
      num=sc.nextInt();
      
      for(int i=num;i>0;i--){
        
         factorial=factorial*i;
    
      }
      
      System.out.println("El factorial de " + num + " es: " + factorial);


    }
    
}

    

