import fantasygame.choiceheroandattributes.ChoiceArmor;
import fantasygame.exceptions.ChoiceArmorException;
import fantasygame.weathewear.Armour;
import fantasygame.weathewear.WoodSagum;

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
