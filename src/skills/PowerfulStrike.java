package skills;


public class PowerfulStrike implements Skill {

    private final int powerfulStrike = 450;

    @Override
    public void printAction() {
        System.out.println("**Troll pack opponent!**");
    }

    @Override
    public int getDamage() {
        return powerfulStrike;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(PowerfulStrike.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }
}
