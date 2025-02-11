package DesafiosGitHub.DesafioAPI;

import java.util.function.Function;
import java.util.function.Predicate;

public class Produto {
    private final String nome;
    private final double preco;
    private final boolean gelado;

    public Produto(String nome, double preco, boolean gelado) {
        this.nome = nome;
        this.preco = preco;
        this.gelado = gelado;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isGelado() {
        return gelado;
    }

    public static Predicate<Produto> eCaro =
            ec -> ec.getPreco() <= 10.00;
    public static Predicate<Produto> eGelado =
            eg -> eg.isGelado() != false;
    public static Function<Produto, String> mensagem =
            m -> "O produto "+ m.getNome() + " é gelado e seu preço é R$"+
                    String.format("%.2f", m.getPreco()) + ".";
}
