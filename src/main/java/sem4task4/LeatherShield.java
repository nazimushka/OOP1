package sem4task4;

public class LeatherShield extends RoundedShield{

    @Override
    public int parry() {
        return 30;
    }

    @Override
    public int defence() {
        return 45;
    }

    @Override
    public String toString() {
        return "Кожаный щит: "+super.toString();
    }
}