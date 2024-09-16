package clases;
public class MetodosEstaticos {
    public static void main(String args[]){
        int n1, n2, n3;
        n1 = 20;
        n2 = 30;

        int resultado = sumaNumeros(n1, n2);
        System.out.println(n1 + " + " + n2 + " = " + resultado);
        
        n1 = 50;
        n2 = 150;
        resultado = sumaNumeros(n1, n2);
        System.out.println(n1 + " + " + n2 + " = " + resultado);
        
        n1 = 35;
        n2 = 57;
        n3 = 8;
        resultado = sumaNumeros(n1, n2, n3);
        System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + resultado);
    }

    public static int sumaNumeros(int num1, int num2){
        int total = num1 + num2;
        return total;
    }

    public static int sumaNumeros(int num1, int num2, int num3){
        int total = num1 + num2 + num3;
        return total;
    }
}
