package DesafiosGitHub.DesafioControle;

import java.util.Scanner;

public class DesafioWhile {
    // Digitar uma nota valida de 10 a 0
    // Quando usuario digitar nota valida armazenar em uma variavel total
    // Outra variavel pra somar quantas notas foram digitadas
    // -1 para sair do programa
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int quantidadeDeNotas = 0;
        double nota = 0;
        double total = 0;
        while(nota != -1){
            System.out.println("Informe a Nota: ");
            nota = entrada.nextDouble();
            if(nota <= 10 && nota >= 0){
                quantidadeDeNotas++;
                total += nota;
            }

        }

        //Calcular a média

        double media = total / quantidadeDeNotas;
        System.out.println("Média: "+media);

        entrada.close();

    }
}
