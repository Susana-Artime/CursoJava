//Aplicación GUI simple: Crea una interfaz gráfica básica con JOptionPane que
//le pida al usuario su nombre y luego muestre un saludo.

package CursoJava;
import javax.swing.JOptionPane;

public class Ejercicio09{
    public static void main(String[] args) {
        
        // GUI intro
        String name = JOptionPane.showInputDialog("Hola!!¿Como te llamas?");
        JOptionPane.showMessageDialog(null,"Encantada de conocerte " + name); 

                
     }
}

