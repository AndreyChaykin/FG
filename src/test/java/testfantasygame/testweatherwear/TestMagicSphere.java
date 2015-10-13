package testfantasygame.testweatherwear;

import org.junit.*;
import fantasygame.weathewear.MagicSphere;

public class TestMagicSphere {

    MagicSphere magicSphere;

    @Before
    public void setUp() {
        magicSphere = new MagicSphere(100);
    }

    @Test
    public void testGetProtection() {
        int expected = 100;
        int result = magicSphere.getProtection();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore("Not implemented yet.")
    public void testSetProtection() {

    }

    @After
    public void tearDown() {
        magicSphere = null;
    }
}
