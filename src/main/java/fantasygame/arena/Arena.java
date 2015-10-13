package fantasygame.arena;

import fantasygame.exceptions.*;
import fantasygame.hero.*;
import fantasygame.choiceheroandattributes.*;
import fantasygame.writer.WriteInFile;

import java.util.ArrayList;
import java.util.List;

public class Arena {

    public Arena(ChiefJustice magistrate) {
        this.magistrate = magistrate;
    }

    ChiefJustice magistrate;

    public void startGame() {

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
        magistrate.askForRecoverHeroesLife(halfWinners.get(0), halfWinners.get(1));  //todo if null
        recoverHeroLife(halfWinners);

        magistrate.sayBeginFinalBattle();
        Warrior champion = fight(halfWinners.get(0), halfWinners.get(1));

        magistrate.congratulationChampion(champion);
        fw.writeWhoChampion(champion);
        Warrior.triumphSpeech(champion);
    }

    public void recoverHeroLife(List<Warrior> list) {
        Boolean answer;
        try {
            answer = new RecoveryRoom().askForHeroRecover(new RecoveryRoom().enterAnswer());
            if (answer) {
                for (int i = 0; i < list.size(); i++) {
                    new RecoveryRoom().recoverLife(list.get(i));
                }
            }
        } catch (HeroRecoverException e) {
            e.printStackTrace();
        }
    }
//
//    public Warrior createHero() {
//        Warrior warrior = null;
//        try {
//            warrior = new ChoiceHero().getHero(new ChoiceHero().getRandomChoice());
//            magistrate.welcomeHero(warrior);
//            warrior.salutationSpeech();
//            magistrate.printHeroWeaponAndArmour(warrior);
//        } catch (AbsentHeroException e) {
//            e.printStackTrace();
//        }
//        return warrior;
//    }

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
}
