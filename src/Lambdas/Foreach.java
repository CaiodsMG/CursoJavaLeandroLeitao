package Lambdas;

import java.util.List;
import java.util.Arrays;

public class Foreach {

    public static void main(String[] args) {
        List<String> aprovados = Arrays
                .asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma Tradicional");
        for(String nome:aprovados){
            System.out.println(nome);
        }

        System.out.println("Lambda #01");

        aprovados.forEach(nome -> {
            System.out.println(nome + "!!!");
        });

        System.out.println("Method Reference");
        aprovados.forEach(System.out::println);

        System.out.println("Lambda #02");

        aprovados.forEach(nome -> {
            meuImprimir(nome);
        });
    }

    static void meuImprimir(String nome){
        System.out.println("Oi! Meu nome é "+ nome);
    }

}
