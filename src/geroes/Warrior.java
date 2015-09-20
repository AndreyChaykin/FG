package geroes;

import weapon.Weapon;

import java.util.Random;

import weathewear.Armour;

public abstract class Warrior {

    public final static Random RANDOM = new Random();
    public final static String SPEECH = " always at your service, ";
    private String name;
    private int actualLife;
    private int fullLife;
    private int hit;
    Weapon weapon;
    Armour armour;

    public Warrior(String name, int life, int hit, Weapon weapon, Armour armor) {
        this.name = name;
        this.fullLife = this.actualLife = life;
        this.hit = hit;
        this.weapon = weapon;
        this.armour = armor;
    }

    public String getName() {
        return name;
    }

    public int getActualLife() {
        return actualLife;
    }

    public void setActualLife(int actualLife) {
        this.actualLife = actualLife;
    }

    public int getFullLife() {
        return fullLife;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }


    public void printArmorCondition() {
        System.out.println(Warrior.this.getClass().getSimpleName() + "`s " + armour.getClass().getSimpleName().toLowerCase() +
                " have " + armour.getProtection() + " weathewear point.");
    }

    public void printWeaponCondition() {
        System.out.println(Warrior.this.getClass().getSimpleName() + "`s " + Weapon.class.getSimpleName().toLowerCase() +
                " have " + weapon.getCondition() + " damage points."); //todo weapon condition
    }

    public abstract void salutationSpeech();

    public abstract void triumphSpeech();

    public int kick(Warrior warrior) {
        int number = RANDOM.nextInt(5);
        if (number == 3) {
            return superSkill(warrior);
        } else {
            return standardKick(warrior);
        }
    }

    public abstract int superSkill(Warrior opponent);

    private int standardKick(Warrior opponent) {
        int damage = (RANDOM.nextInt(hit + weapon.getDamage())) - (RANDOM.nextInt(armour.getProtection()));
        int lifeOpponent = opponent.getActualLife();
        //TODO check if it correct damage
        if (damage >= 0) {
            System.out.println(getClass().getSimpleName() + " hit " + damage + " damage.");
            lifeOpponent -= damage;
        } else {
            System.out.println(getClass().getSimpleName() + " hit " + 0 + " damage.");
        }
        return lifeOpponent;
    }

    public void printLife() {
        System.out.println(getClass().getSimpleName() + " " + name + " have " + actualLife + " lifepoints.");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Warrior.this.getClass().getSimpleName().toLowerCase());
        result.append(" ");
        result.append(Warrior.this.getName());
        return result.toString();
    }
}


