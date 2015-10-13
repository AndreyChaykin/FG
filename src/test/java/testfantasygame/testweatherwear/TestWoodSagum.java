package testfantasygame.testweatherwear;

import org.junit.*;
import fantasygame.weathewear.WoodSagum;

public class TestWoodSagum {

    WoodSagum woodSagum;

    @Before
    public void setUp() {
        woodSagum = new WoodSagum(100);
    }

    @Test
    public void testGetProtection() {
        int expected = 100;
        int result = woodSagum.getProtection();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore("Not implemented yet.")
    public void testSetProtection() {

    }

    @After
    public void tearDown() {
        woodSagum = null;
    }
}
