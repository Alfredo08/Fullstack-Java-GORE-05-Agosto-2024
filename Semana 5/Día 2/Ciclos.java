import java.util.ArrayList;

public class Ciclos {
    public static void main(String[] args) {
        ArrayList<String> estudiantes = new ArrayList<String>();
        double[] calificaciones = {9.8, 8.3, 10.0, 7.6, 9.1};

        estudiantes.add("Alex Miller");
        estudiantes.add("Martha Gómez");
        estudiantes.add("Julieta Vargas");
        estudiantes.add("Alan Morales");
        estudiantes.add("María Salas");

        for(int i = 0; i < estudiantes.size(); i ++){
            System.out.println(calificaciones[i] + " - " + estudiantes.get(i));
        }

        System.out.println("------");
        int i = estudiantes.size() - 1;
        while(i >= 0){
            System.out.println(calificaciones[i] + " - " + estudiantes.get(i));
            i --;
        }

        System.out.println("------");
        for(String nombre : estudiantes){
            System.out.println(nombre);
        }
    }
}
