package skills;

public class Dragon implements Skill {

    @Override
    public int getDamage() {
        return SKILL;
    }

    @Override
    public void printAction() {
        System.out.println("**Gold dragon striking magic flame around elf!");
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Dragon.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
