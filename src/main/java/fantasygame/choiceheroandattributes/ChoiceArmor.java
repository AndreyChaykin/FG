package fantasygame.choiceheroandattributes;

import fantasygame.exceptions.ChoiceArmorException;
import fantasygame.weathewear.*;
import org.apache.log4j.Logger;

import java.util.Random;

public class ChoiceArmor implements RandomChoice {

    private static final Logger LOG = Logger.getLogger(ChoiceArmor.class);

    public int getRandomChoice() {
        LOG.debug("Getting random number.");
        int result = new Random().nextInt(5);
        LOG.debug("Random number is " + result);
        return result;
    }

    public Armour getArmor(int number) throws ChoiceArmorException {
        LOG.debug("Trying to get armor.");
        if (number == 0) {
            LOG.debug("Get RingArmour.");
            return new RingArmour(45);
        } else if (number == 1) {
            LOG.debug("Get WoodSaguum.");
            return new WoodSagum(40);
        } else if (number == 2) {
            LOG.debug("Get PlateArmour.");
            return new PlateArmour(60);
        } else if (number == 3) {
            LOG.debug("Get MagicSphere.");
            return new MagicSphere(30);
        } else if (number == 4) {
            LOG.debug("Get BuffCoat.");
            return new BuffCoat(24);
        }
        LOG.warn("Throw ChoiceArmourException: \"Can`t get armour\"");
        throw new ChoiceArmorException("Can`t get armour");
    }
}
