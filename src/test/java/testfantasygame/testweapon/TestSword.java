package testfantasygame.testweapon;

import org.junit.*;
import fantasygame.weapon.*;

public class TestSword {

        Sword sword;

        @Before
        public void setUp() {
            sword = new Sword(20, 30);
        }

        @Test
        public void testGetDamage() {
            int expected = 20;
            int result = sword.getDamage();
            Assert.assertEquals(expected, result);
        }

        @Test
        public void testGetCondition() {
            int expected = 30;
            int result = sword.getCondition();
            Assert.assertEquals(expected, result);
        }

        @After
        public void tearDown() {
            sword = null;
        }
}
