package fantasygame.hero;

import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class ChiefJustice {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public void salutationSpeech(){
        LOG.debug("Salutation speech before game.");
        System.out.println("Viva, user! Select first pair of valiance and let the show begin!");
    }

    public void askingForMakeChoice() {
        LOG.debug("Asking for make choice.");
        System.out.println("\nLord, choice fantasygame.hero(1 - dwarf, 2 - elf, 3 - knight," +
                " 4 - magician, 5 - orc, 6 - troll, 7 - centaurus, 8 = chimera): ");
    }

    public void welcomeHero(Warrior warrior) {
        LOG.debug("Welcome hero.");
        System.out.println("\nLet`s welcome " + warrior.getClass().getSimpleName().toLowerCase() + " " + warrior.getName() + "!");
    }

    public void printHeroWeaponAndArmour(Warrior warrior) {
        LOG.debug("Print hero weapon and armour.");
        System.out.println(warrior.getClass().getSimpleName() + " chose " + warrior.getArmour() +
                " and " + warrior.getWeapon() + "!");
    }

    public void sayReadyForBattle(Warrior firstWarrior, Warrior secondWarrior) {
        LOG.debug("Trying to say who ready for battle.");
        if (firstWarrior != null && secondWarrior != null) {
            LOG.debug("Saying both hero ready for battle.");
            System.out.println("\nLord, warriors " + firstWarrior.getClass().getSimpleName().toLowerCase() +
                    " " + firstWarrior.getName() + " and " + secondWarrior.getClass().getSimpleName().toLowerCase() +
                    " " + secondWarrior.getName() + " are ready for battle!");
        } else if (firstWarrior == null && secondWarrior == null) {
            LOG.debug("Sayint no hero ready for fight.");
            System.out.println("No heroes for fight!");
        } else {
            LOG.debug("Saying only one hero ready for battle.");
            System.out.println("There is just one hero ready for battle.");
        }
    }

    public void sayBeginBattle(Warrior firstWarrior, Warrior secondWarrior) {
        if (firstWarrior != null && secondWarrior != null) {
            LOG.debug("Saying lets begin fight.");
            System.out.println("\nLets fight!\n");
        } else {
            LOG.debug("Saying no warriors for fight.");
            System.out.println("There is no warriors for the battle!");
        }
    }

    public void saySemifinalsBattleBegin() {
        LOG.debug("Saying semifinals battle begin.");
        System.out.println("\nLets semifinals battle begin!\n");
    }

    public void sayBeginFinalBattle() {
        LOG.debug("Saying final battle begin.");
        System.out.println("\nLets final battle begin!\n");
    }

    public void sayWhoWinner(Warrior warrior) {
        if (warrior != null) {
            LOG.debug("Saying who winner.");
            System.out.println("Winner is " + warrior.getName() + "!");
        } else {
            LOG.debug("Saying no winners in the fight.");
            System.out.println("There is no winner! Both heroes die!");
        }
    }

    public void congratulationChampion(Warrior champion) {
        if (champion != null) {
            LOG.debug("Congratulation champion " + champion);
            System.out.println("The champion is " + champion.getClass().getSimpleName().toLowerCase() + " "
                    + champion.getName() + "!");
            System.out.println("\nCongratulation, " + champion.getName() + ", Gods was on your side!");
        } else {
            LOG.debug("Saying there is no champion in this battle.");
            System.out.println("Lord, there is no warriors in the final battle!\n" +
                    "All your characters were full of courage and dementia!");
        }
    }

    public void askForRecoverHeroesLife() {
        LOG.debug("Asking for recover heroes life.");
        System.out.println("Lord, your winners are tired. Will you give them time to relax and recover their life`s?");
    }

    public void askForRecoverHeroesLife(Warrior firstWarrior, Warrior secondWarrior) {
        if (firstWarrior != null && secondWarrior != null) {
            LOG.debug("Say how much life have warriors.");
            System.out.println("\nLord, at this moment " + firstWarrior.getClass().getSimpleName().toLowerCase() + " have " +
                    firstWarrior.getActualLife() + " lifepoints, " +
                    "and " + secondWarrior.getClass().getSimpleName().toLowerCase() + " have " +
                    secondWarrior.getActualLife() + " lifepoints.");
            LOG.debug("Asking for recover warriors life.");
            System.out.println("Wish you give them chance to relax and recover?");
        } else if (firstWarrior != null && secondWarrior == null) {
            LOG.debug("Saying only one hero left.");
            System.out.println("Lord, only one " + firstWarrior.getClass().getSimpleName().toLowerCase() + " survived. " +
                    "All others heroes died... ");
        } else if (firstWarrior == null && secondWarrior != null) {
            LOG.debug("Saying only one hero left.");
            System.out.println("Lord, only one " + secondWarrior.getClass().getSimpleName().toLowerCase() + " survived. " +
                    "All others heroes died... ");
        } else {
            LOG.debug("Saying both hero die.");
            System.out.println("Lord, all heroes died. There is cant be winners in mortal combats...Only losers...");
        }
    }
}

