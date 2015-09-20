package choiceheroandattributes;

import exceptions.ChoiceArmorException;
import weathewear.Armour;
import weathewear.*;

import java.util.Random;

public class ChoiceArmor {

    public int getRandNum() {
        int result = new Random().nextInt(5);
        return result;
    }

    public Armour getArmor(int number) throws ChoiceArmorException {

        if (number == 0) {
            return new RingArmour(45);
        } else if (number == 1) {
            return new WoodSagum(40);
        } else if (number == 2) {
            return new PlateArmour(60);
        } else if (number == 3) {
            return new MagicSphere(30);
        } else if (number == 4) {
            return new BuffCoat(24);
        } //todo choice and throw
        throw new ChoiceArmorException("Can`t get armour");
    }
}
