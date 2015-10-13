package testfantasygame.testchoiceheroandattributes;

import fantasygame.choiceheroandattributes.ChoiceArmor;
import fantasygame.exceptions.ChoiceArmorException;
import org.junit.*;
import fantasygame.weathewear.*;

public class TestChoiceArmor {
    ChoiceArmor choiceArmor =  new ChoiceArmor(); //todo or shall do it in beforeclas?

    @Before
    public void setUp() {

    }

    @Test
    public void testGetArmorRingArmour() throws ChoiceArmorException {
        RingArmour expected = new RingArmour(45);
        Armour resultingValue = choiceArmor.getArmor(0);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetArmorWoodSagum() throws ChoiceArmorException {
        Armour expected = new WoodSagum(45);
        Armour resultingValue = choiceArmor.getArmor(1);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetArmorPlateArmour() throws ChoiceArmorException {
        Armour expected = new PlateArmour(45);
        Armour resultingValue = choiceArmor.getArmor(2);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetArmorMagicSphere() throws ChoiceArmorException {
        Armour expected = new MagicSphere(45);
        Armour resultingValue = choiceArmor.getArmor(3);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetArmorBuffCoat() throws ChoiceArmorException {
        Armour expected = new BuffCoat(45);
        Armour resultingValue = choiceArmor.getArmor(4);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test(expected = ChoiceArmorException.class)
    public void testChoiceArmourException() throws ChoiceArmorException {
        choiceArmor.getArmor(15);
    }

    @Test
    public void testCorrectRandomNumber() {
        int number = choiceArmor.getRandomChoice();
        boolean result = false;
        if (0 <= number && number < 5) {
            result = true;
        }
        Assert.assertTrue(result);
    }

    @After
    public void tearDown() {

    }
}
