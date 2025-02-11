package Streams;

import Arrays.Desafio.Array;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {


        Consumer<Object> print = System.out::print;

        Stream<String> langs = Stream.of("Java ", "Lua ", "Python\n");
        langs.forEach(print);

        String[] maisLangs = {"JS ", "Perl ", "LISP ", "GoLang\n"};
        Stream.of(maisLangs).forEach(print);

        Arrays.stream(maisLangs).forEach(print);

        Arrays.stream(maisLangs, 1, 3).forEach(print);

        List<String> outrasLangs = Arrays.asList("\nC ", "PHP ", "Kotlin");
        outrasLangs.stream().forEach(print);

        //Stream.generate(() -> "a").forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(print);
    }
}
