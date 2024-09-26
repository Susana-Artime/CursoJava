//Multiplicación de matrices: Escribe un programa que multiplique dos matrices
//ingresadas por el usuario usando bucles anidados.
package CursoJava;
import java.util.Scanner;

public class Ejercicio26{
    public static void main(String[] args) {

        Scanner sc= new Scanner (System.in);
        int m1[][]= new int [2][2];
        int m2[][]= new int [2][2];
        int result[][] = new int[2][2];

        System.out.println("Ingresa la primera matriz: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Matriz["+i+"]["+j+"]: ");
                m1[i][j]=sc.nextInt();
                
            }
        
    }
    
        System.out.println("Ingresa la segunda matriz: ");

        for (int i = 0; i< 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Matriz["+i+"]["+j+"]: ");
                m2[i][j]=sc.nextInt();
                
            }
            
        
        }
        System.out.println("La matriz 1 es: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m1[i][j] + " ");
            }

             System.out.print("\n");           
        }

        System.out.println("La matriz 2 es: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m2[i][j] + " " );
            }
            System.out.print("\n"); 
        }
            
        System.out.println("La matriz resultado es: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] += m1[i][j]*m2[i][j];
                System.out.print(result[i][j] + " " );
            }
            System.out.print("\n"); 
                        
        }

            sc.close();       
    }

    

}


    



        

