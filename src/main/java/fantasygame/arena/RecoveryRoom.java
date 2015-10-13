package fantasygame.arena;

import fantasygame.exceptions.HeroRecoverException;
import fantasygame.hero.*;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class RecoveryRoom {

    private static final Logger LOG = Logger.getLogger(RecoveryRoom.class);
    //todo shall i make scanner like a class field to have a possibility to close him?

    public void recoverLife(Warrior warrior) {
        LOG.debug("Trying to recover hero life: " + warrior.getName() + ", actual life: " + warrior.getActualLife());
        if (warrior != null) {
            warrior.setActualLife(warrior.getFullLife());
            LOG.debug("Actual life after recovering: " + warrior.getActualLife());
        }
    }

    //todo close() fantasygame.exceptions in method  ---------------------------------------------------------
    public String enterAnswer() {
        System.out.println("Enter your answer(yes/no):");
        LOG.debug("Getting answer YES/NO");
        StringBuilder result = new StringBuilder(new Scanner(System.in).nextLine().toLowerCase());
        return result.toString();
    }

    public Boolean askForHeroRecover(String inputtedAnswer) throws HeroRecoverException {
        Boolean correctAnswer = true;
        Boolean result = false;
        LOG.debug("Check for hero recover with answer");
        while (correctAnswer) {
            if (inputtedAnswer.equals("yes") || inputtedAnswer.equals("y")) {
                result = true;
                LOG.debug("Answer is YES, return true");
                return result;
            } else if (inputtedAnswer.equals("no") || inputtedAnswer.equals("n")) {
                LOG.debug("Answer is NO, return false");
                return result;
            } else {
                System.out.println("Please, just say \"yes\" or \"no\"");
                LOG.debug("Incorrect answer. Asking for make choice.");
                inputtedAnswer = enterAnswer();
            }
        }
        LOG.warn("Throw HeroRecoverException: \"Can`t recover hero life.\"");
        throw new HeroRecoverException("Can`t recover hero life.");
    }
}
