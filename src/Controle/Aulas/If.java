package Controle.Aulas;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a Média: ");
        double media = entrada.nextDouble();

        if(media >= 7.0) {
            System.out.println("Aprovado!");
        }

        entrada.close();

    }
}
