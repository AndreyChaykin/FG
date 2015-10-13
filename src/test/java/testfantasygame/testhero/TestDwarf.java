package testfantasygame.testhero;

import fantasygame.weathewear.*;
import fantasygame.hero.*;
import fantasygame.skill.MountainSkill;
import fantasygame.weapon.*;
import org.junit.*;

public class TestDwarf {

    Dwarf dwarf;
    Elf elf;

    @Before
    public void setUp() {
        dwarf = new Dwarf("Rigmond", 200, 22, new Axe(10, 10), new PlateArmour(20));

    }

    @Test
    public void testGetName() {
        String expected = "Rigmond";
        String result = dwarf.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetLife() {
        int expected = 200;
        int result = dwarf.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetLife() {
        int expected = 400;
        dwarf.setActualLife(400);
        int result = dwarf.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetFullLife() {
        int expected = 200;
        int result = dwarf.getFullLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetWeapon() {
        Weapon axe = new Axe(20, 20);
        Weapon resultingValue = dwarf.getWeapon();
        boolean result = axe.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetWeapon() {
        Weapon cudgel = new Cudgel(20, 20);
        dwarf.setWeapon(cudgel);
        Weapon result = dwarf.getWeapon();
        Assert.assertEquals(cudgel, result);
    }

    @Test
    public void testGetArmour() {
        Armour plateArmour = new PlateArmour(20);
        Armour resultingValue = dwarf.getArmour();
        boolean result = plateArmour.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetArmour() {
        Armour ringArmour = new RingArmour(20);
        dwarf.setArmour(ringArmour);
        Armour result = dwarf.getArmour();
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
        elf = new Elf("elfName", 200, 2222, new Axe(1000, 10), new PlateArmour(20));
        int notExpected = 200;  //todo or shall i write 200?
        int result = dwarf.standardKick(elf);
        Assert.assertNotEquals(notExpected, result);
    }

    @Test
    public void testSuperSkill() {
        elf = new Elf("elfName", 200, 2, new Axe(1, 10), new PlateArmour(20));
        int expected = 200 - MountainSkill.SKILL;  //todo or shall i do dwarf.getFullLife like method?
        int result = dwarf.superSkill(elf);
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
        elf = null;
    }
}
