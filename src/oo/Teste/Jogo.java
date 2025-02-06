package oo.Teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

    public static void main(String[] args) {

        Heroi j1 = new Heroi(10,10);


        Monstro j2 = new Monstro();

        j2.setX(10);
        j2.setY(11);


        System.out.println(j1.getVida());
        System.out.println(j2.getVida());

        j1.atacar(j2);
        j2.atacar(j1);


        System.out.println(j1.getVida());
        System.out.println(j2.getVida());

    }
}
