package fantasygame.hero;

import fantasygame.weathewear.Armour;
import fantasygame.skill.MountainSkill;
import fantasygame.weapon.Weapon;
import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Dwarf extends Warrior {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Dwarf(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        LOG.debug("Saying salutation speech");
        System.out.println("\n- Master, dwarf " + getName() + " will bring you Glory!");
    }

    @Override
    public void getTriumphSpeech() {
        LOG.debug("Saying triumph speech");
        System.out.println("- " + getName() + SPEECH + "master");
    }

    @Override
    public int superSkill(Warrior opponent) {
        LOG.debug("Using superskills.");
        MountainSkill mountainSkill = new MountainSkill();
        System.out.println("- Mountain power!");
        mountainSkill.printAction();
        LOG.debug("Change actual life of opponent.");
        System.out.println("Dwarf fantasygame.skill hit " + mountainSkill.getDamage() + " damage.");
        int lifeOpponent = opponent.getActualLife() - mountainSkill.getDamage();
        return lifeOpponent;
    }
}
