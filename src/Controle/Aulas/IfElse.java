package Controle.Aulas;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o Número: ");

        int numero = Integer.parseInt(valor);

        if(numero % 2 == 0){
            System.out.println(numero + " É par");
        }else{
            System.out.println(numero + " É ímpar");
        }
    }
}
