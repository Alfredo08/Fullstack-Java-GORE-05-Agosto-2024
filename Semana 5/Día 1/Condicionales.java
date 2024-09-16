public class Condicionales {
    public static void main(String args[]){
        double calificacion;
        String mensaje;
        String mensajeTernario;

        calificacion = 9.3;

        if(calificacion >= 8.0){
            mensaje = "Felicidades, aprobaste tu examen.";
        }
        else{
            mensaje = "No aprobaste, suerte en tu segundo y/o tercer intento.";
        }

        System.out.println(mensaje);

        mensajeTernario = (calificacion >= 8.0) ? "Aprobaste" : "No aprobaste";

        System.out.println(mensajeTernario);
        // JS: === !==
        // Java: == !=
    }
}
