package Controle.Aulas;

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "marrom";
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai");

            case "marrom":
                System.out.println("Sei o Tekki Shodan");

            case "roxo":
                System.out.println("Sei o Heian Godan");

            case "verde":
                System.out.println("Sei o Iodan G");

            default:
                System.out.println("Não sei nada");

        }

    }
}
