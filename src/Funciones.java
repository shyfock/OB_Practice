
public class Funciones {
    public static void main(String[] args) {
        int numero = tuNombre(1);
        tuNombre();
        System.out.println("El número es: " + numero);
    }

    public static void tuNombre() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i > 6) {
                System.out.println("Aqui es " + i);
                break;
            }
        }
    }

    public static Integer tuNombre(int a) {
        return 1;
    }
}
