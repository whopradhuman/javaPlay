// inheritance
public class Evolution extends Warrior {
    public Evolution(String name, double health, double power, boolean evolve) {
        super(name, health, power);
        if(evolve) {
            this.power = this.power * 0.5;
            this.health = this.health * 1.5;
        }
    }
}
