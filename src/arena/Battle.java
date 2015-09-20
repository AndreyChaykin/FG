package arena;

import geroes.*;

public class Battle {

    public Warrior fight(Warrior firstWarrior, Warrior secondWarrior) {
        if (firstWarrior == null){
            return secondWarrior;
        } else if (secondWarrior == null){
            return firstWarrior;
        }

        while (firstWarrior.getActualLife() > 0 && secondWarrior.getActualLife() > 0) {
            firstWarrior.setActualLife(secondWarrior.kick(firstWarrior));
            secondWarrior.setActualLife(firstWarrior.kick(secondWarrior));

            if (firstWarrior.getActualLife() > 0 && secondWarrior.getActualLife() > 0) {
                firstWarrior.printLife();
                secondWarrior.printLife();
            }
            System.out.println();
        }

        if (firstWarrior.getActualLife() > 0) {
            return firstWarrior;
        } else if (secondWarrior.getActualLife() > 0) {
            return secondWarrior;
        } else {
            return null;
        }
    }
}
