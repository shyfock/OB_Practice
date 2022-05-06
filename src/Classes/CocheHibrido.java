package Classes;

public class CocheHibrido extends Coche {

    String motorHibrido;

    public CocheHibrido(String motorHibrido) {
        this.motorHibrido = motorHibrido;
    }

    public CocheHibrido(String color, String fabricante, String modelo, Double peso, Double largo,
            String motorHibrido) {
        super(color, fabricante, modelo, peso, largo);
        this.motorHibrido = motorHibrido;
    }

    @Override
    public String toString() {
        return super.toString() + "CocheHibrido [motorHibrido=" + motorHibrido + "]";
    }

}
