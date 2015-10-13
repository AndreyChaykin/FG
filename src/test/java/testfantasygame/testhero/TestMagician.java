package testfantasygame.testhero;

import fantasygame.hero.*;
import org.junit.*;
import fantasygame.skill.Necromancy;
import fantasygame.weapon.*;
import fantasygame.weathewear.*;

public class TestMagician {

    Magician magician;
    Dwarf dwarf;

    @Before
    public void setUp() {
        magician = new Magician("Thor", 200, 22, new MagicStick(20, 20), new MagicSphere(20));
    }

    @Test
    public void testGetName() {
        String expected = "Thor";
        String result = magician.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetLife() {
        int expected = 200;
        int result = magician.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetLife() {
        int expected = 400;
        magician.setActualLife(400);
        int result = magician.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetFullLife() {
        int expected = 200;
        int result = magician.getFullLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetWeapon() {
        Weapon magicStick = new MagicStick(20, 20);
        Weapon resultingValue = magician.getWeapon();
        boolean result = magicStick.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetWeapon() {
        Weapon saber = new Saber(20, 20);
        magician.setWeapon(saber);
        Weapon result = magician.getWeapon();
        Assert.assertEquals(saber, result);
    }

    @Test
    public void testGetArmour() {
        Armour magicSphere = new MagicSphere(20);
        Armour resultingValue = magician.getArmour();
        boolean result = magicSphere.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetArmour() {
        Armour woodSagum = new WoodSagum(20);
        magician.setArmour(woodSagum);
        Armour result = magician.getArmour();
        Assert.assertEquals(woodSagum, result);
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
        dwarf = new Dwarf("dwarfName", 200, 22, new Axe(20, 20), new PlateArmour(20));
        int notExpected = dwarf.getFullLife();  //todo or shall i write 200?
        int result = magician.standardKick(dwarf);
        Assert.assertNotEquals(notExpected, result);
    }

    @Test
    public void testSuperSkill() {
        dwarf = new Dwarf("dwarfName", 200, 22, new Axe(20, 20), new PlateArmour(20));
        int expected = 200 - Necromancy.SKILL;  //todo or shall i do dwarf.getFullLife like method?
        int result = magician.superSkill(dwarf);
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
        magician = null;
    }
}
