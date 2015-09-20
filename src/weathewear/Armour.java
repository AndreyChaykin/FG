package weathewear;

public abstract class Armour {

    private int protection;

    public Armour(int protection) {
        this.protection = protection;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(Armour.this.getClass().getSimpleName().toLowerCase());
        return result.toString();
    }

}
