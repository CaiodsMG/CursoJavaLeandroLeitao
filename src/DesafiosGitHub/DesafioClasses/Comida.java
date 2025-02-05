package DesafiosGitHub.DesafioClasses;

public class Comida {

    String nomeComida = "";
    private double pesoComida;

    public double getPesoComida(){
        return this.pesoComida;
    }

    Comida(String nomeComida, double pesoComida){
        this.nomeComida = nomeComida;
        this.pesoComida = pesoComida;
    }
}
