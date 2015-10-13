package testfantasygame.testweapon;

import org.junit.*;
import fantasygame.weapon.*;

public class TestCudgel {

        Cudgel cudgel;

        @Before
        public void setUp() {
            cudgel = new Cudgel(20, 30);
        }

        @Test
        public void testGetDamage() {
            int expected = 20;
            int result = cudgel.getDamage();
            Assert.assertEquals(expected, result);
        }

        @Test
        public void testGetCondition() {
            int expected = 30;
            int result = cudgel.getCondition();
            Assert.assertEquals(expected, result);
        }

        @After
        public void tearDown() {
            cudgel = null;
        }
}
