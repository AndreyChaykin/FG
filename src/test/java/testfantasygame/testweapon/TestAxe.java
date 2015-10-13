package testfantasygame.testweapon;

import org.junit.*;
import fantasygame.weapon.*;

public class TestAxe {

    Axe axe;

    @Before
    public void setUp() {
        axe = new Axe(20, 40);
    }

    @Test
    public void testGetDamage() {
        int expected = 20;
        int result = axe.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetCondition() {
        int expected = 40;
        int result = axe.getCondition();
        Assert.assertEquals(expected, result);
    }

    @After
    public void tearDown() {
        axe = null;
    }
}
