package clases;
public class Cadenas {
    public static void main(String args[]){
        String mensaje = new String("Me gusta mucho programar");
        String mensaje2 = new String("Me gusta mucho programar");

        if(mensaje.equals(mensaje2)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes");
        }

        String mensajeEnMayusculas = mensaje.toUpperCase();

        System.out.println(mensaje);
        System.out.println(mensajeEnMayusculas);
        System.out.println(mensaje + " " + mensaje.length());
    }
}
