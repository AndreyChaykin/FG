package arena;

import exceptions.AbsentHeroException;
import exceptions.EnterNumberException;
import exceptions.HeroRecoverException;
import geroes.ChiefJustice;
import geroes.Warrior;
import choiceheroandattributes.*;

public class Arena {

    public void startGame() {

        ChiefJustice magistrate = new ChiefJustice();

        magistrate.salutationSpeech();

        magistrate.askingForMakeChoice();
        Warrior firstWarrior = null;

        try {
            firstWarrior = new ChoiceHero().getEnteredHero(new ChoiceHero().enterNum());
            magistrate.welcomeHero(firstWarrior);
            firstWarrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(firstWarrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        } catch (EnterNumberException e) {
            e.printStackTrace();
        }


        magistrate.askingForMakeChoice();

        Warrior secondWarrior = null;
        try {
            secondWarrior = new ChoiceHero().getEnteredHero(new ChoiceHero().enterNum());
            magistrate.welcomeHero(secondWarrior);
            secondWarrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(secondWarrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        } catch (EnterNumberException e) {
            e.printStackTrace();
        }

        magistrate.sayReadyForBattle(firstWarrior, secondWarrior);
        magistrate.sayBeginBattle(firstWarrior, secondWarrior);
        Warrior firstWinner = new Battle().fight(firstWarrior, secondWarrior);

        magistrate.sayWhoWinner(firstWinner);

        if (firstWinner != null) {
            firstWinner.triumphSpeech();
        }

        Warrior thirdWarrior = null;
        try {
            thirdWarrior = new ChoiceHero().getRandomHero(new ChoiceHero().getHeroNumber());
            magistrate.welcomeHero(thirdWarrior);
            thirdWarrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(thirdWarrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        }

        Warrior fourthWarrior = null;
        try {
            fourthWarrior = new ChoiceHero().getRandomHero(new ChoiceHero().getHeroNumber());
            magistrate.welcomeHero(fourthWarrior);
            fourthWarrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(fourthWarrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        }


        magistrate.sayReadyForBattle(thirdWarrior, fourthWarrior);
        magistrate.sayBeginBattle(thirdWarrior, fourthWarrior);

        Warrior secondWinner = new Battle().fight(thirdWarrior, fourthWarrior);
        magistrate.sayWhoWinner(secondWinner);

        if (secondWinner != null) {
            secondWinner.triumphSpeech();
        }

        Warrior fifthWarrior = null;
        try {
            fifthWarrior = new ChoiceHero().getRandomHero(new ChoiceHero().getHeroNumber());
            magistrate.welcomeHero(fifthWarrior);
            fifthWarrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(fifthWarrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        }

        Warrior sixthWarrior = null;
        try {
            sixthWarrior = new ChoiceHero().getRandomHero(new ChoiceHero().getHeroNumber());
            magistrate.welcomeHero(sixthWarrior);
            sixthWarrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(sixthWarrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        }

        magistrate.sayReadyForBattle(fifthWarrior, sixthWarrior);
        magistrate.sayBeginBattle(fifthWarrior, sixthWarrior);

        Warrior thirdWinner = new Battle().fight(fifthWarrior, sixthWarrior);
        magistrate.sayWhoWinner(thirdWinner);

        if (thirdWinner != null) {
            thirdWinner.triumphSpeech();
        }
        System.out.println("------------------------------------------------------------------------");

        Warrior seventhWarrior = null;
        try {
            seventhWarrior = new ChoiceHero().getRandomHero(new ChoiceHero().getHeroNumber());

            magistrate.welcomeHero(seventhWarrior);
            seventhWarrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(seventhWarrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        }

        Warrior eighthWarrior = null;
        try {
            eighthWarrior = new ChoiceHero().getRandomHero(new ChoiceHero().getHeroNumber());
            magistrate.welcomeHero(eighthWarrior);
            eighthWarrior.salutationSpeech();
            magistrate.printHeroWeaponAndArmour(eighthWarrior);
        } catch (AbsentHeroException e) {
            e.printStackTrace();
        }

        magistrate.sayReadyForBattle(seventhWarrior, eighthWarrior);
        magistrate.sayBeginBattle(seventhWarrior, eighthWarrior);

        Warrior fourthWinner = new Battle().fight(seventhWarrior, eighthWarrior);
        magistrate.sayWhoWinner(fourthWinner);

        if (fourthWinner != null) {
            fourthWinner.triumphSpeech();
        }

        magistrate.askForRecoverHeroesLife();
        Boolean answerBeforeSemiFight;
        try {
            answerBeforeSemiFight = new RecoveryRoom().askForHeroRecover(new RecoveryRoom().enterAnswer());
            if (answerBeforeSemiFight) {
                new RecoveryRoom().recoverLife(firstWinner);
                new RecoveryRoom().recoverLife(secondWinner);
                new RecoveryRoom().recoverLife(thirdWinner);
                new RecoveryRoom().recoverLife(fourthWinner);
            }
        } catch (HeroRecoverException e) {
            e.printStackTrace();
        }

        magistrate.saySemifinalsBattleBegin();

        //todo переписал ссылку это норм или лучше создать новый обьект?
        firstWinner = new Battle().fight(firstWinner, secondWinner);
        magistrate.sayWhoWinner(firstWinner);

        if (firstWinner != null) {
            firstWinner.triumphSpeech();
        }

        Warrior secondSemiWinner = new Battle().fight(thirdWinner, fourthWinner);
        magistrate.sayWhoWinner(secondSemiWinner);

        if (secondWinner != null) {
            secondSemiWinner.triumphSpeech();
        }

        magistrate.askForRecoverHeroesLife(firstWinner, secondSemiWinner);
        Boolean answerBeforeFinalFight;

        try {
            answerBeforeFinalFight = new RecoveryRoom().askForHeroRecover(new RecoveryRoom().enterAnswer());
            if (answerBeforeFinalFight) {
                new RecoveryRoom().recoverLife(firstWinner);
                new RecoveryRoom().recoverLife(secondSemiWinner);
            }
        } catch (HeroRecoverException e) {
            e.printStackTrace();
        }

        magistrate.sayReadyForBattle(firstWinner, secondSemiWinner);
        magistrate.sayBeginFinalBattle();

        Warrior champion = new Battle().fight(firstWinner, secondSemiWinner);

        magistrate.congratulationChampion(champion);

        if (champion != null) {
            champion.triumphSpeech();
        }
    }
}
