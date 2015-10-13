package fantasygame.choiceheroandattributes;

import fantasygame.exceptions.GetWeaponException;
import fantasygame.weapon.*;
import org.apache.log4j.Logger;

import java.util.Random;

public class ChoiceWeapon implements RandomChoice {

    private static final Logger LOG = Logger.getLogger(ChoiceWeapon.class);

    public Weapon getWeapon(int number) throws GetWeaponException {

        LOG.debug("Trying to get weapon.");

        if (number == 0) {
            LOG.debug("Get Saber.");
            return new Saber(33, 150);
        } else if (number == 1) {
            LOG.debug("Get Sword.");
            return new Sword(28, 155);
        } else if (number == 2) {
            LOG.debug("Get Axe.");
            return new Axe(22, 170);
        } else if (number == 3) {
            LOG.debug("Get MagicStick.");
            return new MagicStick(40, 140);
        } else if (number == 4) {
            LOG.debug("Get Cudgel.");
            return new Cudgel(40, 155);
        } else if (number == 5) {
            LOG.debug("Get OrcSword.");
            return new OrcSword(25, 155);
        } else if (number == 6) {
            LOG.debug("Get Spear.");
            return new Spear(37, 149);
        } else if (number == 7) {
            LOG.debug("Get MorningStar.");
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
