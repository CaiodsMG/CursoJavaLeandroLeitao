package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {

    public static void main(String[] args) {


        Set<String> lista = new HashSet<>();
        lista.add("Rodrigo");
        lista.add("Caio");
        lista.add("Vinicius");
        lista.add("Thiago");


        for(String irmao: lista){
            System.out.println("Oi, eu sou o "+ irmao);
        }
        System.out.println(lista);
    }
}
