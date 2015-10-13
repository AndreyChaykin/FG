package testfantasygame.testskill;

import org.junit.*;
import fantasygame.skill.PowerfulStrike;

public class TestPowerfulStrike {

    PowerfulStrike powerStrike;

    @Before
    public void setUp() {
        powerStrike = new PowerfulStrike();
    }

    @Test
    public void testGetDamage() {
        int expected = 100;
        int result = powerStrike.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintAction() {
        //todo
    }

    @After
    public void tearDown() {
        powerStrike = null;
    }
}
