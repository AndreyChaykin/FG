package skills;

/**
 * Created by Andrey on 10.09.2015.
 */
public class DionysusMadness implements Skill {

    @Override
    public int getDamage() {
        return SKILL;
    }

    @Override
    public void printAction() {
        System.out.println("Thunder is heard everywhere! Lightning fly overhead! The enemy looses his mind");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(DionysusMadness.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
