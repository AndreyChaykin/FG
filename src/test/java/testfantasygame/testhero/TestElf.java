package testfantasygame.testhero;

import fantasygame.hero.*;
import fantasygame.skill.Dragon;
import fantasygame.weapon.*;
import org.junit.*;
import fantasygame.weathewear.*;


public class TestElf {

    Elf elf;
    Dwarf dwarf;

    @Before
    public void setUp() {
        elf = new Elf("Ei Lori di Cree", 200, 22, new Saber(10, 10), new WoodSagum(10));
    }

    @Test
    public void testGetName() {
        String expected = "Ei Lori di Cree";
        String result = elf.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetActualLife() {
        int expected = 200;
        int result = elf.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetLife() {
        int expected = 400;
        elf.setActualLife(400);
        int result = elf.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetFullLife() {
        int expected = 200;
        int result = elf.getFullLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetWeapon() {
        Weapon saber = new Saber(20, 20);
        Weapon resultingValue = elf.getWeapon();
        boolean result = saber.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetWeapon() {
        Weapon sword = new Sword(20, 20);
        elf.setWeapon(sword);
        Weapon resultingValue = elf.getWeapon();
        Assert.assertEquals(sword, resultingValue);

    }

    @Test
    public void testGetArmour() {
        Armour woodSagum = new WoodSagum(20);
        Armour resultingValue = elf.getArmour();
        boolean result = woodSagum.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetArmour() {
        Armour plateArmour = new PlateArmour(20);
        elf.setArmour(plateArmour);
        Armour result = elf.getArmour();
        Assert.assertEquals(plateArmour, result);
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
        dwarf = new Dwarf("dwarfName", 200, 22, new Saber(10, 10), new WoodSagum(10));
        int notExpected = dwarf.getFullLife();  //todo or shall i write 200?
        int result = elf.standardKick(dwarf);
        Assert.assertNotEquals(notExpected, result);
    }

    @Test
    public void testSuperSkill() {
        dwarf = new Dwarf("dwarfName", 200, 22, new Saber(10, 10), new WoodSagum(10));
        int expected = 200 - Dragon.SKILL;  //todo or shall i do dwarf.getFullLife like method?
        int result = elf.superSkill(dwarf);
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
