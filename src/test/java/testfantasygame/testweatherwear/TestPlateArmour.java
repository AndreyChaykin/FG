package testfantasygame.testweatherwear;

import org.junit.*;
import fantasygame.weathewear.PlateArmour;


public class TestPlateArmour {

    PlateArmour plateArmour;

    @Before
    public void setUp() {
        plateArmour = new PlateArmour(100);
    }

    @Test
    public void testGetProtection() {
        int expected = 100;
        int result = plateArmour.getProtection();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore("Not implemented yet.")
    public void testSetProtection() {

    }

    @After
    public void tearDown() {
        plateArmour = null;
    }
}
