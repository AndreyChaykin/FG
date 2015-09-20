import choiceheroandattributes.ChoiceArmor;
import exceptions.ChoiceArmorException;
import geroes.Elf;
import geroes.Warrior;
import weapon.Axe;
import weathewear.Armour;
import weathewear.WoodSagum;

import java.util.Objects;

public class Testing {

    public static void main(String[] args) {
       try {
           ChoiceArmor choiceArmor = new ChoiceArmor();
           WoodSagum expected = new WoodSagum(45);
           Armour resultingValue = choiceArmor.getArmor(0);
           Boolean result;
           result = expected.getClass().isInstance(resultingValue);
           System.out.println(result);
       } catch (ChoiceArmorException e) {

       }
    }
}
