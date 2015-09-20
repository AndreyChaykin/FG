package fantasygame.testchoiceheroandattributes;

import choiceheroandattributes.ChoiceArmor;
import exceptions.ChoiceArmorException;
import org.junit.*;
import weathewear.*;

public class TestChoiceArmor {
    ChoiceArmor choiceArmor;
//
//    if (number == 0) {
//        return new RingArmour(45);
//    } else if (number == 1) {
//        return new WoodSagum(40);
//    } else if (number == 2) {
//        return new PlateArmour(60);
//    } else if (number == 3) {
//        return new MagicSphere(30);
//    } else if (number == 4) {
//        return new BuffCoat(24);

    @Before
    public void setUp() {
        choiceArmor = new ChoiceArmor();
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
        int number = choiceArmor.getRandNum();
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
