import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {

    public static void main(String[] args) {

        ArrayList<String> List1 = new ArrayList<>();
        List1.add("Apple");
        List1.add("Banana");
        List1.add("Cherry");
        List1.add("Date");

ArrayList<String> List2 = new ArrayList<>();

        List2.add("Banana");
        List2.add("Date");
        List2.add("Elderberry");
        List2.add("Fig");

ArrayList<String> commonElements = new ArrayList<>();

for (String element : List1){
    if (List2.contains(element)) {
        commonElements.add(element);
    }
}
System.out.println("Elementos comunes: " +commonElements);


}
}
