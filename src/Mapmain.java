import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapmain {
    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("123456P", "Nombre Apellido 1");
        personas.put("123456J", "Nombre Apellido 2");
        personas.put("123456K", "Nombre Apellido 3");

        System.out.println(personas);
        // Iterar sobre el mapa para obtener key
        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        // Iterar sobre el mapa para obtener value
        for (String value : personas.values()) {
            System.out.println(value);
        }

        // Iterar sobre el mapa para obtener key + value
        for (Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + "/" + pair.getValue());
        }
    }
}
