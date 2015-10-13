package fantasygame.arena;

import fantasygame.hero.Warrior;
import org.apache.log4j.Logger;


public class Battle {

   private static final Logger LOG = Logger.getLogger(fantasygame.arena.Battle.class);

    public Warrior fight(Warrior firstWarrior, Warrior secondWarrior) {
        LOG.info("fight begin: " + firstWarrior.getName() + " & " + secondWarrior.getName());
        if (firstWarrior == null){
            LOG.info("firstWarrior is null, return secondWarrior " + secondWarrior.getName());
            return secondWarrior;
        } else if (secondWarrior == null){
            LOG.info("secondWarrior is null, return firstWarrior " + firstWarrior.getName());
            return firstWarrior;
        }

        while (firstWarrior.getActualLife() > 0 && secondWarrior.getActualLife() > 0) {
            LOG.debug("Kick opponent while both life < 0 ");
            firstWarrior.setActualLife(secondWarrior.kick(firstWarrior));
            secondWarrior.setActualLife(firstWarrior.kick(secondWarrior));

            if (firstWarrior.getActualLife() > 0 && secondWarrior.getActualLife() > 0) {
                firstWarrior.printLife();
                secondWarrior.printLife();
            }
            System.out.println();
        }

        if (firstWarrior.getActualLife() > 0) {
            LOG.info("FirstWarrior win in the battle: " + firstWarrior.getName());
            return firstWarrior;
        } else if (secondWarrior.getActualLife() > 0) {
            LOG.info("secondWarrior win in the battle: " + secondWarrior.getName());
            return secondWarrior;
        } else {
            LOG.info("No winners. Return null");
            return null;
        }
    }
}
