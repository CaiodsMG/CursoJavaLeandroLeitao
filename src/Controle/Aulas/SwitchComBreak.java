package Controle.Aulas;

import java.util.Scanner;

public class SwitchComBreak {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        String conceito = "";
        System.out.println("Informe a nota: ");
        int nota = entrada.nextInt();

        switch(nota){
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "A";
                break;
            case 8:
                conceito = "B";
                break;
            case 7:
                conceito = "B";
                break;
            case 6:
                conceito = "C";
                break;
            case 5:
                conceito = "C";
                break;
            case 4:
                conceito = "D";
                break;
            case 3:
                conceito = "D";
                break;
            case 2:
                conceito = "F";
                break;
            case 1:
                conceito = "F";
                break;
            case 0:
                conceito = "F";
                break;


        }
        System.out.println("Conceito é: "+ conceito);
        entrada.close();
        }

    }

