//Simulador de tirada de dados: Crea un programa que simule la tirada de un
//par de dados usando números aleatorios.

package CursoJava;

public class ejercicio13 {
    public static void main(String[] args) {

    int dado1;
    int dado2;
    dado1 = (int) (Math.random()*6+1);
    dado2 = (int) (Math.random()*6+1);
    System.out.println("El primer dado saca " + dado1 + " y el segundo dado saca " + dado2);

    }
}
