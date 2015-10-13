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
        LOG.debug("Saying salutation speech");
        System.out.println("Remember, when i`ll win = you set me free.");
    }

    @Override
    public void getTriumphSpeech() {
        LOG.debug("Saying triumph speech");
        System.out.println("It was easy! Next time i`ll come with my army, human!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        LOG.debug("Using superskills.");
        System.out.println("- My bound up varg, kill my enemy!");
        Varg wolf = new Varg();
        int lifeOpponent = opponent.getActualLife() - wolf.getDamage();
        wolf.printAction();
        LOG.debug("Change actual life of opponent.");
        System.out.println("Wolf hit " + wolf.getDamage() + " damage!");
        return lifeOpponent;
    }
}
