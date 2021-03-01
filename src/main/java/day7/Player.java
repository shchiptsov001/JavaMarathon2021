package day7;

public class Player {
    private int stamina;

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;

    public static int countPlayers = 0;

    public Player (int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 1) {
            stamina = 0;
            countPlayers--;
        }
        else if (stamina > 1) {
            stamina = stamina - 1;
        }
    }

    public static void info() {
        String completion;
        if (countPlayers < 6) {
            switch (6 - countPlayers) {
                case 5:
                    completion = " свободных мест";
                    break;
                case 1:
                    completion = " свободное место";
                    break;
                default:
                    completion = " свободных места";
            }
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + completion);
        }
        else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
