package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1,"Caio");
        usuarios.put(2, "Loren");
        usuarios.put(3, "Zé");

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(3));
        System.out.println(usuarios.containsValue("Zé"));

        System.out.println(usuarios.get(2));

        for(int chave: usuarios.keySet()){
            System.out.println(chave);
        }

        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro);
        }

    }
}
