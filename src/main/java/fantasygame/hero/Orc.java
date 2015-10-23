package fantasygame.hero;

import fantasygame.weathewear.Armour;
import fantasygame.skill.Varg;
import fantasygame.weapon.Weapon;
import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Orc extends Warrior {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Orc(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying salutation speech");
        }
        System.out.println("Remember, when i`ll win = you set me free.");
    }

    @Override
    public void getTriumphSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying triumph speech");
        }
        System.out.println("It was easy! Next time i`ll come with my army, human!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is using superskills.");
        }
        System.out.println("- My bound up varg, kill my enemy!");

        Varg wolf = new Varg();
        wolf.printAction();

        int lifepoints = opponent.getActualLife() - wolf.getDamage();
        System.out.println("Wolf hit " + wolf.getDamage() + " damage!");
        if(LOG.isDebugEnabled()) {
            LOG.debug("Change actual life of opponent: " + opponent.getActualLife()
                    + " - " + wolf.getDamage() + " = " + lifepoints);
        }
        return lifepoints;
    }
}
