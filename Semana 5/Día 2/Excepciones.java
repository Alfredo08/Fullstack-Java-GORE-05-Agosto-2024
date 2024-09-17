import java.util.ArrayList;

public class Excepciones {
    public static void main(String[] args) {
         ArrayList<String> estudiantes = new ArrayList<String>();
        double[] calificaciones = {9.8, 8.3, 10.0, 7.6, 9.1};

        estudiantes.add("Alex Miller");
        estudiantes.add("Martha Gómez");
        estudiantes.add("Julieta Vargas");
        estudiantes.add("Alan Morales");
        estudiantes.add("María Salas");

        try{
            for(int i = 0; i <= estudiantes.size(); i ++){
                System.out.println(calificaciones[i] + " - " + estudiantes.get(i));
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Se produjo un error, pero te dejamos continuar.");
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
