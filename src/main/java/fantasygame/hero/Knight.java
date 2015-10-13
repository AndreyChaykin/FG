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
        LOG.debug("Saying salutation speech");
        System.out.println("\n- Lord, knight-errant  " + getName()+ " readiness to die for you!");
    }

    @Override
    public void getTriumphSpeech() {
        LOG.debug("Saying triumph speech");
        System.out.println(this.getClass().getSimpleName() + SPEECH + "Lord!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        LOG.debug("Using superskills.");
        System.out.println("- Gran Master and Maltese Order will pray for my victory!");
        MalteseOrden malteseOrden = new MalteseOrden();
        malteseOrden.printAction();
        LOG.debug("Change actual life of opponent.");
        int lifepoints = opponent.getActualLife() - malteseOrden.getDamage();
        System.out.println("Knight fantasygame.skill hit " + malteseOrden.getDamage() + " damage.");
        return lifepoints;
    }
}
