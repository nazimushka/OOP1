package sem4task4;

public class SiegeShield extends TowerShield{

    @Override
    public int punchDamage() {
        return 2;
    }

    @Override
    public int defence() {
        return 100;
    }

    @Override
    public String toString() {
        return "Мантелет: " + super.toString();
    }
}