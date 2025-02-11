package DesafiosGitHub.DesafioAPI;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UtilitariosDesafioMap {

    public static Function<Integer, String> binario =
            Integer::toBinaryString;

    public static UnaryOperator<String> inverter =
            s -> new StringBuilder(s).reverse().toString();

    public static Function<String, Integer> inteiro =
            i ->  Integer.parseInt(i, 2);

}
