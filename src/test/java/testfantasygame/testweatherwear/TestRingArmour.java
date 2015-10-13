package testfantasygame.testweatherwear;

import org.junit.*;
import fantasygame.weathewear.RingArmour;

public class TestRingArmour {

    RingArmour ringArmour;

    @Before
    public void setUp() {
        ringArmour = new RingArmour(100);
    }

    @Test
    public void testGetProtection() {
        int expected = 100;
        int result = ringArmour.getProtection();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore("Not implemented yet.")
    public void testSetProtection() {

    }

    @After
    public void tearDown() {
        ringArmour = null;
    }
}
