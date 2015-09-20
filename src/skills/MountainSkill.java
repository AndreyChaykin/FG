package skills;

public class MountainSkill implements Skill {



    @Override
    public int getDamage() {
        return SKILL  ;
    }

    @Override
    public void printAction() {
        System.out.println("**The snowbreak crack down on the head of dwarf opponent!**");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(MountainSkill.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }

}
