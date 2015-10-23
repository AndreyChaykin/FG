package fantasygame.skill;

import org.apache.log4j.Logger;
import static fantasygame.ClassNameUtil.getCurrentClassName;

public class PowerfulStrike implements Skill {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    private final int powerfulStrike = 250;

    public void printAction() {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Print skill action");
        }
        System.out.println("**Troll pack opponent!**");
    }

    public int getDamage() {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Return int SKILL.");
        }
        return powerfulStrike;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(PowerfulStrike.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
