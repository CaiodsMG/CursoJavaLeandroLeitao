package Composicao.UmParaMuitos;

import java.util.ArrayList;

public class Compra {

    String nomeCliente;
    ArrayList<Item> itens = new ArrayList<Item>();


    double valorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }

}
