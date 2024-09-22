//Generador de contraseñas aleatorias: Escribe un programa que genere una
//contraseña aleatoria de 8 caracteres usando letras y dígitos.

package CursoJava;
import java.util.Random;

public class ejercicio14 {
    public static void main(String[] args) {
    
        String lowercase = "abcdefghijklmnopqrstuvwyxz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";

        String characters = lowercase + uppercase + numbers;
        //Creamos un array de longitud 8 para guardar la contraseña en cada iteración del for
        char[] password = new char[8];
        int i, caracter;
        Random r= new Random();
        
        for(i=0;i < 8; i++){
         //Generamos un caracter aleatorio de toda la longitud de caracteres
         caracter= r.nextInt(characters.length());
         //Guardamos ese caracter en la posicion i del array de password
         password[i]=characters.charAt(caracter);
        }
        //Convertimos el array de password en un String
        String passRandom= new String(password);

        System.out.println("La contraseña aleatoria generada de 8 caracteres es: " + passRandom);
         
    
}
}
