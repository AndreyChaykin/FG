package fantasygame.hero;

import fantasygame.weathewear.Armour;
import fantasygame.skill.PowerfulStrike;
import fantasygame.weapon.Weapon;
import org.apache.log4j.Logger;

import java.util.Random;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Troll extends Warrior {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Troll(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying salutation speech");
        }
        System.out.println("I ama gonna eating you after when i ama killing you!" +
                " U am understanding me what a saying to you!");
    }

    @Override
    public void getTriumphSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying triumph speech");
        }
        System.out.println("Whose gonna fight weez me more?!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is using superskills.");
        }
        int lifeOpponent = opponent.getActualLife();
        PowerfulStrike strike = new PowerfulStrike();

        System.out.println("- Do move not! I wanna sktricken you understandt!");

        int number = new Random().nextInt(3);
        if (number == 2) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Change actual life of opponent " + opponent.getActualLife() + " - " + strike.getDamage());
            }
            lifeOpponent -= strike.getDamage();
            strike.printAction();
            System.out.println("Troll hit " + strike.getDamage() + " damage!");
            return lifeOpponent;
        } else {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Troll miss.");
            }
            System.out.println("Troll miss!");
            System.out.println("Troll hit " + 0 + " damage!");
            return lifeOpponent;
        }
    }
}
