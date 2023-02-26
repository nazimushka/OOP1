package sem4task4;

public class Comandor extends Warrior<Weapon, Shield> {

    public Comandor(String name, int healthpoint, Weapon weapon, Shield shield) {
        super(name, healthpoint, weapon, shield);
    }

    @Override
    public String toString() {
        return "Командир: " + super.toString();
    }
}