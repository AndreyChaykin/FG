package skills;

public class MalteseOrden implements Skill{

    @Override
    public void printAction() {
        System.out.println("Vivant omnes virgines\n" +
                "Graciles, formosae!\n" +
                "Vivant et mulieres\n" +
                "Tenerae, amabiles,\n" +
                "Bonae, laboriosae!"); //TODO latin song
        System.out.println("**Bright flash outshine sunlight!**");
    }

    @Override
    public int getDamage() {
        return SKILL;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(MalteseOrden.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
