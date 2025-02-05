package DesafiosGitHub.DesafioControle;

import java.util.Random;
import java.util.Scanner;

public class DesafioAdivinhacao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random numeroaleatorio = new Random();
        int numero = numeroaleatorio.nextInt(100);
        int tentativas = 9;
        System.out.println("Você tem 10 tentativas");

        for(int i = tentativas; i >= 1; i = i - 1){
            Integer chute = entrada.nextInt();
            if (chute.equals(numero)){
                System.out.println("Parabéns você acertou!");
            }else if (!chute.equals(numero) && chute > numero){
                System.out.println("Número errado, o número é menor");
                System.out.println("Tentativas restantes: "+ i);
            }else{
                System.out.println("Número errado, o número é maior");
                System.out.println("Tentativas restantes: "+ i);
            }
        }
        System.out.println(numero);
        entrada.close();
    }
}
