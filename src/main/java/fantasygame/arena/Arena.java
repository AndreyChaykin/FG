package fantasygame.arena;

import fantasygame.exceptions.*;
import fantasygame.hero.*;
import fantasygame.choiceheroandattributes.*;
import fantasygame.writer.WriteInFile;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

import static fantasygame.ClassNameUtil.getCurrentClassName;
import static fantasygame.arena.RecoveryRoom.recoverHeroLife;
import static org.apache.log4j.PropertyConfigurator.configure;

public class Arena {

    public Arena(ChiefJustice magistrate) {
        this.magistrate = magistrate;
    }

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());  //todo shall i write logs in this file?
    private ChiefJustice magistrate;

    public void startGame() {
//        PropertyConfigurator.configure("./log4j.properties");  //todo read about properties
        List<Warrior> warriorList = new ArrayList<Warrior>();

        WriteInFile fw = new WriteInFile();
        fw.printDateBeginningBattle();

        magistrate.salutationSpeech();

        magistrate.askingForMakeChoice();

        Warrior firstWarrior = null;
        try {
            firstWarrior = new ChoiceHero().getHero(new ChoiceHero().enterNumber());
            magistrate.welcomeHero(firstWarrior);
            firstWarrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(firstWarrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        } catch (EnterNumberException e) {
            e.printStackTrace();
        }

        warriorList.add(firstWarrior);
        fw.writeWhichHeroUserChose(firstWarrior);

        for (int i = 1; i < 8; i++) {
            warriorList.add(createRandomHero());
        }

        fw.writeListOfHeroes(warriorList);

        List<Warrior> firstRoundWinners = new ArrayList<Warrior>();
        for (int i = 1; i < warriorList.size(); i = i + 2) {
            Warrior warrior = fight(warriorList.get(i - 1), warriorList.get(i));
            if (warrior != null) {
                firstRoundWinners.add(warrior);
            }
        }

        fw.writeListOfHeroes(firstRoundWinners);
        magistrate.askForRecoverHeroesLife();
        recoverHeroLife(firstRoundWinners);

        magistrate.saySemifinalsBattleBegin();

        List<Warrior> halfWinners = new ArrayList<Warrior>();
        for (int i = 1; i < firstRoundWinners.size(); i = i + 2) {
            Warrior warrior = fight(firstRoundWinners.get(i - 1), firstRoundWinners.get(i));
            if (warrior != null) {
                halfWinners.add(warrior);
            }
        }

        fw.writeListOfHeroes(halfWinners);

        magistrate.askForRecoverHeroesLife(halfWinners);
        recoverHeroLife(halfWinners);

        magistrate.sayBeginFinalBattle();
        Warrior champion = fight(halfWinners);

        magistrate.congratulationChampion(champion);
        fw.writeWhoChampion(champion);
        Warrior.triumphSpeech(champion);
    }

    public Warrior createRandomHero() {
        Warrior warrior = null;
        try {
            warrior = new ChoiceHero().getRandomHero(new ChoiceHero().getRandomChoice());
            magistrate.welcomeHero(warrior);
            warrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(warrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        }
        return warrior;
    }

    public Warrior fight(Warrior firstWarrior, Warrior secondWarrior) {
        magistrate.sayReadyForBattle(firstWarrior, secondWarrior);
        magistrate.sayBeginBattle(firstWarrior, secondWarrior);
        Warrior winner = new Battle().fight(firstWarrior, secondWarrior);
        magistrate.sayWhoWinner(winner);
        Warrior.triumphSpeech(winner);
        return winner;
    }

    public Warrior fight(List<Warrior> warriors) {
        Warrior firstWarrior = null;
        Warrior secondWarrior = null;

        if (warriors.get(0) != null) {
            firstWarrior = warriors.get(0);
        }
        if (warriors.get(1) != null) {
            secondWarrior = warriors.get(1);
        }
        magistrate.sayReadyForBattle(firstWarrior, secondWarrior);
        magistrate.sayBeginBattle(firstWarrior, secondWarrior);
        Warrior winner = new Battle().fight(firstWarrior, secondWarrior);
        magistrate.sayWhoWinner(winner);
        Warrior.triumphSpeech(winner);
        return winner;
    }
}
