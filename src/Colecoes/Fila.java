package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        //Offer e add adicionam elementos na fila. A diferença é o comportamento quando a fila está cheia
        fila.add("Caio"); // Lança uma Exception
        fila.offer("Vinicius"); // Retorna False
        fila.offer("Rodrigo");
        fila.offer("Thiago");

        // Pega o primeiro elemento ... Em lista vazia o peek retorna null e element retorna erro
        //Peek e Element
        System.out.println(fila.peek()); // Retorna Null
        System.out.println(fila.element()); // Retorna Exception

        //Retorna o proximo elemento da fila removendo e indo para o próximo
        //Poll retorna Null fila vazia
        //Remove retorna uma exceção fila vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
        System.out.println(fila.remove());
    }
}
