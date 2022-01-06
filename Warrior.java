public class Warrior implements reLive {
    protected String name = "Warrior";
    public double health = 100.0;
    public double power = 100.0;

    public Warrior() {

    }

    public Warrior(String name, double health, double power) {
        this.health = health;
        this.power = power;
        setName(name);
        restoreHealth(100.0);
    }

    public double attack() {
        return power * (3.0 / 20);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void restoreHealth(double health) {
        this.health = health;
    }
}
