//Encontrar el mayor elemento en un array: Escribe un programa que
//encuentre e imprima el mayor elemento en un array de enteros.

package CursoJava;

public class Ejercicio27 {
    public static void main(String[] args) {
     
    //int numeros[] = {30,40,50,60,70};    
    int numeros[];
    numeros = new int[5];  
    numeros[0] = 70;
    numeros[1] = 40;
    numeros[2] = 80;
    numeros[3] = 60;
    numeros[4] = 50;
    
    int elementoMayor = numeros[0];
   
    for(int i=0; i<numeros.length; i++) {
        if(elementoMayor<numeros[i]){
          elementoMayor=numeros[i];
          System.out.println("El numero mayor es: " +elementoMayor);
        }
    }

    }
    
}
