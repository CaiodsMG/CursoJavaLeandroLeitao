package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {


        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(3);
        conjunto.add('x');

        System.out.println(conjunto.size());
        conjunto.add("teste");
        System.out.println(conjunto.size());
        conjunto.remove(1.2);
        System.out.println(conjunto.size());

        System.out.println(conjunto.contains('x'));


        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        System.out.println(nums);

        conjunto.addAll(nums);

        System.out.println(conjunto);


    }

}
