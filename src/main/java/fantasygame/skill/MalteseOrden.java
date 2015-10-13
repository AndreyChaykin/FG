package fantasygame.skill;

import org.apache.log4j.Logger;
import static fantasygame.ClassNameUtil.getCurrentClassName;

public class MalteseOrden implements Skill {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public void printAction() {
        LOG.debug("Print skill action");
        System.out.println("Vivant omnes virgines\n" +
                "Graciles, formosae!\n" +
                "Vivant et mulieres\n" +
                "Tenerae, amabiles,\n" +
                "Bonae, laboriosae!"); //TODO latin song
        System.out.println("**Bright flash outshine sunlight!**");
    }

    public int getDamage() {
        LOG.debug("Return int SKILL.");
        return SKILL;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(MalteseOrden.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
