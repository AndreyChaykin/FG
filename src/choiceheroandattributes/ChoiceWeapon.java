package choiceheroandattributes;

import exceptions.GetWeaponException;
import weapon.*;

import java.util.Random;

public class ChoiceWeapon {

    public Weapon getWeapon(int number) throws GetWeaponException {

        if (number == 0) {
            return new Saber(33, 150);
        } else if (number == 1) {
            return new Sword(28, 155);
        } else if (number == 2) {
            return new Axe(22, 170);
        } else if (number == 3) {
            return new MagicStick(40, 140);
        } else if (number == 4) {
            return new Cudgel(40, 155);
        } else if (number == 5) {
            return new OrcSword(25, 155);
        } else if (number == 6) {
            return new Spear(37, 149);
        } else if (number == 7) {
            return new Morningstar(44, 150);
        }
    throw new GetWeaponException("Can`t get weapon.");
    }

    public int getRandNum() {
        return new Random().nextInt(8);
    }

}
