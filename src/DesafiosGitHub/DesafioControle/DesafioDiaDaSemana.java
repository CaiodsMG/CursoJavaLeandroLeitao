package DesafiosGitHub.DesafioControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

    public static void main(String[] args) {

        //Domingo -> 1
        //Segunda -> 2
        //...
        //Sábado -> 7

        Scanner entrada = new Scanner(System.in);

        String dia = entrada.next();

        if(dia.equals("Domingo")){
            System.out.println(1);
        } else if(dia.equals("Segunda")) {
            System.out.println("2");
        } else if(dia.equals("Terça")) {
            System.out.println("3");
        } else if(dia.equals("Quarta")) {
            System.out.println("4");
        } else if(dia.equals("Quinta")){
            System.out.println("5");
        } else if(dia.equals("Sexta")) {
            System.out.println("6");
        } else if(dia.equals("Sábado")) {
            System.out.println("7");
        }

        entrada.close();

    }
}
