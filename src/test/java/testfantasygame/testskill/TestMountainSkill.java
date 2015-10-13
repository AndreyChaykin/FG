package testfantasygame.testskill;

import fantasygame.skill.MountainSkill;
import org.junit.*;

public class TestMountainSkill {

    MountainSkill mountain;

    @Before
    public void setUp() {
        mountain = new MountainSkill();
    }

    @Test
    public void testGetDamage() {
        int expected = 100;
        int result = mountain.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintAction() {
        //todo
    }

    @After
    public void tearDown() {
        mountain = null;
    }
}
