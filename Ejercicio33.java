//Convertir cadena a entero: Escribe un programa que convierta una cadena de
//texto a un número entero usando clases envolventes y le sume 10.

package CursoJava;

public class Ejercicio33 {
    
    public static void main(String[] args) {

        String cadena = "25";
        Integer numero;
        numero = Integer.parseInt(cadena);
        numero=numero+10;
        System.out.println("Total:" +numero); 
       

    }
}
