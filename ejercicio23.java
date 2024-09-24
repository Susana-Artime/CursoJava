//Imprimir tabla de multiplicar: Escribe un programa que imprima la tabla de
//multiplicar de un número ingresado por el usuario usando un bucle for.
package CursoJava;
import java.util.Scanner;

public class Ejercicio23{

    public static void main(String[] args) {
         
      int num; 
      int resultado;   
      Scanner sc = new Scanner(System.in);

      System.out.println("Vamos a imprimir la tabla de multiplicar del número: ");
      num=sc.nextInt();
      
      for(int i=1;i<=10;i++){
        
        resultado = i*num;
        System.out.println(num + " x " +i+ " = " +resultado);

      }
      sc.close();

    }
    
}
