package Composicao.UmParaMuitos;

public class CompraTeste {

    public static void main(String[] args) {

        Compra c1 = new Compra();

        c1.nomeCliente = "Loren";
        c1.itens.add(new Item("Caneta", 20, 7.45));
        c1.itens.add(new Item("CD Vincenzo", 1, 35.90));
        c1.itens.add(new Item("Caderno Big Mouse", 3, 18.79));


        System.out.println(c1.itens.size());


        System.out.println(c1.valorTotal());

    }
}
