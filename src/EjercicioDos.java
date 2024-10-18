import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {
    public static void main(String[] args) {
   //creo el ArryListde numeros enteros NUMBERS

        ArrayList<Integer>NUMBERS = new ArrayList<>();

    //Añado los numeros del 1 al 5
    for (int i = 1; i <= 5; i++)   {
        NUMBERS.add(i);
    }
    //usi bucle for para imprimir cada numero

    System.out.println("Usar bucle FOR:");
    for (int i = 0; i < NUMBERS.size(); i++) {
        System.out.println(NUMBERS.get(i));

    }
    System.out.println("Usar bucle FOR EACH:");
    for (int number : NUMBERS) {
        System.out.println(number);
    }
       System.out.println("Usar bucle WHILE (orden inverso):");
    int index = NUMBERS.size() -1;
    while (index >= 0){
        System.out.println(NUMBERS.get(index));
        index--;
    }
    }
}

