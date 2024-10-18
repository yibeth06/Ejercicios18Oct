import java.util.ArrayList;
import java.util.List;
public class EjercicioUno {
    public static void main(String[] args) {


     //crear el ArrayList de tipo string frutas

     ArrayList<String> frutas = new ArrayList<>();

     //Agregar los elementos

        frutas.add("Apple");
        frutas.add("Banana");
        frutas.add("Cherry");

        //imprimir el tamaño de la lista y los elementos
        System.out.println("Tamaño de la lista: " + frutas.size());
        System.out.println("Elementos de la lista:" +frutas);

        //Eliminar Banana de la lista
        frutas.remove("Banana");
        //cambiar el valor de Cherry por Orange

        frutas.set(frutas.lastIndexOf("Cherry"), "Orange");

        System.out.println("Lista despuès de los cambios: " + frutas);



}
}
