package fantasygame.testarena;

import arena.Battle;
import geroes.*;
import org.junit.*;
import weapon.Axe;
import weathewear.PlateArmour;

/**
 * @Autor Andrey Chaykin
 * @Since 13.09.2015
 */
public class TestBattle {

    Dwarf dwarf;
    Elf elf;
    Warrior expected;
    Warrior result;
    Battle battle;

    @BeforeClass
    public static void setUpClass() {

    }

    @Before
    public void setUp() {
        dwarf = new Dwarf("dwarfName", 200, 20, new Axe(20, 20), new PlateArmour(20));
        elf = new Elf("elfName", 200, 20, new Axe(20, 20), new PlateArmour(20));
        battle = new Battle();
    }

    @Test
    public void testFightFirstWarriorWin() {
        dwarf = new Dwarf("dwarfName", 20000, 20000, new Axe(20, 20), new PlateArmour(20));
        elf = new Elf("elfName", 200, 0, new Axe(0, 20), new PlateArmour(20));
        expected = dwarf;
        result = battle.fight(dwarf, elf);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFightSecondWarriorWin() {
        dwarf = new Dwarf("dwarfName", 20, 0, new Axe(0, 20), new PlateArmour(20));
        elf = new Elf("elfName", 200, 20000, new Axe(20, 20), new PlateArmour(20));
        expected = elf;
        result = battle.fight(dwarf, elf);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFightNoWinner() {
        dwarf = new Dwarf("dwarfName", 1, 20000, new Axe(2000, 20), new PlateArmour(1));
        elf = new Elf("elfName", 1, 20000, new Axe(2000, 20), new PlateArmour(1));
        expected = null;
        result = battle.fight(dwarf, elf);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testFirstWarriorNull() {
        expected = dwarf;
        result = battle.fight(null, dwarf);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSecondWarriorNull() {
        expected = dwarf;
        result = battle.fight(dwarf, null);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testBothHeroNull() {
        expected = null;
        result = battle.fight(null, null);
        Assert.assertEquals(expected, result);
    }

    @After
    public void tearDown() {
        dwarf = null;
        elf = null;
        expected = null;
        result = null;
        //todo do i need to create new dwarf and elf and them initialisation their reference as null?
    }

    @AfterClass
    public static void tearDownClass() {

    }


}
