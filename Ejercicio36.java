//Eliminar duplicados: Escribe un programa que elimine los elementos
//duplicados de un ArrayList de cadenas de texto.
package CursoJava;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class Ejercicio36 {
   public static void main(String[] args) {

      List<String> animales=new ArrayList<>();
      animales.add("perro");
      animales.add("gato");
      animales.add("pajaro");
      animales.add("perro");
      animales.add("tortuga");
      animales.add("raton");
      animales.add("gato");
      animales.add("pajaro");
      
      //Creamos un objeto HashSet
      HashSet hs = new HashSet();

     //Lo cargamos con los valores del array, esto hace quite los repetidos
      hs.addAll(animales);

     //Limpiamos el array
      animales.clear();

     //Agregamos los valores sin repetir
      animales.addAll(hs);

     //Imprimimos  el resultado
      for (int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i));
      }


   }

}
