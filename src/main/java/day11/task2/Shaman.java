package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer{
    public Shaman() {
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }

    public void magicalAttack(Hero hero) {
        double magicDamage = magicAtt * (1 - hero.magicDef);
        hero.health -= magicDamage;
        if (hero.health < 0) {
            hero.health = MIN_HEALTH;
        }
    }

    public void healHimself() {
        health += 50;
        if (health > 100) {
            health = MAX_HEALTH;
        }
    }

    public void healTeammate(Hero hero) {
        hero.health += 30;
        if (hero.health > 100) {
            hero.health = MAX_HEALTH;
        }
    }

    public String toString() {
        return "Shaman{health=" + health + "}";
    }
}
