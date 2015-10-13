package fantasygame.weathewear;

import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public abstract class Armour {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());
    private int protection;

    public Armour(int protection) {
        this.protection = protection;
    }

    public int getProtection() {
        LOG.debug("Get armour protection.");
        return protection;
    }

    public void setProtection(int protection) {
        LOG.debug("Set armour protection.");
        this.protection = protection;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Armour.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }

}
