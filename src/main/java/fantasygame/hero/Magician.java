package fantasygame.hero;

import fantasygame.weathewear.Armour;
import fantasygame.skill.Necromancy;
import fantasygame.weapon.Weapon;
import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Magician extends Warrior {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Magician(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying salutation speech");
        }
        System.out.println("- I will show you power of magic, my sovereign!");
    }

    @Override
    public void getTriumphSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying triumph speech");
        }
        System.out.println(this.getName() + SPEECH + "my sovereign!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is using superskills.");
        }
        System.out.println("- " + opponent.getName() + ", you will hate the day, when you was born!");
        Necromancy necromancy = new Necromancy();
        necromancy.printAction();
        System.out.println("Zombies hit " + necromancy.getDamage() + " damage.");
        int lifepoints = opponent.getActualLife() - necromancy.getDamage();
        if(LOG.isDebugEnabled()) {
            LOG.debug("Change actual life of opponent: " + opponent.getActualLife()
                    + " - " + necromancy.getDamage() + " = " + lifepoints);
        }
        return lifepoints;
    }
}


