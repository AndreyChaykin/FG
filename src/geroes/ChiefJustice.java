package geroes;

public class ChiefJustice {

    public void salutationSpeech() {
        System.out.println("Viva, user! Select first pair of valiants and let the show begin!");
    }

    public void askingForMakeChoice() {
        System.out.println("\nLord, choice hero(1 - dwarf, 2 - elf, 3 - knight," +
                " 4 - magician, 5 - orc, 6 - troll, 7 - centaurus, 8 = chimera): ");
    }

    public void welcomeHero(Warrior warrior) {
        System.out.println("\nLet`s welcome " + warrior.getClass().getSimpleName().toLowerCase() + " " + warrior.getName() + "!");
    }

    public void printHeroWeaponAndArmour(Warrior warrior) {
        System.out.println(warrior.getClass().getSimpleName() + " chose " + warrior.getArmour() +
                " and " + warrior.getWeapon() + "!");
    }

    public void sayReadyForBattle(Warrior firstWarrior, Warrior secondWarrior) {
        if (firstWarrior != null && secondWarrior != null) {
            System.out.println("\nLord, warriors " + firstWarrior.getClass().getSimpleName().toLowerCase() +
                    " " + firstWarrior.getName() + " and " + secondWarrior.getClass().getSimpleName().toLowerCase() +
                    " " + secondWarrior.getName() + " are ready for battle!");
        } else if(firstWarrior == null && secondWarrior == null) {
            System.out.println("No heroes for fight!");
        } else {
            System.out.println("There is just one hero ready for battle.");
        }
    }

    public void sayBeginBattle(Warrior firstWarrior, Warrior secondWarrior) {
       if (firstWarrior != null && secondWarrior != null) {
           System.out.println("\nLets fight!\n");
       }
    }

    public void saySemifinalsBattleBegin() {
        System.out.println("\nLets semifinals battle begin!\n");
    }

    public void sayBeginFinalBattle() {
        System.out.println("\nLets final battle begin!\n");
    }

    public void sayWhoWinner(Warrior warrior) {
        if (warrior != null) {
            System.out.println("Winner is " + warrior.getName() + "!");
        } else {
            System.out.println("There is no winner! Both heroes die!");
        }
    }

    public void congratulationChampion(Warrior champion) {
        if (champion != null) {
            System.out.println("The champion is " + champion.getClass().getSimpleName().toLowerCase() + " "
                    + champion.getName() + "!");
            System.out.println("\nCongratulation, " + champion.getName() + ", Gods was on your side!");
        } else {
            System.out.println("Lord, there is no warriors in the final battle!\n" +
                    "All your characters were full of courage and dementia!");
        }
    }

    //todo @overload?
    public void askForRecoverHeroesLife() {
        System.out.println("Lord, your winners are tired. Will you give them time to relax and recover their life`s?");
    }

    public void askForRecoverHeroesLife(Warrior firstWarrior, Warrior secondWarrior) {
        if (firstWarrior != null && secondWarrior != null) {
            System.out.println("\nLord, at this moment " + firstWarrior.getClass().getSimpleName().toLowerCase() + " have " +
                    firstWarrior.getActualLife() + " lifepoints, " +
                    "and " + secondWarrior.getClass().getSimpleName().toLowerCase() + " have " +
                    secondWarrior.getActualLife() + " lifepoints.");
            System.out.println("Wish you give them chance to relax and recover?");
        } else if (firstWarrior != null && secondWarrior == null) {
            System.out.println("Lord, only one " + firstWarrior.getClass().getSimpleName().toLowerCase() + " survived. " +
                    "All others heroes died... ");
        } else if (firstWarrior == null && secondWarrior != null) {
            System.out.println("Lord, only one " + secondWarrior.getClass().getSimpleName().toLowerCase() + " survived. " +
                    "All others heroes died... ");
        } else {
            System.out.println("Lord, all heroes died. There is cant be winners in mortal combats...Only losers...");
        }
    }


}
