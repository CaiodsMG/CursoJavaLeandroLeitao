package DesafiosGitHub.DesafioAPI;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
    public static void main(String[] args) {
        // Criar 2 funções Lambdas
        // Usar Map

        Produto p1 = new Produto("Picolé de Morango", 5.50, true);
        Produto p2 = new Produto("Sorvete de Chocolate", 8.90, true);
        Produto p3 = new Produto("Balde de Sorvete", 25.00, true);
        Produto p4 = new Produto("Barra de Cereal", 4.50, false);
        Produto p5 = new Produto("Iogurte Natural", 6.50, true);
        Produto p6 = new Produto("Suco de Laranja", 7.00, true);
        Produto p7 = new Produto("Torta de Limão Gelada", 15.90, true);
        Produto p8 = new Produto("Água de Coco", 9.50, true);
        Produto p9 = new Produto("Milkshake de Baunilha", 8.00, true);
        Produto p10 = new Produto("Pizza de Calabresa", 30.00, false);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);

        produtos.stream()
                .filter(Produto.eCaro)
                .filter(Produto.eGelado)
                .map(Produto.mensagem)
                .forEach(System.out::println);

    }


}
