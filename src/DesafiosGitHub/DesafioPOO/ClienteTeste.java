package DesafiosGitHub.DesafioPOO;

import Composicao.Desafio.Cliente;
import Composicao.Desafio.Compra;
import Composicao.Desafio.Item;
import Composicao.Desafio.Produto;

import java.util.ArrayList;
import java.util.List;

public class ClienteTeste {

    public static void main(String[] args) {


        Produto p1 = new Produto("Lápis",3.50);
        Produto p2 = new Produto("Caneta", 4.00);
        Produto p3 = new Produto("Carro", 11500.00);
        Produto p4 = new Produto("Moto", 7300.00);

        Item i1 = new Item(1, p1);
        Item i2 = new Item(1,p2);
        Item i3 = new Item(1,p3);
        Item i4 = new Item(1,p4);

        List<Item> itens = new ArrayList<>();
        itens.add(i1);
        itens.add(i2);

        List<Item> itensDois = new ArrayList<>();

        itensDois.add(i3);
        itensDois.add(i4);

        Compra c1 = new Compra(itens);

        List<Compra> compras = new ArrayList<>();
        compras.add(c1);

        Compra c2 = new Compra(itensDois);

        List<Compra> comprasDois = new ArrayList<>();
        comprasDois.add(c2);



        Composicao.Desafio.Cliente vini = new Composicao.Desafio.Cliente("Vinicius", compras);

        Composicao.Desafio.Cliente caio = new Cliente("Caio", comprasDois);

        System.out.println("Valor Total: "+ vini.obterValorTotal());

        System.out.println("Valor Total: "+ caio.obterValorTotal());





    }
}
