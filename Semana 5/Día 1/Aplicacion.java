import clases.Calculadora;

public class Aplicacion {
    public static void main(String args[]){
        int n1, n2;

        n1 = 30;
        n2 = 70;

        int resultadoSuma = Calculadora.sumaNumeros(n1, n2);
        System.out.println(resultadoSuma);

        int resultadoResta = Calculadora.restaNumeros(n2, n1);
        System.out.println(resultadoResta);

        Calculadora.imprimeHola();
    }
}
