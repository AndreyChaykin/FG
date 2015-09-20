package geroes;

import weathewear.Armour;
import skills.DionysusMadness;
import weapon.Weapon;

public class Centaur extends Warrior {

    public Centaur(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        System.out.println("The stars promise me luck!");
    }

    @Override
    public void triumphSpeech() {
        System.out.println("Viva overlord Dionysus! " + Centaur.this.getName().toLowerCase() + SPEECH + "lord!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        System.out.println("- Dionysus, help me!");
        DionysusMadness madness = new DionysusMadness();
        madness.printAction();
        int lifepoints = opponent.getActualLife() - madness.getDamage();
        System.out.println("Dionysus hit " + madness.getDamage() + " damage!");
        return lifepoints;
    }
}
