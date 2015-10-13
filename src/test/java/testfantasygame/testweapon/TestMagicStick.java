package testfantasygame.testweapon;

import org.junit.*;
import fantasygame.weapon.*;

public class TestMagicStick {

    MagicStick magicStick;

    @Before
    public void setUp() {
        magicStick = new MagicStick(20, 30);
    }

    @Test
    public void testGetDamage() {
        int expected = 20;
        int result = magicStick.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetCondition() {
        int expected = 30;
        int result = magicStick.getCondition();
        Assert.assertEquals(expected, result);
    }

    @After
    public void tearDown() {
        magicStick = null;
    }

}
