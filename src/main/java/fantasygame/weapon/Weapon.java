package fantasygame.weapon;

import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

/**
 * Created by Andrey on 29.08.2015.
 */
public abstract class Weapon {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());
    private int condition;  //todo condition fantasygame.weapon
    private int damage;

 public Weapon(int damage, int condition) {
     this.damage = damage;
     this.condition = condition;
 }

    public int getDamage(){
        if(LOG.isDebugEnabled()) {
            LOG.debug("Get weapon damage " + damage);
        }
        return damage;
    }

    public int getCondition() {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Get weapon condition " + condition);
        }
        return condition;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder(Weapon.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
