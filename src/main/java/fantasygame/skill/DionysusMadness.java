package fantasygame.skill;

import org.apache.log4j.Logger;
import static fantasygame.ClassNameUtil.getCurrentClassName;

public class DionysusMadness implements Skill {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public int getDamage() {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Return int SKILL.");
        }
        return SKILL;
    }

    public void printAction() {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Print skill action");
        }
        System.out.println("Thunder is heard everywhere! Lightning fly overhead! The enemy looses his mind");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(DionysusMadness.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
