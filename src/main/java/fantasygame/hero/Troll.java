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
        LOG.debug("Saying salutation speech");
        System.out.println("I ama gonna eating you after when i ama killing you!" +
                " U am understanding me what a saying to you!");
    }

    @Override
    public void getTriumphSpeech() {
        LOG.debug("Saying triumph speech");
        System.out.println("Whose gonna fight weez me more?!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        LOG.debug("Using superskills.");
        int lifeOpponent = opponent.getActualLife();
        PowerfulStrike strike = new PowerfulStrike();

        System.out.println("- Do move not! I wanna sktricken you understandt!");

        int number = new Random().nextInt(3);
        if (number == 2) {
            LOG.debug("Change actual life of opponent.");
            lifeOpponent -= strike.getDamage();
            strike.printAction();
            System.out.println("Troll hit " + strike.getDamage() + " damage!");
            return lifeOpponent;
        } else {
            LOG.debug("Troll hit 0 damage.");
            System.out.println("Troll miss!");
            System.out.println("Troll hit " + 0 + " damage!");
            return lifeOpponent;
        }
    }
}
