//Días de la semana: Escribe un programa que convierta un número (1-7) en el
//día correspondiente de la semana usando una sentencia switch.
package CursoJava;

public class Ejercicio18{
    public static void main(String[] args) {

        int numaleatorio;

        numaleatorio = (int) (Math.random()*7+1);
        
        switch (numaleatorio) {
            case 1:
                System.out.println("Numero aleatorio: " + numaleatorio + " Lunes");
                break;
             case 2:
                System.out.println("Numero aleatorio: " + numaleatorio + " Martes");
                break;
            case 3:
                System.out.println("Numero aleatorio: " + numaleatorio + " Miércoles");
                break;
            case 4:
                System.out.println("Numero aleatorio: " + numaleatorio + " Jueves");
                break;
            case 5:
                System.out.println("Numero aleatorio: " + numaleatorio + " Viernes");
                break;
            case 6:
                System.out.println("Numero aleatorio: " + numaleatorio + " Sábado");
                break; 
            case 7:
                System.out.println("Numero aleatorio: " + numaleatorio + " Domingo");
                break;
                      
        }
        
    }
}
