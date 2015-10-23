package fantasygame.choiceheroandattributes;

import fantasygame.exceptions.ChoiceArmorException;
import fantasygame.weathewear.*;
import org.apache.log4j.Logger;

import java.util.Random;

public class ChoiceArmor implements RandomChoice {

    private static final Logger LOG = Logger.getLogger(ChoiceArmor.class);

    public int getRandomChoice() {
        int result = new Random().nextInt(5);
        if(LOG.isDebugEnabled()) {
            LOG.debug("Random number is " + result);
        }
        return result;
    }

    public Armour getArmor(int number) throws ChoiceArmorException {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Trying to get armor.");
        }
        if (number == 0) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return RingArmour.");
            }
            return new RingArmour(45);
        } else if (number == 1) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return WoodSaguum.");
            }
            return new WoodSagum(40);
        } else if (number == 2) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return PlateArmour.");
            }
            return new PlateArmour(60);
        } else if (number == 3) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return MagicSphere.");
            }
            return new MagicSphere(30);
        } else if (number == 4) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return BuffCoat.");
            }
            return new BuffCoat(24);
        }
        LOG.error("Throw ChoiceArmourException: \"Can`t get armour\"");
        throw new ChoiceArmorException("Can`t get armour");
    }
}
