package Generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

    public static void main(String[] args) {

        List<String> lang = Arrays.asList("JS", "PHP", "Java", "C++");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        List<Double> notas = Arrays.asList(2.3 , 3.5, 7.1, 8.9, 4.3);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(lang);
        System.out.println(ultimaLinguagem);


        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);

        Double ultimaNota = ListaUtil.getUltimo2(notas);
        System.out.println(ultimaNota);


    }
}
