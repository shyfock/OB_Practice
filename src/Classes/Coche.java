package Classes;

public abstract class Coche {
    /*
     * Una clase abstracta no puede ser instanciada.
     * Solo pueden instanciarse objetos a través de las clases hijas
     */
    // Atributos
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // Constructor
    public Coche() {

    }

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // Metodo

    public void acelerar(Integer velocidad) {
        if (velocidad > 0 && velocidad <= 120) {
            this.velocidad += velocidad;
        }

    }

    @Override
    public String toString() {
        return "Coche [" +
                "color=" + color +
                ", fabricante=" + fabricante +
                ", largo=" + largo +
                ", modelo=" + modelo +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                "]";
    }

}
