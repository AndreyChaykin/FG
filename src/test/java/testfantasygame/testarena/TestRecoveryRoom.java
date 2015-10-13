package testfantasygame.testarena;

import fantasygame.arena.RecoveryRoom;
import fantasygame.exceptions.HeroRecoverException;
import fantasygame.hero.Dwarf;
import org.junit.*;
import fantasygame.weapon.Axe;
import fantasygame.weathewear.PlateArmour;

public class TestRecoveryRoom {

    RecoveryRoom recover = new RecoveryRoom();

    @Before
    public void setUp() {

    }

    @Test
    public void testRecoverLife() {
        Dwarf dwarf = new Dwarf("dwarfName", 200, 20, new Axe(20, 20), new PlateArmour(20));
        dwarf.setActualLife(50);
        recover.recoverLife(dwarf);
        int expected = 200;
        int result = dwarf.getActualLife();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testAskForHeroRecoverSayYes() throws HeroRecoverException {
        //todo if i don`t want to catch exc in this method i throw it faraway?
        Boolean expected = true;
        Boolean result = recover.askForHeroRecover("yes");
        Assert.assertEquals(expected, result);
        //todo scanner doesnt close
    }

    @Test
    public void testAskForHeroRecoverSayNo() throws HeroRecoverException {
        //todo if i don`t want to catch exc in this method i throw it faraway?
        Boolean expected = false;
        Boolean result = recover.askForHeroRecover("no");
        Assert.assertEquals(expected, result);
        //todo scanner doesnt close
        //todo another time with wrapper
    }

    @Test(timeout = 1000)
    public void testAskForHeroRecoverTimeoutSayYes() throws HeroRecoverException {
        Boolean expected = true;
        Boolean result = recover.askForHeroRecover("yes");
        Assert.assertEquals(expected, result);
    }

    @Test(timeout = 1000)
    public void testAskForHeroRecoverTimeoutSayNo() throws HeroRecoverException {
        Boolean expected = false;
        Boolean result = recover.askForHeroRecover("no");
        Assert.assertEquals(expected, result);
    }

    @Ignore
    @Test(expected = HeroRecoverException.class)
    public void testAskForHeroRecover() {
        //todo how to throw exception

    }

    @Test
    @Ignore("cant check scanner")
    public void testEnterAnswer() {
        //todo
    }

    @After
    public void tearDown() {

    }
}
