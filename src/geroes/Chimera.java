package geroes;

import weathewear.Armour;
import skills.Darkenes;
import weapon.Weapon;

public class Chimera extends Warrior {

    public Chimera(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        System.out.println("Thank you for given me chance to kill pshshshshsh");
    }

    @Override
    public void triumphSpeech() {
        System.out.println("Giffff me somebody more!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        System.out.println("- Now you wil die!Feel the power of darkness!");
        Darkenes darkenes = new Darkenes();
        darkenes.printAction();
        int lifepoint = opponent.getActualLife() - darkenes.getDamage();
        System.out.println("Chimera hit " + darkenes.getDamage() + " damage!");
        return lifepoint;
    }


}
