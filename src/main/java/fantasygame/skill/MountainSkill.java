package fantasygame.skill;

import org.apache.log4j.Logger;
import static fantasygame.ClassNameUtil.getCurrentClassName;

public class MountainSkill implements Skill {

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
        System.out.println("**The snowbreak crack down on the head of dwarf opponent!**");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(MountainSkill.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }

}
