package fantasygame.hero;

import fantasygame.weathewear.Armour;
import fantasygame.skill.Darkness;
import fantasygame.weapon.Weapon;
import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Chimera extends Warrior {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Chimera(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying salutation speech");
        }
        System.out.println("Thank you for given me chance to kill pshshshshsh");
    }

    @Override
    public void getTriumphSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying triumph speech");
        }
        System.out.println("Giffff me somebody more!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + "is using superskills.");
        }
        System.out.println("- Now you wil die!Feel the power of darkness!");
        Darkness darkeness = new Darkness();
        darkeness.printAction();
        int lifepoints = opponent.getActualLife() - darkeness.getDamage();
        if(LOG.isDebugEnabled()) {
            LOG.debug("Change actual life of opponent: " + opponent.getActualLife()
                    + " - " + darkeness.getDamage() + " = " + lifepoints);
        }
        System.out.println("Chimera hit " + darkeness.getDamage() + " damage!");
        return lifepoints;
    }


}
