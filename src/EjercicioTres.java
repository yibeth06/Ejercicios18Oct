import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {
    public static void main(String[] args) {

        //creo el aaraylist de nuemros enteros
        ArrayList<Integer> numbers = new ArrayList<>();

        //numeros del 1 al 10
        for (int i = 1; i <= 10; i++){
            numbers.add(i);
        }
        //creo una nueva lista numeros pares

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        //filtro numeros pares y areglos a la nueva lista
        for (int number : numbers){
            if (number % 2==0){
                evenNumbers.add(number);

            }
        }
        System.out.println("Primera Lista: " + numbers);
        System.out.println("Lista pares: " +evenNumbers);

    }
}
