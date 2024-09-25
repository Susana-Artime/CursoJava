//Eliminar duplicados: Escribe un programa que elimine los elementos
//duplicados de un ArrayList de cadenas de texto.
package CursoJava;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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
      
      /*Clase HashSet, una de las implementaciones de la interface Set, 
      que define una colección que no puede contener elementos duplicados.
      Le pasamos un objeto de tipo de Collection (nuestro Array)*/
      Set<String> hashSet = new HashSet<String>(animales);
      //Borramos los elementos de la lista
      animales.clear();
      //Añadimos el objeto Collection(nuestro Array)sin duplicados
      animales.addAll(hashSet);
      
     //Imprimimos el resultado
      for (int i = 0; i < animales.size(); i++) {
            System.out.println(animales.get(i));
      }


   }

}
