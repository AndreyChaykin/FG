package fantasygame.arena;

import fantasygame.exceptions.HeroRecoverException;
import fantasygame.hero.*;
import org.apache.log4j.Logger;

import java.util.List;
import java.util.Scanner;
import static fantasygame.ClassNameUtil.getCurrentClassName;

public class RecoveryRoom {

    private static final Logger LOG = Logger.getLogger(getCurrentClassName());
    //todo shall i make scanner like a class field to have a possibility to close him?

    public void recoverLife(Warrior warrior) {
        LOG.info("Trying to recover hero life: " + warrior.getName() + ", actual life: " + warrior.getActualLife());
        if (warrior != null) {
            warrior.setActualLife(warrior.getFullLife());
            LOG.debug("Actual life after recovering: " + warrior.getActualLife());
        }
    }

    public static void recoverHeroLife(List<Warrior> warriors) {
        Boolean answer;
        try {
            LOG.info("Trying to recover heroes life");
            answer = new RecoveryRoom().askForHeroRecover(new RecoveryRoom().enterAnswer());
            if (answer) {
                for (int i = 0; i < warriors.size(); i++) {
                    if (warriors.get(i) != null) {
                        if(LOG.isDebugEnabled()) {
                            LOG.debug("Warrior " + warriors.get(i).getName() + " has " + warriors.get(i).getActualLife() + " lifepoints.");
                        }
                        warriors.get(i).setActualLife(warriors.get(i).getFullLife());
                            LOG.info("Warrior " + warriors.get(i).getName() + "has full life after recovering: " + warriors.get(i).getActualLife());
                    }
                }
            }
            LOG.info("Answer was NO. Life is not recovered.");
        } catch (HeroRecoverException e) {
            LOG.error("Can`t recover heroes life, ", e);
            e.printStackTrace();
        }
    }

    //todo close() fantasygame.exceptions in method  ---------------------------------------------------------
    public String enterAnswer() {
        System.out.println("Enter your answer(yes/no):");
        if(LOG.isDebugEnabled()) {
            LOG.debug("Trying to get answer YES/NO");
        }
        StringBuilder result = new StringBuilder(new Scanner(System.in).nextLine().toLowerCase());
        return result.toString();
    }

    public Boolean askForHeroRecover(String inputtedAnswer) throws HeroRecoverException {
        Boolean correctAnswer = true;
        Boolean result = false;
        if(LOG.isDebugEnabled()) {
            LOG.debug("Ask to recover hero life with answer " + inputtedAnswer);
        }
        while (correctAnswer) {
            if (inputtedAnswer.equals("yes") || inputtedAnswer.equals("y")) {
                result = true;
                if(LOG.isDebugEnabled()) {
                    LOG.debug("Answer is YES, return true");
                }
                return result;
            } else if (inputtedAnswer.equals("no") || inputtedAnswer.equals("n")) {
                if(LOG.isDebugEnabled()) {
                    LOG.debug("Answer is NO, return false");
                }
                return result;
            } else {
                System.out.println("Please, just say \"yes\" or \"no\"");
                if(LOG.isDebugEnabled()) {
                    LOG.debug("Incorrect answer. Asking for make choice again.");
                }
                inputtedAnswer = enterAnswer();
            }
        }
        LOG.error("Throw HeroRecoverException: \"Can`t recover hero life.\"");
        throw new HeroRecoverException("Can`t recover hero life.");
    }
}
