package geroes;

import weathewear.Armour;
import skills.PowerfulStrike;
import weapon.Weapon;

import java.util.Random;

public class Troll extends Warrior {

    public Troll(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        System.out.println("I ama gonna eating you after when i ama killing you!" +
                " U am understanding me what a saying to you!");
    }

    @Override
    public void triumphSpeech() {
        System.out.println("Whose gonna fight weez me more?!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        int lifeOpponent = opponent.getActualLife();
        PowerfulStrike strike = new PowerfulStrike();

        System.out.println("- Do move not! I wanna sktricken you understandt!");

        int number = new Random().nextInt(3);
        if (number == 2) {
            lifeOpponent -= strike.getDamage();
            strike.printAction();
            System.out.println("Troll hit " + strike.getDamage() + " damage!");
            return lifeOpponent;
        } else {
            System.out.println("Troll miss!");
            System.out.println("Troll hit " + 0 + " damage!");
            return lifeOpponent;
        }
    }
}
