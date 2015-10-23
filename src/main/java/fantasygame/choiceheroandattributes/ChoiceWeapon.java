package fantasygame.choiceheroandattributes;

import fantasygame.exceptions.GetWeaponException;
import fantasygame.weapon.*;
import org.apache.log4j.Logger;

import java.util.Random;

public class ChoiceWeapon implements RandomChoice {

    private static final Logger LOG = Logger.getLogger(ChoiceWeapon.class);

    public Weapon getWeapon(int number) throws GetWeaponException {

        if(LOG.isDebugEnabled()) {
            LOG.debug("Trying to get weapon.");
        }

        if (number == 0) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return Saber.");
            }
            return new Saber(33, 150);
        } else if (number == 1) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return Sword.");
            }
            return new Sword(28, 155);
        } else if (number == 2) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return Axe.");
            }
            return new Axe(22, 170);
        } else if (number == 3) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return MagicStick.");
            }
            return new MagicStick(40, 140);
        } else if (number == 4) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return Cudgel.");
            }
            return new Cudgel(40, 155);
        } else if (number == 5) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return OrcSword.");
            }
            return new OrcSword(25, 155);
        } else if (number == 6) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return Spear.");
            }
            return new Spear(37, 149);
        } else if (number == 7) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Return MorningStar.");
            }
            return new Morningstar(44, 150);
        }
        LOG.warn("Throw GetWeaponException: \"Can`t get weapon\"");
        throw new GetWeaponException("Can`t get weapon.");
    }

    public int getRandomChoice() {
        LOG.debug("Getting random number.");
        return new Random().nextInt(8);
    }

}
