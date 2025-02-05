package DesafiosGitHub.DesafioClasses;

public class Pessoa {

    String nome = "";
    private double peso;

    public double getPesoPessoa(){
        return this.peso;
    }

    void comer(Comida comida){
        peso += comida.getPesoComida();
    }

    Pessoa(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    Double pesoAnterior(){
        return this.peso;
    }
}
