package testfantasygame.testskill;

import org.junit.*;
import fantasygame.skill.Darkness;

/**
 * @Autor Andrey Chaykin
 * @Since 15.09.15
 */
public class TestDarkenes {

    Darkness darkenes;

    @Before
    public void setUp() {
        darkenes = new Darkness();
    }

    @Test
    public void testGetDamage() {
        int expected = 100;
        int result = darkenes.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintAction() {
        //todo
    }

    @After
    public void tearDown() {
        darkenes = null;
    }
}
