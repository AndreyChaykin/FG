package testfantasygame.testweatherwear;

import org.junit.*;
import fantasygame.weathewear.BuffCoat;

public class testBuffCoat {

    BuffCoat buffCoat;

    @Before
    public void setUp() {
        buffCoat = new BuffCoat(100);
    }

    @Test
    public void testGetProtection() {
        int expected = 100;
        int result = buffCoat.getProtection();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore("Not implemented yet.")
    public void testSetProtection() {

    }

    @After
    public void tearDown() {
        buffCoat = null;
    }
}
