package Controle.Desafios;

import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args) {
        //Crie um programa que recebe 10 valores e ao final imprima o maior número.

        Scanner entrada = new Scanner(System.in);
        int maior = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um Número");
            int numero = entrada.nextInt();

            if(numero > maior){
                maior = numero;
            }


        }
        System.out.println("O maior número digitado foi: "+ maior);
        entrada.close();
    }
}
