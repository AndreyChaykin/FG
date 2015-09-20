package skills;

/**
 * Created by Деркач on 09.09.15.
 */
public class Necromancy implements Skill {

    @Override
    public void printAction() {
        System.out.println("**Zombies is coming out from the grave and destroy everything on their way!**");
    }

    @Override
    public int getDamage() {
        return SKILL;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Necromancy.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
