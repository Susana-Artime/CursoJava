//Suma de matrices: Escribe un programa que sume dos arrays 2D y muestre el
//resultado.

package CursoJava;

public class Ejercicio29 {

    public static void main(String[] args) {
        
        int[][] m1 = {
                            {10,5},
                            {98,5},
                            
        };
        int[][] m2 = {
                            {8,7},
                            {19,56},
                            
        };
        int result[][] = new int[2][2];

        System.out.println("La matriz resultado es: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] += m1[i][j]+m2[i][j];
                System.out.print(result[i][j] + " " );
            }
            System.out.print("\n"); 
                        
        }

    } 

}
