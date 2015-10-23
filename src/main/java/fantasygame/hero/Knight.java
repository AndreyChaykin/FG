package fantasygame.hero;

import fantasygame.weathewear.Armour;
import fantasygame.skill.MalteseOrden;
import fantasygame.weapon.Weapon;
import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Knight extends Warrior {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Knight(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying salutation speech");
        }
        System.out.println("\n- Lord, knight-errant  " + getName()+ " readiness to die for you!");
    }

    @Override
    public void getTriumphSpeech() {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is saying triumph speech");
        }
        System.out.println(this.getClass().getSimpleName() + SPEECH + "Lord!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        if(LOG.isDebugEnabled()) {
            LOG.debug(getClass().getSimpleName() + " " + getName() + " is using superskills.");
        }
        System.out.println("- Gran Master and Maltese Order will pray for my victory!");
        MalteseOrden malteseOrden = new MalteseOrden();
        malteseOrden.printAction();
        int lifepoints = opponent.getActualLife() - malteseOrden.getDamage();
        System.out.println("Knight fantasygame.skill hit " + malteseOrden.getDamage() + " damage.");
        if(LOG.isDebugEnabled()) {
            LOG.debug("Change actual life of opponent: " + opponent.getActualLife()
                    + " - " + malteseOrden.getDamage() + " = " + lifepoints);
        }
        return lifepoints;
    }
}
