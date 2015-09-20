package geroes;

import weathewear.Armour;
import skills.MountainSkill;
import weapon.Weapon;

public class Dwarf extends Warrior {

    //    private final String name = "Ergot Beergont";
//    private final int hit = 26;
//    private int life =
    private final int skill = 23;


    public Dwarf(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }


    @Override
    public void salutationSpeech() {
        System.out.println("\n- Master, dwarf " + getName() + " will bring you Glory!");
    }

    @Override
    public void triumphSpeech() {
        System.out.println("- " + getName() + SPEECH + "master");
    }

    @Override
    public int superSkill(Warrior opponent) {
        MountainSkill mountainSkill = new MountainSkill();
        System.out.println("- Mountain power!");
        mountainSkill.printAction();
        System.out.println("Dwarf skill hit " + mountainSkill.getDamage() + " damage.");
        int lifeOpponent = opponent.getActualLife() - mountainSkill.getDamage();
        return lifeOpponent;
    }
}
