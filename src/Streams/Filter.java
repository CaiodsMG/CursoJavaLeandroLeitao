package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Loren", 7.8);
        Aluno a2 = new Aluno("Caio", 7.9);
        Aluno a3 = new Aluno("Zé", 8.5);
        Aluno a4 = new Aluno("Vó da Loren", 9.1);
        Aluno a5 = new Aluno("Vó do Caio", 9.1);
        Aluno a6 = new Aluno("Vó do Zé", 6.8);


        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Predicate<Aluno> aprovado =
                a -> a.nota >= 8.0;
        Function<Aluno, String> parabens =
                a -> "Parabéns! " + a.nome + " você foi aprovado!";

        alunos.stream()
                .filter(aprovado)
                .map(parabens)
                .forEach(System.out::println);

    }
}
