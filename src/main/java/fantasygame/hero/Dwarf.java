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
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying salutation speech");
        }
        System.out.println("\n- Master, dwarf " + getName() + " will bring you Glory!");
    }

    @Override
    public void getTriumphSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying triumph speech");
        }
        System.out.println("- " + getName() + SPEECH + "master");
    }

    @Override
    public int superSkill(Warrior opponent) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is using superskills.");
        }
        MountainSkill mountainSkill = new MountainSkill();
        System.out.println("- Mountain power!");
        mountainSkill.printAction();
        System.out.println("Dwarf fantasygame.skill hit " + mountainSkill.getDamage() + " damage.");
        int lifepoints = opponent.getActualLife() - mountainSkill.getDamage();
        if(LOG.isDebugEnabled()) {
            LOG.debug("Change actual life of opponent: " + opponent.getActualLife()
                    + " - " + mountainSkill.getDamage() + " = " + lifepoints);
        }
        return lifepoints;
    }
}
