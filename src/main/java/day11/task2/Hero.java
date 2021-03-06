package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;         // здоровье
    double physDef;     // процент поглощения физического урона
    double magicDef;    // процент поглощения магического урона
    int physAtt;        // величина физической атаки
    int magicAtt;       // величина магической атаки

    public static final int MAX_HEALTH = 100;
    public static final int MIN_HEALTH = 0;

    public Hero() {
        health = MAX_HEALTH;
    }

    public void physicalAttack(Hero hero) {
        double physDamage = physAtt * (1 - hero.physDef);
        hero.health -= physDamage;
        if (hero.health < 0) {
            hero.health = MIN_HEALTH;
        }
    }

    public abstract String toString();

}
