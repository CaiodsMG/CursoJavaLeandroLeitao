package Classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;
    Produto(String nomeInicial){
        nome = nomeInicial;
    }

    Produto(){

    }

    Produto(String nomeInicial, double precoInicial){
        nome = nomeInicial;
        preco = precoInicial;
    }

    double precoComDesconto(){
        return preco * (1 - desconto);

    }
}
