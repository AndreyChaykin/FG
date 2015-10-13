package fantasygame.hero;

import fantasygame.weathewear.Armour;
import fantasygame.skill.Necromancy;
import fantasygame.weapon.Weapon;
import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Magician extends Warrior {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Magician(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        LOG.debug("Saying salutation speech");
        System.out.println("- I will show you power of magic, my sovereign!");
    }

    @Override
    public void getTriumphSpeech() {
        LOG.debug("Saying triumph speech");
        System.out.println(this.getName() + SPEECH + "my sovereign!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        LOG.debug("Using superskills.");
        System.out.println("- " + opponent.getName() + ", you will hate the day, when you was born!");
        Necromancy necromancy = new Necromancy();
        necromancy.printAction();
        LOG.debug("Change actual life of opponent.");
        System.out.println("Zombies hit " + necromancy.getDamage() + " damage.");
        int lifepoints = opponent.getActualLife() - necromancy.getDamage();
        return lifepoints;
    }
}


