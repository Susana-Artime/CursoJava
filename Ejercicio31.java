//Palíndromo de cadena: Escribe un programa que verifique si una cadena dada
//es un palíndromo usando métodos de String.
package CursoJava;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String palabra;
        System.out.println("Introduce una palabra para comprobar si es palíndroma: ");
        palabra=sc.nextLine();
        int fin = palabra.length()-1;
        int inicio = 0;
        boolean espalin=false;
        
        while(inicio < fin){
            if(palabra.charAt(inicio)==palabra.charAt(fin)){
                espalin=true;
            }
          inicio++;
          fin--;
        }
        if(espalin){
            System.out.print("La palabra " + palabra + " es palíndroma.");
        }
        else{
            System.out.print("La palabra " + palabra + " no es palíndroma.");
        }

        sc.close();
        
    }
      
        
   }

    

