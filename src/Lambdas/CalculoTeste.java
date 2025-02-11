package Lambdas;

public class CalculoTeste {

    public static void main(String[] args) {

        Calculo soma = new Somar();
        Calculo multiplicar = new Multiplicar();

        System.out.println(soma.executar(1,3));

    }
}
