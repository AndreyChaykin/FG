package skills;

/**
 * Created by Деркач on 09.09.15.
 */
public class OrcWolf implements Skill {


    @Override
    public void printAction() {
        System.out.println("**Varg dirtily punish from the blindside of the opponent!**");
    }

    @Override
    public int getDamage() {
        return SKILL;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(OrcWolf.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
