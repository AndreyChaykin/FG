package fantasygame.hero;

import fantasygame.weathewear.Armour;
import fantasygame.skill.DionysusMadness;
import fantasygame.weapon.Weapon;
import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Centaur extends Warrior {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Centaur(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        LOG.debug("Saying salutation speech");
        System.out.println("The stars promise me luck!");
    }

    @Override
    public void getTriumphSpeech() {
        LOG.debug("Saying triumph speech");
        System.out.println("Viva overlord Dionysus! " + Centaur.this.getName().toLowerCase() + SPEECH + "lord!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        LOG.debug("Using superskills.");
        System.out.println("- Dionysus, help me!");
        DionysusMadness madness = new DionysusMadness();
        madness.printAction();
        LOG.debug("Change actual life of opponent.");
        int lifepoints = opponent.getActualLife() - madness.getDamage();
        System.out.println("Dionysus hit " + madness.getDamage() + " damage!");
        return lifepoints;
    }
}
