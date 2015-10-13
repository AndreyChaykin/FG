package testfantasygame.testskill;

import org.junit.*;
import fantasygame.skill.Dragon;

public class TestDragon {

    Dragon dragon;

    @Before
    public void setUp() {
        dragon = new Dragon();
    }

    @Test
    public void testGetDamage() {
        int expected = 100;
        int result = dragon.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintAction() {
        //todo
    }

    @After
    public void tearDown() {
        dragon = null;
    }
}
