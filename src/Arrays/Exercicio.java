package Arrays;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {

        double[] notasAlunosA = new double[3];
        notasAlunosA[0] = 7.9;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 6.7;


        String notas = Arrays.toString(notasAlunosA);
        System.out.println(notas);

        double total = 0;

        for (int i = 0; i < notasAlunosA.length; i++) {
            total += notasAlunosA[i];
        }

        System.out.println("Média dos Alunos: "+ total / notasAlunosA.length);

        double [] notasAlunosB = { 6.9, 8.9, 5.5, 10 };

        for (int i = 0; i < notasAlunosB.length; i++) {
            total += notasAlunosB[i];
        }

        System.out.println("Média dos ALunos: "+ total / notasAlunosB.length);
    }
}
