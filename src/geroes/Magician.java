package geroes;

import weathewear.Armour;
import skills.Necromancy;
import weapon.Weapon;

public class Magician extends Warrior {

    public Magician(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        System.out.println("- I will show you power of magic, my sovereign!");
    }

    @Override
    public void triumphSpeech() {
        System.out.println(Magician.this.getName() + SPEECH + "my sovereign!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        System.out.println("- " + opponent.getName() + ", you will hate the day, when you was born!");
        Necromancy necromancy = new Necromancy();
        necromancy.printAction();
        System.out.println("Zombies hit " + necromancy.getDamage() + " damage.");
        int lifepoints = opponent.getActualLife() - necromancy.getDamage();
        return lifepoints;
    }
}


