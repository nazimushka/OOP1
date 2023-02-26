package sem4task4;

public abstract class TowerShield implements Shield {
    public abstract int punchDamage();

    @Override
    public String toString() {
        return String.format("Защита %d  урон удара щитом %d", defence(), punchDamage());
    }
}
