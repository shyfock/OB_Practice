import Classes.Coche;
import Classes.CocheHibrido;

public class ArraysMain {

    public static void main(String[] args) {
        String nombre1 = "Nombre 1";
        String nombre2 = "Nombre 2";
        String nombre3 = "Nombre 3";

        String[] nombres = new String[3];
        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];

        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        System.out.println(numeros);

        coches[0] = new CocheHibrido("Negro", "Alfa Romeo", "2022", 1550.55, 4.25, "motorHibrido");

        // Recorrer el array con un bucle for

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
