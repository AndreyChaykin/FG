package testfantasygame.testhero;

import fantasygame.hero.*;
import org.junit.*;
import fantasygame.skill.Darkness;
import fantasygame.weapon.*;
import fantasygame.weathewear.*;

public class TestChimera {
    Chimera chimera;
    Elf elf;

    @Before
    public void setUp() {
        chimera = new Chimera("Dior", 200, 22, new Morningstar(10, 10), new MagicSphere(20));

    }

    @Test
    public void testGetName() {
        String expected = "Dior";
        String result = chimera.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetLife() {
        int expected = 200;
        int result = chimera.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetLife() {
        int expected = 400;
        chimera.setActualLife(400);
        int result = chimera.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetFullLife() {
        int expected = 200;
        int result = chimera.getFullLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetWeapon() {
        Weapon morningstar = new Morningstar(20, 20);
        Weapon resultingValue = chimera.getWeapon();
        boolean result = morningstar.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetWeapon() {
        Weapon spear = new Spear(20, 20);
        chimera.setWeapon(spear);
        Weapon result = chimera.getWeapon();
        Assert.assertEquals(spear, result);
    }

    @Test
    public void testGetArmour() {
        Armour magicSphere = new MagicSphere(20);
        Armour resultingValue = chimera.getArmour();
        Boolean result = magicSphere.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetArmour() {
        Armour ringArmour = new RingArmour(20);
        chimera.setArmour(ringArmour);
        Armour result = chimera.getArmour();
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
        elf = new Elf("elfName", 200, 22, new Axe(10, 10), new PlateArmour(1));
        int notExpected = 200;  //todo or shall i write 200?
        int result = chimera.standardKick(elf);
        Assert.assertNotEquals(notExpected, result);
    }

    @Test
    public void testSuperSkill() {
        elf = new Elf("elfName", 200, 22, new Axe(10, 10), new PlateArmour(1));
        int expected = 200 - Darkness.SKILL;  //todo or shall i do chimera.getFullLife like method?
        int result = chimera.superSkill(elf);
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintLife() {
        //todo
    }

    @After
    public void tearDown() {
        chimera = null;
        elf = null;
    }
}
