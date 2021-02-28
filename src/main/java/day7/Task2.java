package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(11) + 90);
        Player.info();
        Player player2 = new Player(random.nextInt(11) + 90);
        Player.info();
        Player player3 = new Player(random.nextInt(11) + 90);
        Player.info();
        Player player4 = new Player(random.nextInt(11) + 90);
        Player.info();
        Player player5 = new Player(random.nextInt(11) + 90);
        Player.info();
        Player player6 = new Player(random.nextInt(2) + 9);
        Player.info();
        Player player7 = new Player(random.nextInt(2) + 9);
        System.out.println(Player.getCountPlayers());
        Player player8 = new Player(random.nextInt(2) + 9);
        System.out.println(Player.getCountPlayers());
        System.out.println(player1.getStamina());
        while (player1.getStamina() != 0) {
            player1.run();
        }
        System.out.println(player1.getStamina());
        Player.info();
    }
}
