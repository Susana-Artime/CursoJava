//Invertir un array: Escribe un programa que invierta un array de enteros.

package CursoJava;

public class Ejercicio28 {
    public static void main(String[] args) {

        int [] numeros = {4,6,2,8,7};
        int [] numauxiliar = new int[numeros.length];
         
        for (int i = 0; i < numeros.length; i++) {
                    int j = numeros.length-i-1;
                    numauxiliar[j] = numeros[i];
        }
        numeros = numauxiliar;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+" ");
        }
        
   }

}
