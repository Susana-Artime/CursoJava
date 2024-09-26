//Transpuesta de una matriz: Escribe un programa que encuentre e imprima la
//transpuesta de un array 2D.

package CursoJava;

public class Ejercicio30 {
    public static void main(String[] args) {
        
        int[][] matriz = {{5,9},
                          {8,0},
                          
        };
        int aux;

        System.out.println("La matriz es: ");

        for (int i=0; i < 2; i++) {
            for (int j=0; j < 2; j++) { 
                System.out.print(matriz[i][j] + " ");             
          
            }
            System.out.print("\n");  
        }


        for (int i=0; i < 2; i++) {
            for (int j=0; j < 2; j++) { 
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;                  
          
            }
        }
        
        System.out.println("La matriz transpuesta es: ");

        for (int i=0; i < 2; i++) {
            for (int j=0; j < 2; j++) { 

                System.out.print(matriz[j][i] + " ");
            }

            System.out.print("\n");        

        }
        
    }

}
    

