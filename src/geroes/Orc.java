package geroes;

import weathewear.Armour;
import skills.OrcWolf;
import weapon.Weapon;

public class Orc extends Warrior {

    public Orc(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        System.out.println("Remember, when i`ll win = you set me free.");
    }

    @Override
    public void triumphSpeech() {
        System.out.println("It was easy! Next time i`ll come with my army, human!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        System.out.println("- My bound up varg, kill my enemy!");
        OrcWolf wolf = new OrcWolf();
        int lifeOpponent = opponent.getActualLife() - wolf.getDamage();
        wolf.printAction();
        System.out.println("Wolf hit " + wolf.getDamage() + " damage!");
        return lifeOpponent;
    }
}
