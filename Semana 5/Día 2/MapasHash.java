import java.util.HashMap;
import java.util.Set;

public class MapasHash {
    public static void main(String[] args) {
        HashMap<String, Double> estudiantes = new HashMap<String, Double>();
        estudiantes.put("Alex Miller", 9.8);
        estudiantes.put("Martha Gómez", 8.7);
        estudiantes.put("Julieta Vargas", 7.5);
        estudiantes.put("Alan Morales", 10.0);

        //System.out.println("Calificación de Julieta Vargas: " + estudiantes.get("Julieta Vargas"));

        estudiantes.remove("Martha Gómez");

        Set<String> propiedad = estudiantes.keySet();
        for(String clave : propiedad){
            System.out.println(clave + " - " + estudiantes.get(clave));
        }
    }
}
