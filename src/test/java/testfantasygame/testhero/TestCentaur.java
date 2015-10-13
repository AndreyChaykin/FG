package testfantasygame.testhero;

import fantasygame.hero.*;
import org.junit.*;
import fantasygame.skill.DionysusMadness;
import fantasygame.weapon.*;
import fantasygame.weathewear.*;

public class TestCentaur {

    Centaur centaur;
    Elf elf;

    @Before
    public void setUp() {
        centaur = new Centaur("Grace", 200, 22, new Cudgel(10, 10), new WoodSagum(20));

    }

    @Test
    public void testGetName() {
        String expected = "Grace";
        String result = centaur.getName();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetLife() {
        int expected = 200;
        int result = centaur.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSetLife() {
        int expected = 400;
        centaur.setActualLife(400);
        int result = centaur.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetFullLife() {
        int expected = 200;
        int result = centaur.getFullLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetWeapon() {
        Weapon cudgel = new Cudgel(20, 20);
        Weapon resultingValue = centaur.getWeapon();
        Boolean result = cudgel.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetWeapon() {
        Weapon spear = new Spear(20, 20);
        centaur.setWeapon(spear);
        Weapon result = centaur.getWeapon();
        Assert.assertEquals(spear, result);
    }

    @Test
    public void testGetArmour() {
        Armour woodSagum = new WoodSagum(20);
        Armour resultingValue = centaur.getArmour();
        Boolean result = woodSagum.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testSetArmour() {
        Armour ringArmour = new RingArmour(20);
        centaur.setArmour(ringArmour);
        Armour result = centaur.getArmour();
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
        int result = centaur.standardKick(elf);
        Assert.assertNotEquals(notExpected, result);
    }

    @Test
    public void testSuperSkill() {
        elf = new Elf("elfName", 200, 22, new Axe(10, 10), new PlateArmour(20));
        int expected = 200 - DionysusMadness.SKILL;  //todo or shall i do centaur.getFullLife like method?
        int result = centaur.superSkill(elf);
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintLife() {
        //todo
    }

    @After
    public void tearDown() {
        centaur = null;
        elf = null;
    }
}


