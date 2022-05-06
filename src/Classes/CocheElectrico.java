package Classes;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo,
            String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico() {

    }

    @Override
    public void acelerar(Integer velocidad) {
        Integer velocidadAjustada = velocidad * 2;
        super.acelerar(velocidadAjustada);
    }

    @Override
    public String toString() {
        return super.toString() + "CocheElectrico [motorElectrico=" + motorElectrico + "]";
    }

}
