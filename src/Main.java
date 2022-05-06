import Classes.CocheElectrico;
import Classes.CocheHibrido;

public class Main {
    public static void main(String[] args) throws Exception {
        CocheElectrico cocheObj = new CocheElectrico("Rojo", "Honda", "2012", 1280d, 4.8d, "motorElectrico");

        cocheObj.acelerar(50);

        System.out.println(cocheObj);

        CocheElectrico cocheElectrico = new CocheElectrico("Blanco", "Ford", "2018", 1854.54, 4.35, "motorElectrico");

        cocheElectrico.acelerar(30);

        System.out.println(cocheElectrico);

        CocheHibrido cocheHibrido = new CocheHibrido("Negro", "Audi", "2020", 1547.22, 4.25, "motorHibrido");

        cocheHibrido.acelerar(80);

        System.out.println(cocheHibrido);

    }
}
