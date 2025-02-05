package Classe;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook");
        //p1.nome = "Notebook";
        p1.preco = 1000.00;

        Produto p2 = new Produto();
        p2.nome = "Geladeira";
        p2.preco = 4500.00;


        //Natal
        Produto p3 = new Produto();
        p3.nome = "Gabinete";
        p3.preco = 1000.00;
        p3.desconto = 0.30;


        System.out.println(p1.precoComDesconto());
        System.out.println(p2.precoComDesconto());
        System.out.println(p3.precoComDesconto());
    }
}
