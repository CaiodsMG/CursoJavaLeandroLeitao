package Lambdas;

import java.util.function.Function;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("IPad", 3235.89, 0.13);
        Produto p2 = new Produto("Carro", 10327, 0.1);
        Produto p3 = new Produto("Computador", 1500, 0.10);

    /*
    1. A partir do produto calcular o preco real (com desconto);
    2. Imposto Municipal: >= 2500 (8.5%) / < 2500 (Isento)
    3. Frete >= 3000 (100) / < 3000 (50)
    4. Arredondar: Deixar duas casas decimais
    5. Formatar : RS1234,56
     */

        // Calcula o Preço Real com Desconto
        Function<Produto, Double> calcularPrecoComDesconto =
                prod -> prod.preco * (1 - prod.desconto);
        //System.out.println(calcularPrecoComDesconto.apply(p2));

        // Calcula o Preco com Imposto
        Function<Double, Double> calcularPrecoComImposto =
                precoComImposto ->
                        precoComImposto > 2500 ? precoComImposto + precoComImposto * 0.085 : precoComImposto;

        // Calcula o Preco com Frete
        Function<Double, Double> calcularPrecoComFrete =
                precoComFrete ->
                        precoComFrete > 3000 ? precoComFrete + 100 : precoComFrete + 50;
        // Guardando o valor na variavel aplicando (Desconto, Imposto e Frete)


        //Arredondando
        Function<Double, String> arredondar =
                num -> String.format("%.2f", num);


        // Formatar

        Function<String, String> formatar =
                formata -> "R$" + formata.replace(".",",");
        // Valor acima de 2500 para Teste
        Double valorFinalCarro =
                calcularPrecoComDesconto
                        .andThen(calcularPrecoComImposto)
                        .andThen(calcularPrecoComFrete)
                        .apply(p2);

        // Valor abaixo de 2500 para Teste
        Double valorFinalComputador =
                calcularPrecoComDesconto
                        .andThen(calcularPrecoComImposto)
                        .andThen(calcularPrecoComFrete)
                        .apply(p3);

        String formataCarro = arredondar.andThen(formatar).apply(valorFinalCarro);
        String formataComputador = arredondar.andThen(formatar).apply(valorFinalComputador);


        System.out.println("Preço Carro: "+ formataCarro);
        System.out.println("Preço Computador: "+formataComputador);


        }

    }

