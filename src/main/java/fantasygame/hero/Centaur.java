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
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying salutation speech");
        }
        System.out.println("The stars promise me luck!");
    }

    @Override
    public void getTriumphSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying triumph speech");
        }
        System.out.println("Viva overlord Dionysus! " + Centaur.this.getName().toLowerCase() + SPEECH + "lord!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is using superskills.");
        }
        System.out.println("- Dionysus, help me!");
        DionysusMadness madness = new DionysusMadness();
        madness.printAction();
        int lifepoints = opponent.getActualLife() - madness.getDamage();
        if(LOG.isDebugEnabled()) {
            LOG.debug("Change actual life of opponent: " + opponent.getActualLife()
                    + " - " + madness.getDamage() + " = " + lifepoints);
        }
        System.out.println("Dionysus hit " + madness.getDamage() + " damage!");
        return lifepoints;
    }
}
