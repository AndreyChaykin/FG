package testfantasygame.testskill;

import org.junit.*;
import fantasygame.skill.Necromancy;

public class TestNecromancy {

    Necromancy necromancy;

    @Before
    public void setUp() {
        necromancy = new Necromancy();
    }

    @Test
    public void testGetDamage() {
        int expected = 100;
        int result = necromancy.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintAction() {
        //todo
    }

    @After
    public void tearDown() {
        necromancy = null;
    }
}
