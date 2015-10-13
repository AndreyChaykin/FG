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
        LOG.debug("Saying salutation speech");
        System.out.println("Thank you for given me chance to kill pshshshshsh");
    }

    @Override
    public void getTriumphSpeech() {
        LOG.debug("Saying triumph speech");
        System.out.println("Giffff me somebody more!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        LOG.debug("Using superskills.");
        System.out.println("- Now you wil die!Feel the power of darkness!");
        Darkness darkenes = new Darkness();
        darkenes.printAction();
        LOG.debug("Change actual life of opponent.");
        int lifepoint = opponent.getActualLife() - darkenes.getDamage();
        System.out.println("Chimera hit " + darkenes.getDamage() + " damage!");
        return lifepoint;
    }


}
