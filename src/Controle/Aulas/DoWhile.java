package Controle.Aulas;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

       String valor = "";

       do {
           System.out.println("Voce precisa falar as palavras mágicas");
           System.out.println("Você quer sair? ");
           valor = entrada.nextLine();
       } while(!valor.equals("sair"));

       entrada.close();
    }
}
