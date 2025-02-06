package oo.heranca;

public class Jogador {

    private int x;
    private int y;
    private int vida = 100;



    public Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean atacar(Jogador oponente){

        int deltaX = Math.abs(x - oponente.x);
        int deltaY = Math.abs(y - oponente.y);


        if(deltaX == 0 && deltaY == 1){
            oponente.vida -= 10;
            return true;
        } else if(deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
            return true;
        }else{
            return false;
        }

    }

    boolean andar(Direcao direcao){

        if(direcao == Direcao.NORTE){
            y--;
        } else if (direcao == Direcao.SUL) {
            y++;
        } else if (direcao == Direcao.LESTE) {
            x++;
        } else {
            x--;
        }
        return true;
    }


}
