//Calculadora GUI: Escribe una calculadora simple con interfaz gráfica usando
//JOptionPane que pueda sumar, restar, multiplicar y dividir dos números.

package CursoJava;
import javax.swing.JOptionPane;
public class ejercicio10{
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Calculadora para dos números\n\nSUMA, RESTA, MULTIPLICACIÓN Y DIVISIÓN");
        String dato= "";
        int noperacion = 0;
        int n1 = 0, n2 = 0, res = 0;
        dato= JOptionPane.showInputDialog("Ingrese el primer dígito");
        n1 = Integer.parseInt(dato);
        dato = JOptionPane.showInputDialog("Ingrese el segundo dígito");
        n2 = Integer.parseInt(dato);
        dato= JOptionPane.showInputDialog("Escriba el número de la operación\nartimética que desea realizar:\nSUMA = 1\nRESTA = 2\nMULTIPLICACIÓN = 3\nDIVISIÓN = 4");
        noperacion=Integer.parseInt(dato);
        switch (noperacion) {
            case 1:
                res = n1 + n2;
                JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + res);
                break;
            case 2:
                res = n1 - n2;
                JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + res);
                break;
            case 3:
                res = n1 * n2;
                JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + res);
                break;
            case 4:
                res = n1 / n2;
                JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + res);
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opción ingresada NO es válida");
                break;
        }
    }
}


