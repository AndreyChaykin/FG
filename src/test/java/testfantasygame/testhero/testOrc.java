package testfantasygame.testhero;

import fantasygame.hero.*;
import org.junit.*;
import fantasygame.skill.*;
import fantasygame.weapon.*;
import fantasygame.weathewear.*;

public class testOrc {

    Orc orc;
    Dwarf dwarf;

    @Before
    public void setUp() {
        orc = new Orc("Kurgum", 200, 22, new OrcSword(20, 20), new BuffCoat(20));
    }

    @Test
    public void testGetName() {
        String expected = "Kurgum";
        String result = orc.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetLife() {
        int expected = 200;
        int result = orc.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetLife() {
        int expected = 400;
        orc.setActualLife(400);
        int result = orc.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetFullLife() {
        int expected = 200;
        int result = orc.getFullLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetWeapon() {
        Weapon orcSword = new OrcSword(20, 20);
        Weapon resultingValue = orc.getWeapon();
        boolean result = orcSword.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetWeapon() {
        Weapon sword = new Sword(20, 20);
        orc.setWeapon(sword);
        Weapon result = orc.getWeapon();
        Assert.assertEquals(sword, result);
    }

    @Test
    public void testGetArmour() {
        Armour buffCoat = new BuffCoat(20);
        Armour resultingValue = orc.getArmour();
        boolean result = buffCoat.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetArmour() {
        Armour woodSagum = new WoodSagum(20);
        orc.setArmour(woodSagum);
        Armour result = orc.getArmour();
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
        int result = orc.standardKick(dwarf);
        Assert.assertNotEquals(notExpected, result);
    }

    @Test
    public void testSuperSkill() {
        dwarf = new Dwarf("dwarfName", 200, 22, new Axe(20, 20), new PlateArmour(20));
        int expected = 200 - Varg.SKILL;  //todo or shall i do dwarf.getFullLife like method?
        int result = orc.superSkill(dwarf);
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
        orc = null;
    }
}
