/*Juego de adivinar el número: Escribe un juego donde el usuario debe adivinar
un número generado aleatoriamente entre 1 y 100.*/

package CursoJava;
import java.util.Scanner;

public class ejercicio22{

    public static void main(String[] args) {
    
    int numAleatorio;
    numAleatorio = (int) (Math.random()*100+1);
    int num=0;
    boolean terminar=false;
    Scanner sc = new Scanner(System.in);
    
   
    System.out.println("El juego consiste en averiguar un número secreto entre 1 y 100.");
           
    while (terminar==false){
        
        System.out.print("Ingresa un número: ");
        num=sc.nextInt();
       
        if(num==numAleatorio){
            System.out.println("Bien!!Has ganado!!");
            terminar=true;
            break;
        }
        else if(num > numAleatorio){
            System.out.println("Ohhh!!Vuelve a intentarlo");
            System.out.println("El número es mayor que el número aleatorio\n");
            terminar =false;
        }
        else if(num < numAleatorio){

            System.out.println("Ohhh!!Vuelve a intentarlo");
            System.out.println("El número es menor que el número aleatorio\n");
            terminar =false;

        }
        System.out.print("¿Te rindes?Escribe S(Si) o N(No)");
        String solucion=""; 
        solucion=sc.next(); 
        
                 
        if(solucion.equals("S") || solucion.equals("s")){
             System.out.print("El número es: " + numAleatorio);
             terminar=true;
             break;                   
        }
                    
        }
      sc.close();

    }    
    
    
 }



