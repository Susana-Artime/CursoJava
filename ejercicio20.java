//Condiciones lógicas: Crea un programa que verifique si un número es positivo
//y par usando AND lógico, y si es negativo o divisible por 3 usando OR lógico.

package CursoJava;
import java.util.Scanner;

public class Ejercicio20 {
     public static void main(String[] args) {

        int num;
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingresa un número:");
        num = sc.nextInt();

        if(num>0 & num%2==0){

            System.out.println("El número: " + num + " es positivo y par");
            
        }
        else {
            if (num<0 || num%3==0){
                 
                System.out.println("El número: " + num + " es negativo o divisible por 3");

            }
        }
    

        sc.close();

}

}
