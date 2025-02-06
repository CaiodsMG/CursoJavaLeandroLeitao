package oo.Polimorfismo;

public class Jantar {

    public static void main(String[] args) {


        Pessoa p1 = new Pessoa(99.65);

        Arroz ingrediente1 = new Arroz(0.2);
        Feijao ingrediente2 = new Feijao(0.1);
        Sorvete ingrediente3 = new Sorvete(0.1);


        System.out.println(p1.getPeso());

        p1.Comer(ingrediente1);
        p1.Comer(ingrediente2);
        p1.Comer(ingrediente3);
        System.out.println(p1.getPeso());

    }
}
