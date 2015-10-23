package fantasygame.hero;

import fantasygame.weathewear.Armour;
import fantasygame.skill.Dragon;
import fantasygame.weapon.Weapon;
import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Elf extends Warrior {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Elf(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying salutation speech");
        }
        System.out.println("Sir, " + getName() + " wish you powerful hand and wise and far-sighted mind!");
    }

    @Override
    public void getTriumphSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying triumph speech");
        }
        System.out.println(this.getClass().getSimpleName() + " " + getName() + " " + SPEECH + "sir!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is using superskills.");
        }
        Dragon dragon = new Dragon();
        System.out.println("- Tirion, come and burnout " + opponent.getClass().getSimpleName().toLowerCase() + "!");
        dragon.printAction();
        System.out.println("Elf`s dragon hit " + dragon.getDamage() + " damage.");
        int lifepoints = opponent.getActualLife() - dragon.getDamage();
        if(LOG.isDebugEnabled()) {
            LOG.debug("Change actual life of opponent: " + opponent.getActualLife()
                    + " - " + dragon.getDamage() + " = " + lifepoints);
        }
        return lifepoints;
    }
}
