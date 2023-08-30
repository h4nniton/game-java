package br.senai.sp.jandira.game.Model;

public class Enemy {
    public String nome;
    public String skin;
    private int life;
    public Enemy(){

        life = 100;
    }
    public int getLife() {
        return life;
    }

    public void SubtraiVida(int danoEnemy){
        life =- danoEnemy;

        if (life < 0){
            life = 0;
        }
    }

}

