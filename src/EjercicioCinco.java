import java.util.ArrayList;
import java.util.List;


public class EjercicioCinco {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                lista.add(i);
            }


            Integer[] array = new Integer[lista.size()];
            array = lista.toArray(array);


            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }