package skills;

public class Darkenes implements Skill {

    @Override
    public int getDamage() {
        return SKILL;
    }

    @Override
    public void printAction() {
        System.out.println("**Cloud darkened the skies, strong wind gust!**");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Darkenes.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
