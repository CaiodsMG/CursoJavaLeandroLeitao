package Colecoes;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {


        HashSet<Usuario> usuario = new HashSet<Usuario>();

        usuario.add(new Usuario("Loren"));
        usuario.add(new Usuario("Caio"));
        usuario.add(new Usuario("Zé"));


        boolean resultado = usuario.contains(new Usuario("Caio"));
        System.out.println(resultado);
    }
}
