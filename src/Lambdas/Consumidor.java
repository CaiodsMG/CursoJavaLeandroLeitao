package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {

        Consumer<Produto> imprimir = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Notebook", 7900, 0.15);
        imprimir.accept(p1);
        Produto p2 = new Produto("Caneta", 5, 0.15);
        Produto p3 = new Produto("Lapis", 3.50, 0.15);
        Produto p4 = new Produto("Caderno", 15.35, 0.15);
        Produto p5 = new Produto("Borracha", 3.29, 0.15);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);

        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco));

        produtos.forEach(System.out::println);
    }
}
