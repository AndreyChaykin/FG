package arena;

import exceptions.HeroRecoverException;
import geroes.*;
import java.util.Scanner;

public class RecoveryRoom {

    public void recoverLife(Warrior warrior) {
        if (warrior != null) {
            warrior.setActualLife(warrior.getFullLife());
        }
    }

    public String enterAnswer() {
        System.out.println("Enter your answer(yes/no):");
        StringBuilder result = new StringBuilder(new Scanner(System.in).nextLine().toLowerCase());
        return result.toString();
    }

    public Boolean askForHeroRecover(String inputtedAnswer) throws HeroRecoverException {
        Boolean correctAnswer = true;
        Boolean result = false;
        Scanner scanner = new Scanner(System.in);

        while (correctAnswer) {
            if (inputtedAnswer.equals("yes") || inputtedAnswer.equals("y")) {
                result = true;
                return result;
            } else if (inputtedAnswer.equals("no") || inputtedAnswer.equals("n")) {
                return result;
            } else {
                System.out.println("Please, just say \"yes\" or \"no\"");
                inputtedAnswer = enterAnswer();
            }
        }
        throw new HeroRecoverException("Can`t recover hero life.");
    }
}
