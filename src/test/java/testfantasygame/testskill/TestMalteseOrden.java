package testfantasygame.testskill;

import org.junit.*;
import fantasygame.skill.MalteseOrden;

public class TestMalteseOrden {

    MalteseOrden malteseOrden;

    @Before
    public void setUp() {
        malteseOrden = new MalteseOrden();
    }

    @Test
    public void testGetDamage() {
        int expected = 100;
        int result = malteseOrden.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintAction() {
        //todo
    }

    @After
    public void tearDown() {
        malteseOrden = null;
    }
}
