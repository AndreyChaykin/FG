package fantasygame.testchoiceheroandattributes;

import choiceheroandattributes.ChoiceArmor;
import choiceheroandattributes.ChoiceHero;
import exceptions.AbsentHeroException;
import geroes.*;
import org.junit.*;
import weapon.Axe;
import weapon.Weapon;
import weathewear.PlateArmour;

public class TestChoiceHero {

    ChoiceHero choiceHero = new ChoiceHero();

    @Before
    public void setUp() {

    }

    @Test
    @Ignore
    public void testEnterNum() {

    }

    @Test
    public void testGetEnteredHeroDwarf() throws AbsentHeroException {
        Dwarf expected = new Dwarf("dwarfName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getEnteredHero(1);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetEnteredHeroElf() throws AbsentHeroException {
        Elf expected = new Elf("elfName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getEnteredHero(2);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetEnteredHeroKnight() throws AbsentHeroException {
        Knight expected = new Knight("knightName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getEnteredHero(3);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetEnteredHeroMagician() throws AbsentHeroException {
        Magician expected = new Magician("magicianName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getEnteredHero(4);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetEnteredHeroOrc() throws AbsentHeroException {
        Orc expected = new Orc("orcName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getEnteredHero(5);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetEnteredHeroTroll() throws AbsentHeroException {
        Troll expected = new Troll("trollName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getEnteredHero(6);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetEnteredHeroCentaur() throws AbsentHeroException {
        Centaur expected = new Centaur("centaurName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getEnteredHero(7);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetEnteredHeroChimera() throws AbsentHeroException {
        Chimera expected = new Chimera("chimeraName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getEnteredHero(8);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetRandomHeroDwarf() throws AbsentHeroException {
        Dwarf expected = new Dwarf("dwarfName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getRandomHero(0);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetRandomHeroElf() throws AbsentHeroException {
        Elf expected = new Elf("elfName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getRandomHero(1);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetRandomHeroKnight() throws AbsentHeroException {
        Knight expected = new Knight("knightName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getRandomHero(2);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetRandomHeroMagician() throws AbsentHeroException {
        Magician expected = new Magician("magicianName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getRandomHero(3);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetRandomHeroOrc() throws AbsentHeroException {
        Orc expected = new Orc("orcName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getRandomHero(4);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetRandomHeroTroll() throws AbsentHeroException {
        Troll expected = new Troll("trollName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getRandomHero(5);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetRandomHeroCentaur() throws AbsentHeroException {
        Centaur expected = new Centaur("centaurName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getRandomHero(6);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetRandomHeroChimera() throws AbsentHeroException {
        Warrior expected = new Chimera("chimeraName", 1000, 22, new Axe(10, 10), new PlateArmour(20));
        Warrior resultingValue = choiceHero.getRandomHero(7);
        Boolean result = expected.getClass().isInstance(resultingValue);
        Assert.assertTrue(result);
    }

    @Test
    public void testGetRandomHeroWrongNumber() throws AbsentHeroException{
        Warrior result = choiceHero.getRandomHero(100);
        Assert.assertNotNull(result);
    }

    @Test
    @Ignore
    public void testIfHeroExist() {
        //todo make fields public static? or getter and setter for test?
    }

    @After
    public void tearDown() {

    }
}
