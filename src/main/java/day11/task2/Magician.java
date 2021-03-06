package day11.task2;

public class Magician extends Hero implements MagicAttack{

    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    public void magicalAttack(Hero hero) {
        double magicDamage = magicAtt * (1 - hero.magicDef);
        hero.health -= magicDamage;
        if (hero.health < 0) {
            hero.health = MIN_HEALTH;
        }
    }


    public String toString() {
        return "Magician{health=" + health + "}";
    }
}
