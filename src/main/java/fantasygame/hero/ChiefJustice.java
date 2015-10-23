package fantasygame.hero;

import org.apache.log4j.Logger;

import java.util.List;

import static fantasygame.ClassNameUtil.getCurrentClassName;

public class ChiefJustice {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public void salutationSpeech() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Salutation speech before game.");
        }
        System.out.println("Viva, user! Select first pair of valiance and let the show begin!");
    }

    public void askingForMakeChoice() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Asking user to make choice.");
        }
        System.out.println("\nLord, choice fantasygame.hero(1 - dwarf, 2 - elf, 3 - knight," +
                " 4 - magician, 5 - orc, 6 - troll, 7 - centaurus, 8 = chimera): ");
    }

    public void welcomeHero(Warrior warrior) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Welcome hero " + warrior.getClass().getSimpleName().toLowerCase() + " " + warrior.getName());
        }
        System.out.println("\nLet`s welcome " + warrior.getClass().getSimpleName().toLowerCase() + " " + warrior.getName() + "!");
    }

    public void printHeroWeaponAndArmour(Warrior warrior) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Print hero weapon " + warrior.getWeapon() + " and armour " + warrior.getArmour());
        }
        System.out.println(warrior.getClass().getSimpleName() + " chose " + warrior.getArmour() +
                " and " + warrior.getWeapon() + "!");
    }

    public void sayReadyForBattle(Warrior firstWarrior, Warrior secondWarrior) {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Trying to say who ready for battle.");
        }
        if (firstWarrior != null && secondWarrior != null) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Saying hero " + firstWarrior.getName() + " and " +
                        secondWarrior.getName() + " are ready for battle.");
            }
            System.out.println("\nLord, warriors " + firstWarrior.getClass().getSimpleName().toLowerCase() +
                    " " + firstWarrior.getName() + " and " + secondWarrior.getClass().getSimpleName().toLowerCase() +
                    " " + secondWarrior.getName() + " are ready for battle!");
        } else if (firstWarrior == null && secondWarrior == null) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Saying no hero ready for fight.");
            }
            System.out.println("No heroes for fight!");
        } else {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Saying only one hero ready for battle.");
            }
            System.out.println("There is just one hero ready for battle.");
        }
    }

    public void sayBeginBattle(Warrior firstWarrior, Warrior secondWarrior) {
        if (firstWarrior != null && secondWarrior != null) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Saying lets begin fight.");
            }
            System.out.println("\nLets fight!\n");
        } else {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Saying there is no warriors for a fight.");
            }
            System.out.println("There is no warriors for the battle!");
        }
    }

    public void saySemifinalsBattleBegin() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Saying let`s semifinals battle begin.");
        }
        System.out.println("\nLet`s semifinals battle begin!\n");
    }

    public void sayBeginFinalBattle() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Saying let`s final battle begin.");
        }
        System.out.println("\nLets final battle begin!\n");
    }

    public void sayWhoWinner(Warrior warrior) {
        if (warrior != null) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Saying winner is " + warrior.getName());
            }
            System.out.println("Winner is " + warrior.getName() + "!");
        } else {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Saying there is no winners after fight.");
            }
            System.out.println("There is no winner! Both heroes die!");
        }
    }

    public void congratulationChampion(Warrior champion) {
        if (champion != null) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Congratulation champion " + champion);
            }
            System.out.println("The champion is " + champion.getClass().getSimpleName().toLowerCase() + " "
                    + champion.getName() + "!");
            System.out.println("\nCongratulation, " + champion.getName() + ", Gods was on your side!");
        } else {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Saying there is no champion after this battle.");
            }
            System.out.println("Lord, there is no warriors in the final battle!\n" +
                    "All your characters were full of courage and dementia!");
        }
    }

    public void askForRecoverHeroesLife() {
        if(LOG.isDebugEnabled()) {
            LOG.debug("Asking for recover heroes life.");
        }
        System.out.println("Lord, your winners are tired. Will you give them time to relax and recover their life`s?");
    }

    public void askForRecoverHeroesLife(List<Warrior> warriors) {

        if (warriors.isEmpty()) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Saying both hero die.");
            }
            System.out.println("Lord, all heroes died. There is cant be winners in mortal combats...Only losers...");
        } else if (warriors.size() == 1) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Saying only one hero left.");
            }
            System.out.println("Lord, only " + warriors.get(0).getClass().getSimpleName().toLowerCase() + " survived. " +
                    "All others heroes died... ");
        } else {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Saying how much life have warriors.");
            }
            System.out.println("\nLord, at this moment " + warriors.get(0).getClass().getSimpleName().toLowerCase() + " have " +
                    warriors.get(0).getActualLife() + " lifepoints, " +
                    "and " + warriors.get(1).getClass().getSimpleName().toLowerCase() + " have " +
                    warriors.get(1).getActualLife() + " lifepoints.");
            if(LOG.isDebugEnabled()) {
                LOG.debug("Asking for recover warriors life.");
            }
            System.out.println("Wish you give them chance to relax and recover?");
        }
    }
}

