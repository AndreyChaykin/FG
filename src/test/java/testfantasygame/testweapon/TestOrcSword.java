package testfantasygame.testweapon;

import org.junit.*;
import fantasygame.weapon.*;

public class TestOrcSword {

        OrcSword orcSword;

        @Before
        public void setUp() {
            orcSword = new OrcSword(20, 30);
        }

        @Test
        public void testGetDamage() {
            int expected = 20;
            int result = orcSword.getDamage();
            Assert.assertEquals(expected, result);
        }

        @Test
        public void testGetCondition() {
            int expected = 30;
            int result = orcSword.getCondition();
            Assert.assertEquals(expected, result);
        }

        @After
        public void tearDown() {
            orcSword = null;
        }
}
