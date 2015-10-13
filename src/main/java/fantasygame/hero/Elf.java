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
        LOG.debug("Saying salutation speech");
        System.out.println("Sir, " + getName() + " wish you powerful hand and wise and far-sighted mind!");
    }

    @Override
    public void getTriumphSpeech() {
        LOG.debug("Saying triumph speech");
        System.out.println(this.getClass().getSimpleName() + " " + getName() + " " + SPEECH + "sir!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        LOG.debug("Using superskills.");
        Dragon dragon = new Dragon();
        System.out.println("- Tirion, come and burnout " + opponent.getClass().getSimpleName().toLowerCase() + "!");
        dragon.printAction();
        LOG.debug("Change actual life of opponent.");
        System.out.println("Elf`s dragon hit " + dragon.getDamage() + " damage.");
        int lifeOpponent = opponent.getActualLife() - dragon.getDamage();
        return lifeOpponent;
    }
}
