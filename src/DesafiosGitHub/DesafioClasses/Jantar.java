package DesafiosGitHub.DesafioClasses;

public class Jantar {

    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz",0.50);{

        }

        Comida c2 = new Comida("Bife",0.75);{

        }

        Pessoa p1 = new Pessoa("Vinicius", 100);{

        }

        System.out.println("Peso Antes: "+ p1.pesoAnterior());
        p1.comer(c1);
        System.out.println("Peso Atual: "+ p1.getPesoPessoa());
    }
}
