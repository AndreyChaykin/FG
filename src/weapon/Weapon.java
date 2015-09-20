package weapon;

/**
 * Created by Andrey on 29.08.2015.
 */
public abstract class Weapon {

    private int condition;  //todo condition weapon
    private int damage;

 public Weapon(int damage, int condition) {
     this.damage = damage;
     this.condition = condition;
 }

    public int getDamage(){
        return condition;
    }

    public int getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder(Weapon.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
