package sem4task4;

public class IronDoor extends TowerShield {

    @Override
    public int punchDamage() {
        return 5;
    }

    @Override
    public int defence() {
        return 80;
    }

    @Override
    public String toString() {
        return "Железная дверь: " + super.toString();
    }
}