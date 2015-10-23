package fantasygame.skill;

import org.apache.log4j.Logger;
import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Dragon implements Skill {

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
        System.out.println("**Gold dragon striking magic flame around elf!");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Dragon.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
