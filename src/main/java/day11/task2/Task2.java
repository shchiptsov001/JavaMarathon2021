package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior myWarrior = new Warrior();
        Paladin myPaladin = new Paladin();
        Magician myMagician = new Magician();
        Shaman myShaman = new Shaman();

        myWarrior.physicalAttack(myPaladin);
        System.out.println(myPaladin.toString());

        myPaladin.physicalAttack(myMagician);
        System.out.println(myMagician.toString());

        myShaman.healTeammate(myMagician);
        System.out.println(myMagician.toString());

        myMagician.magicalAttack(myPaladin);
        System.out.println(myPaladin.toString());

        myShaman.physicalAttack(myWarrior);
        System.out.println(myWarrior.toString());

        myPaladin.healHimself();
        System.out.println(myPaladin.toString());

        for(int i = 0; i < 5; i++) {
            myWarrior.physicalAttack(myMagician);
            System.out.println(myMagician.toString());
        }
    }
}
