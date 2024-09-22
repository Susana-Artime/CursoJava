
//Generar números aleatorios: Escribe un programa que genere e imprima un
//número entero aleatorio entre 1 y 100 usando la clase Math.random
package CursoJava;

public class ejercicio12 {
    
        public static void main(String[] args) {

          int numAleatorio;
          numAleatorio = (int) (Math.random()*100+1);
          System.out.println("El número aleatorio entre 1 y 100 es: " + numAleatorio);
        }
      
    
}
