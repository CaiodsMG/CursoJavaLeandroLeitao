package DesafiosGitHub.DesafioArray;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas notas você quer informar: ");
        int quantidadeNotas = entrada.nextInt();
        double soma = 0;
        double[] notas = new double[quantidadeNotas];


        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.printf("Digite a nota %d: ",(i+1));
            double notaValor = entrada.nextDouble();
            notas[i] = notaValor;
        }

        for(double nota: notas){
            soma += nota;

        }
        System.out.println("Soma: "+ soma);
        System.out.println("Quantidade de Notas: "+ quantidadeNotas);
        System.out.printf("Média: %.2f",(soma / quantidadeNotas));


        entrada.close();
    }
}
