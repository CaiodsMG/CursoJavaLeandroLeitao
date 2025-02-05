package Controle.Desafios;

import java.util.Scanner;

public class DesafioPositivoNegativo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int soma = 0;


        while (numero >= 0){
            System.out.println("Digite um número pra incrementar ou um numero negativo para sair do programa");
            numero = entrada.nextInt();

            if(numero >= 0 ){
                soma += numero;
                System.out.println("Soma: "+soma);
            }else{
                System.out.println("Você fechou o programa");
            }

        }


        System.out.println(soma);

        entrada.close();
        }
    }

