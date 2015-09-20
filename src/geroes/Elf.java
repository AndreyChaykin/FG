package geroes;

import weathewear.Armour;
import skills.Dragon;
import weapon.Weapon;

public class Elf extends Warrior {

//    private final String name = "Leilasai Siera el Cree";

public Elf(String name, int life, int hit, Weapon weapon, Armour armor) {
    super(name, life, hit, weapon, armor);
}

    @Override
    public void salutationSpeech() {
        System.out.println("Sir, " + getName() + " wish you powerful hand and wise and far-sighted mind!");
    }

    @Override
    public void triumphSpeech() {
        System.out.println(Elf.this.getClass().getSimpleName() + " " + getName() + " " + SPEECH + "sir!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        Dragon dragon = new Dragon();
        System.out.println("- Tirion, come and burnout " + opponent.getClass().getSimpleName().toLowerCase() + "!");
        dragon.printAction();
        System.out.println("Elf`s dragon hit " + dragon.getDamage() + " damage.");
        int lifeOpponent = opponent.getActualLife() - dragon.getDamage();
        return lifeOpponent;
    }
}
