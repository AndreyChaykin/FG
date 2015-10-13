package testfantasygame.testhero;


import fantasygame.hero.*;
import org.junit.*;
import fantasygame.skill.PowerfulStrike;
import fantasygame.weapon.*;
import fantasygame.weathewear.*;

public class TestTroll {

    Troll troll;
    Dwarf dwarf;

    @Before
    public void setUp() {
        troll = new Troll("Kee", 200, 22, new Spear(20, 20), new BuffCoat(20));
    }

    @Test
    public void testGetName() {
        String expected = "Kee";
        String result = troll.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetLife() {
        int expected = 200;
        int result = troll.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetLife() {
        int expected = 400;
        troll.setActualLife(400);
        int result = troll.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetFullLife() {
        int expected = 200;
        int result = troll.getFullLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetWeapon() {
        Weapon spear = new Spear(20, 20);
        Weapon resultingValue = troll.getWeapon();
        boolean result = spear.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetWeapon() {
        Weapon sword = new Sword(20, 20);
        troll.setWeapon(sword);
        Weapon result = troll.getWeapon();
        Assert.assertEquals(sword, result);
    }

    @Test
    public void testGetArmour() {
        Armour buffCoat = new BuffCoat(20);
        Armour resultingValue = troll.getArmour();
        boolean result = buffCoat.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetArmour() {
        Armour plateArmour = new PlateArmour(20);
        troll.setArmour(plateArmour);
        Armour result = troll.getArmour();
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
        dwarf = new Dwarf("dwarfName", 200, 22, new Axe(20, 20), new PlateArmour(20));
        int notExpected = dwarf.getFullLife();  //todo or shall i write 200?
        int result = troll.standardKick(dwarf);
        Assert.assertNotEquals(notExpected, result);
    }

    @Test
    public void testSuperSkill() {
        dwarf = new Dwarf("dwarfName", 200, 22, new Axe(20, 20), new PlateArmour(20));
        int expected = 200 - PowerfulStrike.SKILL;  //todo or shall i do dwarf.getFullLife like method?
        int result = troll.superSkill(dwarf);
        Assert.assertNotEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintLife() {
        //todo
    }

    @After
    public void tearDown() {
        dwarf = null;
        troll = null;
    }
}
