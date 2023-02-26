package sem4task4;

public abstract class RoundedShield implements Shield {
    public abstract int parry();

    @Override
    public String toString() {
        return String.format("Защита %d  вероятность парирования %d", defence(), parry());
    }
}