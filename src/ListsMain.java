import java.util.ArrayList;
import java.util.List;

public class ListsMain {
    public static void main(String[] args) {

        // List es una interfaz y se debe implementar, no se puede instanciar List.
        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        // Recorrer la lista
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
