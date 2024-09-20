/*Intercambiar usando operaciones aritméticas: Modifica el ejercicio anterior
para intercambiar dos enteros usando operaciones aritméticas (por ejemplo,
suma y resta).
*/

package CursoJava;
import java.util.Scanner;
public class ejercicio03{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        System.out.print("Introduzca valor de A: ");
        A = sc.nextInt();
        System.out.print("Introduzca Valor de B: ");
        B = sc.nextInt();
        System.out.println("Valores iniciales: A = " + A + "   B = " + B);                                        
        
        A = A + B;
        B = A - B;
        A = A - B;
        System.out.println("Valores intercambiados: A = " + A + "   B = " + B); 
        sc.close();
                                          
    }
    
}
