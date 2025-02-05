package Controle.Aulas;

import java.util.Scanner;

public class WhileDois {

    public static void main(String[] args) {
        System.out.println("Digite qualquer Coisa ou digite paralelepipido para sair");
        Scanner entrada = new Scanner(System.in);
        String valor = "";
        while(!valor.equals("sair")){
            System.out.println("Você diz: ");
            valor = entrada.nextLine();
        }

        entrada.close();
    }
}
