package Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private List<Compra> compras = new ArrayList<>();

    public Cliente(String nome, List<Compra> compras) {
        this.nome = nome;
        this.compras = compras;
    }

    public double obterValorTotal(){
        double total = 0;
      for(Compra c: compras){
          for(Item i: c.getItens()){
              total += i.getQuantidade() * i.getProduto().getPreco();
          }
      }
      return total;
    };




}
