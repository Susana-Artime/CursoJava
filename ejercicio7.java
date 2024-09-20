package CursoJava;
import java.util.Scanner;
public class ejercicio7{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int resultado;
        

        System.out.println("Vamos a calcular la expresion: num1 + num2 * num3... Introduzca el primer número: ");
        num1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduzca el segundo número: ");
        num2= sc.nextInt();
        sc.nextLine();
        
        System.out.println("Introduzca el tercer número: ");
        num3= sc.nextInt();
        sc.nextLine();

        resultado= num1 + num2 * num3;
                                                       
        System.out.println("La expresión es: " + num1 + "+" + num2 +"*" +num3 + " y el resultado es " + resultado); 
        
        sc.close();

    }
    
}
