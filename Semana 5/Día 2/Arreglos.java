import java.util.ArrayList;

public class Arreglos{
    public static void main(String args[]){
        ArrayList<String> estudiantes = new ArrayList<String>();

        estudiantes.add("Alex Miller");
        estudiantes.add("Martha Gómez");
        estudiantes.add("Julieta Vargas");
        estudiantes.add("Alan Morales");
        estudiantes.add("María Salas");

        System.out.println(estudiantes.get(3));
        System.out.println(estudiantes.size());

        estudiantes.remove(2);
        estudiantes.remove("María Salas");
        System.out.println(estudiantes.size());

        estudiantes.set(0, "Miguel López");
        System.out.println(estudiantes.get(0));

        /* Arreglos estáticos
         
        String[] estudiantes = new String[5];
        int[] numeros = {10, 20, 30, 40, 50};

        estudiantes[0] = "Alex Miller";
        estudiantes[1] = "Martha Gómez";
        estudiantes[2] = "Julieta Vargas";
        estudiantes[3] = "Alan Morales";
        estudiantes[4] = "María Salas";

        System.out.println(estudiantes.length);
        System.out.println(estudiantes[3]);
        */
    }
}