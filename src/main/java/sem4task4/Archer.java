package sem4task4;

public class Archer extends Warrior<Bow, RoundedShield>{

    public Archer(String name, int healthpoint, Bow bow, RoundedShield shield) {
        super(name, healthpoint, bow, shield);
    }

    @Override
    public String toString() {
        return "Лучник: "+super.toString();
    }
}