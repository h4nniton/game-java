package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Battle {

    /** Declarar Variaveis */
    String scenarioBattle;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Scenario */
    Scenario scenario = new Scenario();

    public void Battle(Player player, Enemy enemy){

        while (true) {

            int lifePlayer = player.getLife();
            int lifeEnemy = enemy.getLife();

            if (lifeEnemy == 0) {
                System.out.println("O Player " + player.nome + "É o vencedor!!!");
                break;
            } else if (lifePlayer == 0) {
                System.out.println("o Enemy " + enemy.nome + "É o vencedor");
                break;
            }


            System.out.println("---------------- BATTLE ----------------");
            System.out.println("Ataque Player [C] " + player.nome + "life: " + lifePlayer);
            System.out.println("Ataque Enemy [X] " + enemy.nome + "life: " + lifeEnemy);
            System.out.println("----------------------------------------");

            String attack = teclado.next();

            if (attack.equalsIgnoreCase("C")) {

                System.out.println("------------------------");
                System.out.println("   > Player Atacou <    ");
                System.out.println("------------------------");

                int danoPlayer = (int) (Math.random() * 20) + 1;
                enemy.SubtraiVida(danoPlayer);

                System.out.println("-----------------------------------");
                System.out.println(" O ataque foi de: " + danoPlayer);
                System.out.println("-----------------------------------");


            } else if (attack.equalsIgnoreCase("X")) {

                System.out.println("------------------------");
                System.out.println("   > Enemy Atacou <    ");
                System.out.println("------------------------");

                int danoEnemy = (int) (Math.random() * 20) + 1;
                enemy.SubtraiVida(danoEnemy);

                System.out.println("-----------------------------------");
                System.out.println(" O ataque foi de: " + danoEnemy);
                System.out.println("-----------------------------------");

            } else {
                System.out.println("Tecla inválida!!!!");
            }
        }

    }


    public void ChoiceScenario (){
        System.out.println("/-/-/-/-/--/-/-/-/-/-/-/-/-/-");
        System.out.println("Escolha um cenario:   [1- Torre Eiffel  2- Arabia 3-Turquia]: ");
        System.out.println("[1- Torre Eiffel  2- Arabia 3- Turquia - Deafault: SENAI Jandira]");
        System.out.println("/-/-/-/-/--/-/-/-/-/-/-/-/-/-");

        int choiceScenario = teclado.nextInt();

        scenarioBattle = scenario.Scenario(choiceScenario);

        System.out.println(scenarioBattle);

    }

}
