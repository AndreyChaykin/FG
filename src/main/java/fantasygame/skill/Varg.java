package fantasygame.skill;

import org.apache.log4j.Logger;
import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Varg implements Skill {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public void printAction() {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Print skill action");
        }
        System.out.println("**Varg dirtily punish from the blindside of the opponent!**");
    }

    public int getDamage() {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Return int SKILL.");
        }
        return SKILL;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Varg.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
