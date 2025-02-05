package Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

   private List<Item> itens = new ArrayList<>();

    public Compra(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> getItens() {
        return itens;
    }
}
