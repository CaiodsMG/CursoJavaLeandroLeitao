package DesafiosGitHub.DesafioAPI;

import java.util.Arrays;
import java.util.List;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        /*
         * 1. Número para String Binária... 6 => "110";
         * 2. Reverter a String ... "110" => "011";
         * 3. Converter de volta para inteiro => "011" => 3
         */

        nums.stream()
                .map(UtilitariosDesafioMap.binario)  // Converte número para binário
                .map(UtilitariosDesafioMap.inverter) // Reverte a string binária
                .map(UtilitariosDesafioMap.inteiro) // Converte binário para inteiro
                .forEach(System.out::println);



    }



}

