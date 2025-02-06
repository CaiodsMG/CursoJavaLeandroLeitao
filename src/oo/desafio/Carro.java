package oo.desafio;

public class Carro {


    final int velocidadeMaxima;

    protected int velocidadeAtual;
    protected int parado = 0;

    private int delta = 5;


    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    protected Carro(int velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public int acelerar() {
        if (velocidadeAtual + getDelta() > velocidadeMaxima){
            return velocidadeMaxima;
        }else{
            return velocidadeAtual += getDelta();
        }

    }

    public int freiar() {
        if (this.velocidadeAtual < delta) {
            return parado;
        } else {
            return velocidadeAtual -= delta;
        }
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public String toString(){
        return "Velocidade: "+ velocidadeAtual+ "Km/H";
    }
}
