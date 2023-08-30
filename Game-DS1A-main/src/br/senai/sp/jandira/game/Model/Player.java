package br.senai.sp.jandira.game.Model;

public class Player {
    public String nome;
    public String skin;
    private int life;

    public Player(){
        life = 100;
    }
    public int getLife(){
        return life;
    }
    public void SubtraiVida(int danoPlayer) {
        life -= danoPlayer;

        if (life < 0) {
            life = 0;
        }

    }
}

