//VCalculadora simple usando switch: Escribe un programa que realice suma,
//resta, multiplicación o división según la entrada del usuario usando una sentencia switch.

package CursoJava;
import java.util.Scanner;

public class ejercicio17{
    public static void main(String[] args) {

        int numoperacion = 0;
        int n1 = 0, n2 = 0, res = 0;
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingresa el primer digito: ");
        n1 = sc.nextInt();

        System.out.println("Ingresa el segundo digito: ");
        n2 = sc.nextInt();
        
        System.out.println("Escriba el número de la operación artimética que desea realizar:\n 1 SUMA\n 2 RESTA\n 3 MULTIPLICACIÓN\n 4 DIVISIÓN");
        
        numoperacion = sc.nextInt();
        
        switch (numoperacion) {
            case 1:
                res = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + res);
                break;
            case 2:
                res = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + res);
                break;
            case 3:
                res = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + res);
                break;
            case 4:
                res = n1 / n2;
                System.out.println(n1 + " / " + n2 + " = " + res);
                break;
            default:
                System.out.println("La opción ingresada NO es válida");
                break;
        }
        sc.close();
    }
}

