package testfantasygame.testskill;

import org.junit.*;
import fantasygame.skill.Varg;

public class TestVarg {

    Varg varg;

    @Before
    public void setUp() {
        varg = new Varg();
    }

    @Test
    public void testGetDamage() {
        int expected = 100;
        int result = varg.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintAction() {
        //todo
    }

    @After
    public void tearDown() {
        varg = null;
    }

}
