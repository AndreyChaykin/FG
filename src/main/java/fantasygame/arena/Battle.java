package fantasygame.arena;

import fantasygame.hero.Warrior;
import org.apache.log4j.Logger;

import static fantasygame.ClassNameUtil.getCurrentClassName;


public class Battle {

   private static final Logger LOG = Logger.getLogger(getCurrentClassName());

    public Warrior fight(Warrior firstWarrior, Warrior secondWarrior) {

        LOG.info("Fight begin: " + firstWarrior.getClass().getSimpleName() + " " + firstWarrior.getName() + " & "
                + secondWarrior.getClass().getSimpleName() + " " + secondWarrior.getName() + ".");

        if (firstWarrior == null){
            LOG.info("FirstWarrior " + firstWarrior.getName() + " is null, return secondWarrior " + secondWarrior.getName());
            return secondWarrior;
        } else if (secondWarrior == null){
            LOG.info("secondWarrior " + secondWarrior.getName() + " is null, return firstWarrior " + firstWarrior.getName());
            return firstWarrior;
        }

        while (firstWarrior.getActualLife() > 0 && secondWarrior.getActualLife() > 0) {
            if(LOG.isDebugEnabled()) {
                LOG.debug("Kick opponent while both life < 0 ");
            }
            firstWarrior.setActualLife(secondWarrior.kick(firstWarrior));
            secondWarrior.setActualLife(firstWarrior.kick(secondWarrior));

            if (firstWarrior.getActualLife() > 0 && secondWarrior.getActualLife() > 0) {
                firstWarrior.printLife();
                secondWarrior.printLife();
            }
            System.out.println();
        }

        if (firstWarrior.getActualLife() > 0 && secondWarrior.getActualLife() <= 0) {
            LOG.info("Warrior " + firstWarrior.getClass().getSimpleName() + " " + firstWarrior.getName() +
                    " win in this battle. Return winner.");
            return firstWarrior;
        } else if (secondWarrior.getActualLife() > 0) {
            LOG.info("Warrior " + secondWarrior.getClass().getSimpleName() + " " + secondWarrior.getName() +
                    " win in this battle. Return winner.");
            return secondWarrior;
        } else {
            LOG.info("No winner in this battle. Return null");
            return null;
        }
    }
}
