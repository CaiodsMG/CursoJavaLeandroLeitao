package Lambdas;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        Predicate<Produto> isCaro =
                prod -> (prod.preco * (1 - prod.desconto) ) >= 750;

        Produto p1 = new Produto("Lápis", 3.50, 0.3);
        Produto p2 = new Produto("Notebook", 3700, 0.10);

        System.out.println(isCaro.test(p1));
        System.out.println(isCaro.test(p2));
    }
}
