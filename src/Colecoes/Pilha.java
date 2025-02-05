package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O pequeno principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        // Pega o primeiro elemento ... Em lista vazia o peek retorna null e element retorna erro
        //Peek e Element
        System.out.println(livros.peek());
        System.out.println(livros.element());


        //Retorna o proximo elemento da fila removendo e indo para o próximo
        //Poll retorna Null fila vazia
        //Remove retorna uma exceção fila vazia
        // Pop também remove
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        //System.out.println(livros.remove());
        //System.out.println(livros.remove());
        //System.out.println(livros.pop());

        //livros.size();
        //livros.clear();
        //livros.cointains()
    }
}
