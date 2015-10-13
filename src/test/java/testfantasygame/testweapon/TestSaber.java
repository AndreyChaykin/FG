package testfantasygame.testweapon;

import org.junit.*;
import fantasygame.weapon.*;

public class TestSaber {

        Saber saber;

        @Before
        public void setUp() {
            saber = new Saber(20, 30);
        }

        @Test
        public void testGetDamage() {
            int expected = 20;
            int result = saber.getDamage();
            Assert.assertEquals(expected, result);
        }

        @Test
        public void testGetCondition() {
            int expected = 30;
            int result = saber.getCondition();
            Assert.assertEquals(expected, result);
        }

        @After
        public void tearDown() {
            saber = null;
        }
}
