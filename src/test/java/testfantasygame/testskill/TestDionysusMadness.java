package testfantasygame.testskill;

import org.junit.*;
import fantasygame.skill.DionysusMadness;

public class TestDionysusMadness {

    DionysusMadness dionysusMadness;

    @Before
    public void setUp() {
        dionysusMadness = new DionysusMadness();
    }

    @Test
    public void testGetDamage() {
        int expected = 100;
        int result = dionysusMadness.getDamage();
        Assert.assertEquals(expected, result);
    }

    @Test
    @Ignore
    public void testPrintAction() {
        //todo
    }

    @After
    public void tearDown() {
        dionysusMadness = null;
    }
}

