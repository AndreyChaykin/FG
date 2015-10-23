package fantasygame.hero;

import fantasygame.weapon.Weapon;

import java.util.Random;

import fantasygame.weathewear.Armour;

import static fantasygame.ClassNameUtil.getCurrentClassName;

import org.apache.log4j.Logger;

public abstract class Warrior {

    public static String SPEECH = " always at your service, lord!";
    private static final Logger LOG = Logger.getLogger(getCurrentClassName());
    public final Random random = new Random();
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

    public static void triumphSpeech(Warrior warrior) {
        if (warrior != null) {
            warrior.getTriumphSpeech();
            LOG.debug("Warrior " + warrior.getName() + " saying triumph speech.");
        }
    }

    public String getName() {
        LOG.debug("Get warrior name.");
        return name;
    }

    public int getActualLife() {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Get hero " + getClass()+ " " + getName() + " actual life: " + actualLife);
        }
        return actualLife;
    }

    public void setActualLife(int actualLife) {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Set " + getClass() + " " + getName() + " actual life: was - "
                    + this.actualLife + ", new actual life - " + actualLife);
        }
        this.actualLife = actualLife;
    }

    public int getFullLife() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass() + " " + getName() + " get full life " + fullLife);
        }
        return fullLife;
    }

    public Weapon getWeapon() {
        LOG.debug("Get weapon " + weapon);
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        LOG.debug("Set weapon: old weapon - " + this.weapon + ", new weapon - " + weapon);
        this.weapon = weapon;
    }

    public Armour getArmour() {
        LOG.debug("Ger armour " + armour);
        return armour;
    }

    public void setArmour(Armour armour) {
        LOG.debug("Set armour: old armour - " + this.armour + ", new armour - " + armour);
        this.armour = armour;
    }


    public void printArmorCondition() {
        LOG.debug("Print armour condition.");
        System.out.println(Warrior.this.getClass().getSimpleName() + "`s " + armour.getClass().getSimpleName().toLowerCase() +
                " have " + armour.getProtection() + " armor points.");
    }

    public void printWeaponCondition() {
        LOG.debug("Print weapon condition.");
        System.out.println(Warrior.this.getClass().getSimpleName() + "`s " + Weapon.class.getSimpleName().toLowerCase() +
                " have " + weapon.getCondition() + " damage points."); //todo fantasygame.weapon condition
    }

    public abstract void salutationSpeech();


    public int kick(Warrior warrior) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(this.getClass() + " " + this.getName() +  " is trying to kick " +
                    warrior.getClass() + " " + warrior.getName());
        }
        int number = random.nextInt(5);
        if (number == 3) {
            if(LOG.isDebugEnabled()) {
                LOG.debug(this.getClass() + " " + this.getName() + " used superSkill.");
            }
            return superSkill(warrior);
        } else {
            if(LOG.isDebugEnabled()) {
                LOG.debug(this.getClass() + " " + this.getName() + " used standardKick.");
            }
            return standardKick(warrior);
        }
    }

    //todo with this or just getClass

    public abstract int superSkill(Warrior opponent);

    public int standardKick(Warrior opponent) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(this.getClass() + " " + this.getName() + " is trying to do standardKick.");
        }
        int lifeOpponent = opponent.getActualLife();
        //TODO check if it correct damage
        int damage = (random.nextInt(hit + weapon.getDamage())) - (random.nextInt(armour.getProtection()));
        if (damage >= 0) {
            System.out.println(getClass().getSimpleName() + " hit " + damage + " damage.");
            if(LOG.isDebugEnabled()) {
                LOG.debug(getClass() + " " + getName() + " hit " + opponent + " for " + damage + " damage.");
            }
            lifeOpponent -= damage;
        } else {
            System.out.println(getClass().getSimpleName() + "is miss.");
            LOG.debug(getClass() + " " + getName() + "is miss.");
        }
        return lifeOpponent;
    }


    public void printLife() {
        LOG.debug("Print hero actual life: " + "name " + name + ", " + "actualLife " + actualLife);
        System.out.println(getClass().getSimpleName() + " " + name + " have " + actualLife + " lifepoints.");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Warrior.this.getClass().getSimpleName().toLowerCase());
        result.append(" ");
        result.append(Warrior.this.getName());
        return result.toString();
    }

    public abstract void getTriumphSpeech();
}



