package Colecoes;

import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>();


        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Vinicius"));
        lista.add(new Usuario("Rodrigo"));
        lista.add(new Usuario("Caio"));
        lista.add(new Usuario("Thiago"));


        System.out.println(lista.get(3).nome);

        for(Usuario u: lista){
            System.out.println(u);
        }

    }
}
