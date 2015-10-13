package fantasygame.skill;

import org.apache.log4j.Logger;
import static fantasygame.ClassNameUtil.getCurrentClassName;

public class Necromancy implements Skill {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public void printAction() {
        LOG.debug("Print skill action");
        System.out.println("**Zombies is coming out from the grave and destroy everything on their way!**");
    }

    public int getDamage() {
        LOG.debug("Return int SKILL.");
        return SKILL;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Necromancy.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
