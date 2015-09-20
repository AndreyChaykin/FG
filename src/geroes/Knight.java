package geroes;

import weathewear.Armour;
import skills.MalteseOrden;
import weapon.Weapon;

public class Knight extends Warrior {

//    private final String name = "John Milsrow";


    public Knight(String name, int life, int hit, Weapon weapon, Armour armor) {
        super(name, life, hit, weapon, armor);
    }

    @Override
    public void salutationSpeech() {
        System.out.println("\n- Lord, knight-errant  " + getName()+ " readiness to die for you!");
    }

    @Override
    public void triumphSpeech() {
        System.out.println(Knight.this.getClass().getSimpleName() + SPEECH + "Lord!");
    }

    @Override
    public int superSkill(Warrior opponent) {
        System.out.println("- Gran Master and Maltese Order will pray for my victory!");
        MalteseOrden malteseOrden = new MalteseOrden();
        malteseOrden.printAction();
        int lifepoints = opponent.getActualLife() - malteseOrden.getDamage();
        System.out.println("Knight skill hit " + malteseOrden.getDamage() + " damage.");
        return lifepoints;
    }
}
