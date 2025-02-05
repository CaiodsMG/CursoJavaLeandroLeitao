package Controle.Desafios;

import java.util.Scanner;

public class DesafioParImpar {

    public static void main(String[] args) {

        //Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor de 0 a 10");
        int numero = entrada.nextInt();

        if(numero > 10 || numero < 0){
            System.out.println("O número não está entre 0 a 10");
        } else if (numero % 2 == 0) {
            System.out.println(numero + " está entre 0 e 10 e é par!");
        }else{
            System.out.println(numero + " está entre 0 e 10 e é ímpar");
        }

        entrada.close();

    }


}
