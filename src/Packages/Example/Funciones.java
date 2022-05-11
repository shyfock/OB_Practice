package Packages.Example;

public class Funciones {
    public static void main(String[] args) {

        // opción 1: función sin parámetros y sin tipo de retorno
        showMenu();

        // opción 2: función sin parámetros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);

        // opción 3: función con parámetros y sin tipo de retorno
        imprimirSaludo("José Simón");

        // opción 4: función con parámetros y con tipo de retorno
        String saludo = obtenerSaludo("Francia", "Lizarazo");
        System.out.println(saludo);

    }

    // función sin parámetros, sin retorno
    static void showMenu() {
        System.out.println("Bienvenidos al e-commerce de zapatillas:");
        System.out.println("1- Ver zapatillas");
        System.out.println("2- Comprar zapatilla");
        System.out.println("3- Salir");
    }

    // función sin parámetros, con retorno
    static String getMenu() {
        return "Bienvenidos al e-commerce de zapatillas: \n 1- Ver zapatillas....";
    }

    // función con parámetros, sin retorno
    static void imprimirSaludo(String name) {
        System.out.println("Hola " + name);
    }

    // función con parámetros, con retorno
    static String obtenerSaludo(String name, String lastName) {
        return "Hola " + " " + name + " " + lastName;
    }
}
