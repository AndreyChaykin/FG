package fantasygame.testchoiceheroandattributes;

import choiceheroandattributes.ChoiceWeapon;
import exceptions.GetWeaponException;
import org.junit.*;
import weapon.*;

public class TestChoiceWeapon {

    ChoiceWeapon choiceWeapon = new ChoiceWeapon();

    @Before
    public void setUp() {

    }

    @Test
    public void testGetWeaponSaber() throws GetWeaponException {
        Weapon expected = new Saber(90, 30);
        Weapon resultingValue = choiceWeapon.getWeapon(0);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetWeaponSword() throws GetWeaponException {
        Weapon expected = new Sword(90, 30);
        Weapon resultingValue = choiceWeapon.getWeapon(1);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetWeaponAxe() throws GetWeaponException {
        Weapon expected = new Axe(90, 30);
        Weapon resultingValue = choiceWeapon.getWeapon(2);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetWeaponMagicStick() throws GetWeaponException {
        Weapon expected = new MagicStick(90, 30);
        Weapon resultingValue = choiceWeapon.getWeapon(3);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetWeaponCudgel() throws GetWeaponException {
        Weapon expected = new Cudgel(90, 30);
        Weapon resultingValue = choiceWeapon.getWeapon(4);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetWeaponOrcSword() throws GetWeaponException {
        Weapon expected = new OrcSword(90, 30);
        Weapon resultingValue = choiceWeapon.getWeapon(5);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetWeaponSpear() throws GetWeaponException {
        Weapon expected = new Spear(90, 30);
        Weapon resultingValue = choiceWeapon.getWeapon(6);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetWeaponMorningStar() throws GetWeaponException {
        Weapon expected = new Morningstar(90, 30);
        Weapon resultingValue = choiceWeapon.getWeapon(7);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test(expected = GetWeaponException.class)
    public void testGetWeaponException() throws GetWeaponException {
        choiceWeapon.getWeapon(100);
    }

    @Test
    public void testGetRunNumbCorrectValue() {
        int number = choiceWeapon.getRandNum();
        boolean result = false;
        if (0 <= number && number < 8) {
            result = true;
        }
        Assert.assertTrue(result);
    }


    @After
    public void tearDown() {

    }
}
