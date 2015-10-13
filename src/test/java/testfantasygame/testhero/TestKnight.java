package testfantasygame.testhero;

import fantasygame.hero.*;
import fantasygame.skill.Dragon;
import fantasygame.weapon.*;
import org.junit.*;
import fantasygame.weathewear.*;

public class TestKnight {

        Knight knight;
        Dwarf dwarf;

        @Before
        public void setUp() {
                knight = new Knight("John Snow", 200, 22, new Sword(20, 20), new PlateArmour(20));
        }

        @Test
        public void testGetName() {
                String expected = "John Snow";
                String result = knight.getName();
                Assert.assertEquals(expected, result);
        }

        @Test
        public void testGetLife() {
                int expected = 200;
                int result = knight.getActualLife();
                Assert.assertEquals(expected, result);
        }

        @Test
        public void testSetLife() {
                int expected = 400;
                knight.setActualLife(400);
                int result = knight.getActualLife();
                Assert.assertEquals(expected, result);
        }

        @Test
        public void testGetFullLife() {
                int expected = 200;
                int result = knight.getFullLife();
                Assert.assertEquals(expected, result);
        }

        @Test
        public void testGetWeapon() {
                Weapon expected = new Sword(20, 20);
                Weapon resultingValue = knight.getWeapon();
                boolean result = expected.getClass().isInstance(resultingValue);
                Assert.assertTrue(result);
        }

        @Test
        public void testSetWeapon() {
                Weapon saber = new Saber(20, 20);
                knight.setWeapon(saber);
                Weapon result = knight.getWeapon();
                Assert.assertEquals(saber, result);
        }

        @Test
        public void testGetArmour() {
                Armour plateArmour = new PlateArmour(20);
                Armour resultingValue = knight.getArmour();
                Boolean result = plateArmour.getClass().isInstance(resultingValue);
                Assert.assertTrue(result);
        }

        @Test
        public void testSetArmour() {
                Armour ringArmour = new RingArmour(20);
                knight.setArmour(ringArmour);
                Armour result = knight.getArmour();
                Assert.assertEquals(ringArmour, result);
        }

        @Test
        @Ignore
        public void testPrintArmAndWeapon() {
                //todo
        }

        @Test
        @Ignore
        public void testTriumphSpeech() {
                //todo
        }

        @Test
        @Ignore
        public void testKickReturnStandardKickMethod() {
                //todo how can i check it is right method calling or not?
        }

        @Test
        @Ignore
        public void testKickReturnSkillMethod() {
                //todo how can i check it is right method calling or not?
        }

        @Test
        public void testStandardKick() {
                dwarf = new Dwarf("dwarfName", 200, 22, new Axe(20, 20), new RingArmour(20));
                int notExpected = dwarf.getFullLife();  //todo or shall i write 200?
                int result = knight.standardKick(dwarf);
                Assert.assertNotEquals(notExpected, result);
        }

        @Test
        public void testSuperSkill() {
                dwarf = new Dwarf("dwarfName", 200, 22, new Axe(20, 20), new RingArmour(20));
                int expected = 200 - Dragon.SKILL;  //todo or shall i do dwarf.getFullLife like method?
                int result = knight.superSkill(dwarf);
                Assert.assertEquals(expected, result);
        }

        @Test
        @Ignore
        public void testPrintLife() {
                //todo
        }

        @After
        public void tearDown() {
                dwarf = null;
                knight = null;
        }
}
