//Declarar e inicializar variables: Escribe un programa que declare e inicialice
//diferentes tipos de variables (int, float, char, etc.), luego imprímelas.

package CursoJava;
public class Ejercicio01{
    
    public static void main(String[] args) {
    
        int num = 46;
        byte b = 16;
        short s = 7645;
        long l = 1234567818;
        float f = 3.18778f;
        double d = 3.14;
        boolean x = true;
        char symbol = '#';
        String word = "pato";

        System.out.println(num);
        System.out.println(b);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(x);
        System.out.println(symbol);
        System.out.println("Un " + word + " es un animal"); 

}

}